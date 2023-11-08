package com.example.tradetrend.util;

import com.example.tradetrend.entity.ClotheEntity;
import com.example.tradetrend.vo.RequestClothe;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UpdaterTest {

    @Autowired
    Updater<ClotheEntity, RequestClothe> updater;

    @Test
    @DisplayName("vo혹은 dto에서 엔티티로 변환 성공")
    void update() {
        ClotheEntity entity = ClotheEntity.builder()
                .id(1l)
                .brand("NIKE")
                .category("shoes")
                .name("jordan")
                .maker("abc")
                .price(1000)
                .detail("/detail/link")
                .link("/shop/link")
                .build();

        RequestClothe vo = RequestClothe.builder()
                .mainImg("/main-img/link")
                .price(1500)
                .name("Jordan")
                .build();

        updater.update(entity, vo);

        assertThat(entity.getPrice()).isEqualTo(1500);
        assertThat(entity.getMainImg()).isEqualTo("/main-img/link");
        assertThat(entity.getName()).isEqualTo("Jordan");
    }
}