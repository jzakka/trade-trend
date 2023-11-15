package com.example.tradetrend.service;

import com.example.tradetrend.dto.ClotheDto;
import com.example.tradetrend.entity.ClotheEntity;
import com.example.tradetrend.repository.ClotheRepository;
import com.example.tradetrend.util.Updater;
import com.example.tradetrend.vo.RequestClothe;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClotheServiceImpl implements ClotheService{
    private final ClotheRepository clotheRepository;
    private final ModelMapper mapper;
    private final Environment env;
    private final Updater<ClotheEntity, RequestClothe> updater;

    @Override
    public List<ClotheDto> getHottestClothes() {
        return getAllClothes(0, null, null);
    }

    @Override
    public List<ClotheDto> getAllClothes() {
        List<ClotheEntity> all = clotheRepository.findAll();
        List<ClotheDto> clotheDtos = all.stream()
                .map(entity -> mapper.map(entity, ClotheDto.class))
                .toList();

        return clotheDtos;
    }

    @Override
    public List<ClotheDto> getAllClothes(Integer page, String brand, String category) {
        int pageSize = Integer.parseInt(env.getProperty("page.size"));
        Pageable pageable = PageRequest.of(page, pageSize);

        Page<ClotheEntity> all = clotheRepository.findAllByBrandAndCategory(pageable, brand, category);
        List<ClotheDto> clotheDtos = all.stream()
                .map(entity -> mapper.map(entity, ClotheDto.class))
                .toList();

        return clotheDtos;
    }

    @Override
    public ClotheDto getClothDetail(Long clotheId) {
        ClotheEntity clotheEntity = clotheRepository
                .findById(clotheId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, env.getProperty("resource.not-found-msg")));

        return mapper.map(clotheEntity, ClotheDto.class);
    }

    @Override
    public ClotheDto createClothe(RequestClothe requestClothe) {
        ClotheEntity clotheEntity = mapper.map(requestClothe, ClotheEntity.class);

        ClotheEntity createdClothe = clotheRepository.save(clotheEntity);

        return mapper.map(createdClothe, ClotheDto.class);
    }

    @Override
    public void deleteClothe(Long clotheId) {
        clotheRepository.deleteById(clotheId);
    }

    @Override
    public ClotheDto updateClothe(Long clotheId, RequestClothe requestClothe) {
        ClotheEntity clotheEntity = clotheRepository
                .findById(clotheId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, env.getProperty("resource.not-found-msg")));

        updater.update(clotheEntity, requestClothe);

        ClotheEntity updated = clotheRepository.save(clotheEntity);

        return mapper.map(updated, ClotheDto.class);
    }
}
