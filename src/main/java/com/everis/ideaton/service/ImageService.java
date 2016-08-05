package com.everis.ideaton.service;

import com.everis.ideaton.domain.Image;

import java.math.BigInteger;
import java.util.List;

public interface ImageService {

    public List<Image> getAllImages() throws RuntimeException;

    public Image getImageById(BigInteger id) throws RuntimeException;

    public Image saveImage(Image image) throws RuntimeException;

    public boolean deleteImage(BigInteger id) throws RuntimeException;

    public Image updateImage(Image image) throws RuntimeException;
}
