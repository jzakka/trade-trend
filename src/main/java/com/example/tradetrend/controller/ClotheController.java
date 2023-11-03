package com.example.tradetrend.controller;

import com.example.tradetrend.vo.ResponseCatalog;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clothes")
public class CatalogController {
    @GetMapping("/hot")
    public ResponseEntity<List<ResponseCatalog>> getHottestClothes() {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseCatalog>> getAllClothes(@RequestParam(defaultValue = "0")Integer page) {
        return null;
    }

    @GetMapping("/detail/{catalogId}")
    public ResponseEntity<ResponseCatalog> getCatalogDetail(@PathVariable(name = "catalogId") Integer catalogId) {
        return null;
    }
}
