package com.freenow.controller;

import com.freenow.controller.mapper.CarMapper;
import com.freenow.controller.mapper.DriverMapper;
import com.freenow.datatransferobject.CarDTO;
import com.freenow.datatransferobject.DriverDTO;
import com.freenow.exception.EntityNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/cars") //change the response

public class CarController {

//    @GetMapping("/{driverId}")
//    public DriverDTO getDriver(@PathVariable long driverId) throws EntityNotFoundException
//    {
//        return DriverMapper.makeDriverDTO(driverService.find(driverId));
//    }

    @GetMapping("/carId")
        public CarDTO getCar(@PathVariable long carId)
        {
            return CarMapper.makeCarDTO(car)
        }

}
