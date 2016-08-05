package com.everis.ideaton.service;

import com.everis.ideaton.domain.Image;
import com.everis.ideaton.repository.MongoImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {

    @Autowired
    private MongoImageRepository mongoImageRepository;

    @Override
    public List<Image> getAllImages() throws RuntimeException {
        return mongoImageRepository.findAll();
    }

    @Override
    public Image getImageById(BigInteger id) throws RuntimeException {
        return mongoImageRepository.findOne(id);
    }

    @Override
    public Image saveImage(Image image) throws RuntimeException {
        mongoImageRepository.save(image);
        return mongoImageRepository.findOne(image.getId());
    }

    @Override
    public boolean deleteImage(BigInteger id) throws RuntimeException {
         mongoImageRepository.delete(id);
        return true;
    }

    @Override
    public Image updateImage(Image image) throws RuntimeException {
        return mongoImageRepository.save(image);
    }
}
