package com.example.tradetrend.util;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class Updater<E, D> {

    public void update(E entity, D dto) {
        Class<?> dtoClass = dto.getClass();
        Field[] dtoFields = dtoClass.getDeclaredFields();
        Class<?> entityClass = entity.getClass();

        for (Field dtoField : dtoFields) {
            try {
                updateField(entity, dto, entityClass, dtoField);
            } catch (Exception ignore) {}
        }
    }

    @SneakyThrows
    private void updateField(E entity, D dto, Class<?> entityClass, Field dtoField) {
        dtoField.setAccessible(true);
        Object value = dtoField.get(dto);
        if (value != null) {
            Field entityField = entityClass.getDeclaredField(dtoField.getName());
            entityField.setAccessible(true);
            entityField.set(entity, value);
        }
    }
}
