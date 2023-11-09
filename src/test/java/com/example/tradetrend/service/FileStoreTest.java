package com.example.tradetrend.service;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class FileStoreTest {
    @Autowired
    FileStore fileStore;

    @Autowired
    Environment env;

    @Test
    void getFullPath() {
        String fileName = "IMG_8760.PNG";
        String fullPath = fileStore.getFullPath(fileName);
        String prefix = env.getProperty("file.dir");

        log.info("fullPath={}", fullPath);
        log.info("prefix+fileName={}{}", prefix, fileName);

        Assertions.assertThat(fullPath).isEqualTo(prefix + fileName);
    }
}