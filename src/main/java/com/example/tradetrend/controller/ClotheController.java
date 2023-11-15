package com.example.tradetrend.controller;

import com.example.tradetrend.dto.ClotheDto;
import com.example.tradetrend.service.ClotheService;
import com.example.tradetrend.vo.RequestClothe;
import com.example.tradetrend.vo.ResponseClothe;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clothes")
public class ClotheController {
    private final ModelMapper mapper;
    private final ClotheService clotheService;

    @GetMapping("/hot")
    public ResponseEntity<List<ResponseClothe>> getHottestClothes() {
        List<ClotheDto> hottestClothes = clotheService.getHottestClothes();
        List<ResponseClothe> body = hottestClothes.stream()
                .map(clotheDto -> mapper.map(clotheDto, ResponseClothe.class))
                .toList();

        return ResponseEntity.ok(body);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseClothe>> getAllClothes(@RequestParam(defaultValue = "0") Integer page,
                                                              @RequestParam(required = false) String category,
                                                              @RequestParam(required = false) String brand) {
        List<ClotheDto> allClothes = clotheService.getAllClothes(page, brand, category);
        List<ResponseClothe> body = allClothes.stream()
                .map(clotheDto -> mapper.map(clotheDto, ResponseClothe.class))
                .toList();

        return ResponseEntity.ok(body);
    }

    @GetMapping("/detail/{clotheId}")
    public ResponseEntity<ResponseClothe> getCatalogDetail(@PathVariable(name = "clotheId") Long clotheId) {
        ClotheDto clothDetail = clotheService.getClothDetail(clotheId);
        ResponseClothe body = mapper.map(clothDetail, ResponseClothe.class);

        return ResponseEntity.ok(body);
    }

    @PostMapping
    public ResponseEntity<ResponseClothe> createClothe(@RequestBody RequestClothe requestClothe) {
        ClotheDto clotheDto = clotheService.createClothe(requestClothe);
        ResponseClothe body = mapper.map(clotheDto, ResponseClothe.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @DeleteMapping("/{clotheId}")
    public ResponseEntity deleteClothe(@PathVariable(name = "clotheId") Long clothedId) {
        clotheService.deleteClothe(clothedId);

        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{clotheId}")
    public ResponseEntity<ResponseClothe> updateClothe(@PathVariable(name = "clotheId") Long clothedId,
                                                       @RequestBody RequestClothe requestClothe) {
        ClotheDto updateClothe = clotheService.updateClothe(clothedId, requestClothe);

        ResponseClothe body = mapper.map(updateClothe, ResponseClothe.class);
        return ResponseEntity.ok(body);
    }
}
