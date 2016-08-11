package com.everis.ideaton.service.types;

import com.everis.ideaton.domain.Video;
import com.everis.ideaton.domain.dto.VideoDto;
import com.everis.ideaton.repository.MongoVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VideoServiceImpl implements VideoService {

    private final MongoVideoRepository mongoVideoRepository;

    @Autowired
    public VideoServiceImpl(MongoVideoRepository mongoVideoRepository) {
        this.mongoVideoRepository = mongoVideoRepository;
    }


    @Override
    public List<Video> getAllVideos() throws RuntimeException {
        return mongoVideoRepository.findAll();
    }

    @Override
    public Video getVideoById(String id) throws RuntimeException {
        return mongoVideoRepository.findOne(id);
    }

    @Override
    public Video saveVideo(VideoDto videoDto) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean deleteVideo(String id) throws RuntimeException {
        mongoVideoRepository.delete(id);
        return true;
    }

    @Override
    public Video updateVideo(VideoDto videoDto) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
