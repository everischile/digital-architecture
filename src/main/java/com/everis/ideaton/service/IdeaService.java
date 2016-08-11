package com.everis.ideaton.service;

import com.everis.ideaton.domain.Idea;
import com.everis.ideaton.domain.dto.*;

import java.util.List;

public interface IdeaService {

    List<Idea> getAllIdeas() throws RuntimeException;

    Idea getIdeaById(String id) throws RuntimeException;

    Idea saveIdea(IdeaDto idea) throws RuntimeException;

    boolean deleteIdea(String id) throws RuntimeException;

    Idea updateIdea(IdeaDto idea) throws RuntimeException;

    Idea addImage(ImageDto imageDto, String ideaId) throws RuntimeException;

    Idea addVideo(VideoDto videoDtoeo, String ideaId);

    Idea giveALike(LikeDto likeDto, String ideaId);

    Idea postCommentary(CommentaryDto commentaryDto, String ideaId);

    int getTotalAmountLikes(String ideaId);
}
