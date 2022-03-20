package com.freenow.controller.mapper;

import com.freenow.datatransferobject.CarDTO;
import com.freenow.domainobject.CarDO;

public class CarMapper
{

    public static CarDO makeCarDO(CarDTO carDTO) {
        return new CarDO(carDTO.getLicensePlate(), carDTO.getSeatCount(), carDTO.getConvertible(), carDTO.getRating(), carDTO.getEngineType());
    }

    public static CarDTO makeCarDTO(CarDO car) {
        return new CarDTO(
            car.getId(), car.getDateCreated(), car.getLicensePlate(), car.getSeatCount(), car.isConvertible(), car.getRating(), car.getEngineType()
        );
    }
}
