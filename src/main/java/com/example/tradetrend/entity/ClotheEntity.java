package com.example.tradetrend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Clothes")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClotheEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String brand;

    @Column(nullable = false, length = 50)
    private String maker;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(length = 10)
    private String color;

    @Column(length = 20)
    private String category;

    private String mainImg;
    @Column(nullable = false)
    private String detail;

    private String link;


}
