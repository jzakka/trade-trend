package com.example.tradetrend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileStore {
    private final Environment env;

    public String getFullPath(String fileName) {
        return env.getProperty("file.dir") + fileName;
    }
}
