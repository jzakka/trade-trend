package com.example.tradetrend.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ResponseClothe {
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
