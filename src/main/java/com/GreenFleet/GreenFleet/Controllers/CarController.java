package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Dtos.TransactionDetail.CarDTO;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Car;
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/car")
    public List<CarDTO> getCarDTO() {
        return carRepository.findAll()
                .stream()
                .map(CarDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/car/{id}")
    public CarDTO getCarDTO(@PathVariable long id) {
        return new CarDTO(carRepository.findById(id).get());
    }

    //Metodo Post
//    @PostMapping("/car")
//    public ResponseEntity<Object> registerCar(
//                                              @RequestParam String licensePlate,
//                                              @RequestParam String model) {
//
//        String message = "";
//        if (licensePlate.isBlank()) {
//            message = "Missing license plate";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (model.isBlank()) {
//            message = "Missing model";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        Car car = new Car();
//        car.setLicensePlate(licensePlate);
//        car.setModel(model);
//        carRepository.save(car);
//        return new ResponseEntity<>("Car registered successfully", HttpStatus.CREATED);
//    }

}