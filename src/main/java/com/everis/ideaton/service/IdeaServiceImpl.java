package com.everis.ideaton.service;

import com.everis.ideaton.domain.*;
import com.everis.ideaton.domain.dto.*;
import com.everis.ideaton.repository.MongoIdeaRepository;
import com.everis.ideaton.repository.MongoUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
@Slf4j
public class IdeaServiceImpl implements IdeaService {

    private final MongoIdeaRepository mongoIdeaRepository;

    private final MongoUserRepository mongoUserRepository;

    @Autowired
    public IdeaServiceImpl(MongoIdeaRepository mongoIdeaRepository, MongoUserRepository mongoUserRepository) {
        this.mongoIdeaRepository = mongoIdeaRepository;
        this.mongoUserRepository = mongoUserRepository;
    }

    @Override
    public List<Idea> getAllIdeas() throws RuntimeException {
        return mongoIdeaRepository.findAll();
    }

    @Override
    public Idea getIdeaById(String id) throws RuntimeException {
        return mongoIdeaRepository.findOne(id);
    }

    @Override
    public Idea saveIdea(IdeaDto ideaDto) throws RuntimeException {

        User user = new User();

        try {
             user = mongoUserRepository.findOne(ideaDto.getUploadedById());
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        Idea idea = Idea.builder().title(ideaDto.getTitle()).description(ideaDto.getDescription())
                .category(ideaDto.getCategory()).uploadedBy(user).build();
        return mongoIdeaRepository.save(idea);
    }

    @Override
    public boolean deleteIdea(String id) throws RuntimeException {
        mongoIdeaRepository.delete(id);
        return true;
    }

    @Override
    public Idea updateIdea(IdeaDto ideaDto) throws RuntimeException {
        return saveIdea(ideaDto);
    }

    @Override
    public Idea addImage(ImageDto imageDto, String ideaId) throws RuntimeException {
        // validate the amount of images. Put a limit
        Idea idea = mongoIdeaRepository.findOne(ideaId);
        List<Image> images = idea.getImages();
        Image image = Image.builder().link(imageDto.getLink()).build();
        images.add(image);
        Idea ideaToSave = getIdea(idea, images, null, null, null, 0);

        return mongoIdeaRepository.save(ideaToSave);
    }

    @Override
    public Idea addVideo(VideoDto videoDtoeo, String ideaId) {
        // validate the amount of images. Put a limit
        Idea idea = mongoIdeaRepository.findOne(ideaId);
        Video video = Video.builder().link(videoDtoeo.getLink()).build();
        Idea ideaToSave = getIdea(idea, null, video, null, null, 0);

        return mongoIdeaRepository.save(ideaToSave);
    }

    @Override
    public Idea giveALike(LikeDto likeDto, String ideaId) {
        Idea idea = mongoIdeaRepository.findOne(ideaId);
        User user = mongoUserRepository.findOne(likeDto.getUserId());

        List<Like> likes = idea.getLikes();
        Like like = Like.builder().user(user).votedWith(likeDto.getVotedWith()).build();
        likes.add(like);

        Idea ideaToSave = getIdea(idea, null, null, likes, null, idea.getTotalVotes() + 1);

        return mongoIdeaRepository.save(ideaToSave);
    }

    @Override
    public Idea postCommentary(CommentaryDto commentaryDto, String ideaId) {
        Idea idea = mongoIdeaRepository.findOne(ideaId);
        User user = mongoUserRepository.findOne(commentaryDto.getPostedByUserId());

        List<Commentary> comments = idea.getComments();
        Commentary commentary = Commentary.builder().date(new SimpleDateFormat().toString()).postedBy(user)
                .text(commentaryDto.getText()).build();
        comments.add(commentary);

        Idea ideaToSave = getIdea(idea, null, null, null, comments, 0);

        return mongoIdeaRepository.save(ideaToSave);
    }

    @Override
    public int getTotalAmountLikes(String ideaId) {
        return mongoIdeaRepository.findOne(ideaId).getTotalVotes();
    }

    private Idea getIdea(Idea idea, List<Image> images, Video video, List<Like> likes, List<Commentary> commentaries,int totalVotes) {
        if(images == null) images = idea.getImages();
        if(video == null) video = idea.getVideo();
        if(likes == null) likes = idea.getLikes();
        if(commentaries == null) commentaries = idea.getComments();
        if(totalVotes == 0) totalVotes = idea.getTotalVotes();

        return Idea.builder().id(idea.getId()).title(idea.getTitle()).description(idea.getDescription())
                .category(idea.getCategory()).uploadedBy(idea.getUploadedBy()).video(video).images(images)
                .likes(likes).state(idea.getState()).date(idea.getDate()).comments(commentaries)
                .totalVotes(totalVotes).build();
    }

}
