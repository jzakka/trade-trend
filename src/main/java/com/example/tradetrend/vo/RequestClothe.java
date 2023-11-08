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
    @NotNull
    private String brand;

    @NotNull
    private String maker;

    @NotNull
    private String name;

    @NotNull
    private Integer price;

    private String category;

    private String mainImg;

    private String detail;
}
