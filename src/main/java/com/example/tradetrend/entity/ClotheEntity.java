package com.example.tradetrend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Clothes")
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
    private String text;

    @Column(nullable = false)
    private Integer price;

    private String category;

    @Column(nullable = false)
    private String detail;
}
