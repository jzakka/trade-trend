package com.example.tradetrend.controller;

import com.example.tradetrend.service.FileStore;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/file")
public class FileController {
    private final FileStore fileStore;

    @SneakyThrows
    @GetMapping("/{fileName}")
    public Resource getImage(@PathVariable String fileName) {
        return new UrlResource("file:" + fileStore.getFullPath(fileName));
    }
}
