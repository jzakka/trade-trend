package com.example.tradetrend.controller;

import com.example.tradetrend.vo.ResponseClothe;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clothes")
public class ClotheController {
    @GetMapping("/hot")
    public ResponseEntity<List<ResponseClothe>> getHottestClothes() {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseClothe>> getAllClothes(@RequestParam(defaultValue = "0")Integer page) {
        return null;
    }

    @GetMapping("/detail/{clotheId}")
    public ResponseEntity<ResponseClothe> getCatalogDetail(@PathVariable(name = "clotheId") Long clotheId) {
        return null;
    }
}
