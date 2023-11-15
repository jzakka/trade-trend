package com.example.tradetrend.repository;

import com.example.tradetrend.entity.ClotheEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClotheRepository extends JpaRepository<ClotheEntity, Long> {
    @Query("SELECT c FROM ClotheEntity c WHERE (:brand is null or c.brand = :brand) and (:category is null or c.category = :category)")
    Page<ClotheEntity> findAllByBrandAndCategory(Pageable page, @Param("brand") String brand, @Param("category") String category);

}
