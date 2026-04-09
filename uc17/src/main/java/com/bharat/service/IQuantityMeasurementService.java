package main.java.com.bharat.service;

import java.util.List;

import com.bharat.quantityMeasurementApp.dto.QuantityMeasurementDTO;
import com.bharat.quantityMeasurementApp.entity.QuantityDTO;

/**
 * UC17 - Service interface.
 *
 * Changes from UC16:
 *   - All operation methods return QuantityMeasurementDTO (structured response)
 *   - Three new history/reporting methods added
 */
public interface IQuantityMeasurementService {

    QuantityMeasurementDTO compare(QuantityDTO thisQ, QuantityDTO thatQ);

    QuantityMeasurementDTO convert(QuantityDTO thisQ, String targetUnit);

    QuantityMeasurementDTO add(QuantityDTO thisQ, QuantityDTO thatQ);
    QuantityMeasurementDTO add(QuantityDTO thisQ, QuantityDTO thatQ, String targetUnit);

    QuantityMeasurementDTO subtract(QuantityDTO thisQ, QuantityDTO thatQ);
    QuantityMeasurementDTO subtract(QuantityDTO thisQ, QuantityDTO thatQ, String targetUnit);

    QuantityMeasurementDTO divide(QuantityDTO thisQ, QuantityDTO thatQ);

    /** All records — returns DTO list */
    List<QuantityMeasurementDTO> getAllMeasurements();

    /** Records filtered by operation (COMPARE, ADD, etc.) */
    List<QuantityMeasurementDTO> getMeasurementsByOperation(String operation);

    /** Records filtered by measurement type (LengthUnit, etc.) */
    List<QuantityMeasurementDTO> getMeasurementsByType(String measurementType);

    /** Records where an error occurred */
    List<QuantityMeasurementDTO> getErrorHistory();

    /** Count of successful records for a given operation */
    long getOperationCount(String operation);
}