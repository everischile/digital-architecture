package com.everis.ideaton.service;

import com.everis.ideaton.domain.Image;
import com.everis.ideaton.domain.dto.ImageDto;

import java.util.List;

public interface ImageService {

    public List<Image> getAllImages() throws RuntimeException;

    public Image getImageById(String id) throws RuntimeException;

    public Image saveImage(ImageDto imageDtp) throws RuntimeException;

    public boolean deleteImage(String id) throws RuntimeException;

    public Image updateImage(ImageDto imageDto) throws RuntimeException;
}
