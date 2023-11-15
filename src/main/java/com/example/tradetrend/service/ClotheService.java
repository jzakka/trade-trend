package com.example.tradetrend.service;

import com.example.tradetrend.dto.ClotheDto;
import com.example.tradetrend.vo.RequestClothe;

import java.util.List;

public interface ClotheService {
    List<ClotheDto> getHottestClothes();

    List<ClotheDto> getAllClothes();

    List<ClotheDto> getAllClothes(Integer page, String brand, String category);

    ClotheDto getClothDetail(Long clotheId);

    ClotheDto createClothe(RequestClothe requestClothe);

    void deleteClothe(Long clotheId);

    ClotheDto updateClothe(Long clotheId, RequestClothe requestClothe);
}
