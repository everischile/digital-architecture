package com.everis.ideaton.service.types;

import com.everis.ideaton.domain.Video;
import com.everis.ideaton.domain.dto.VideoDto;

import java.util.List;

public interface VideoService {

    public List<Video> getAllVideos() throws RuntimeException;

    public Video getVideoById(String id) throws RuntimeException;

    public Video saveVideo(VideoDto videoDto) throws RuntimeException;

    public boolean deleteVideo(String id) throws RuntimeException;

    public Video updateVideo(VideoDto videoDto) throws RuntimeException;
}
