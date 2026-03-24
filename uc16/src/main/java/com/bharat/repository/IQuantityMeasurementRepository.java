package com.bharat.repository;
import java.util.List;

import com.bharat.entity.QuantityMeasurementEntity;
public interface IQuantityMeasurementRepository {
    void save(QuantityMeasurementEntity entity);
    List<QuantityMeasurementEntity> findAll();
}