package com.example.tradetrend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ClotheDto {
    private Long id;

    private String brand;

    private String maker;

    private String name;

    private Integer price;

    private String category;

    private String mainImg;

    private String detail;

    private String link;
}
