package com.everis.ideaton.service;

import com.everis.ideaton.domain.Image;
import com.everis.ideaton.domain.dto.ImageDto;
import com.everis.ideaton.repository.MongoImageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class ImageServiceImpl implements ImageService {

    private final MongoImageRepository mongoImageRepository;

    @Autowired
    public ImageServiceImpl(MongoImageRepository mongoImageRepository) {
        this.mongoImageRepository = mongoImageRepository;
    }

    @Override
    public List<Image> getAllImages() throws RuntimeException {
        return mongoImageRepository.findAll();
    }

    @Override
    public Image getImageById(String id) throws RuntimeException {
        return mongoImageRepository.findOne(id);
    }

    @Override
    public Image saveImage(ImageDto imageDto) throws RuntimeException {
        Image image = Image.createImageInstance(null,imageDto.getLink());
        mongoImageRepository.save(image);
        return mongoImageRepository.findOne(image.getId());
    }

    @Override
    public boolean deleteImage(String id) throws RuntimeException {
         mongoImageRepository.delete(id);
        return true;
    }

    @Override
    public Image updateImage(ImageDto imageDto) throws RuntimeException {
        return saveImage(imageDto);
    }
}
