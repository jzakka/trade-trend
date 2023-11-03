package com.example.tradetrend.service;

import com.example.tradetrend.dto.ClotheDto;

import java.util.List;

public interface ClotheService {
    List<ClotheDto> getHottestClothes();

    List<ClotheDto> getAllClothes();

    List<ClotheDto> getAllClothes(Integer page);

    ClotheDto getClothDetail(Long clotheId);
}
