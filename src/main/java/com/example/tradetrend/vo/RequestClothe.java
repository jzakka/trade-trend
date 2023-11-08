package com.example.tradetrend.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestClothe {
    private String brand;

    private String maker;

    private String name;

    private Integer price;

    private String category;

    private String mainImg;

    private String detail;

    private String link;
}
