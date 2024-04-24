package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Dtos.Company.CompanyDTO;
import com.GreenFleet.GreenFleet.Dtos.Company.EmployeeDTO;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Company.Employee;
import com.GreenFleet.GreenFleet.Models.Company.Rol;
import com.GreenFleet.GreenFleet.Models.Company.UserRol;
import com.GreenFleet.GreenFleet.Repositories.Company.CompanyRepository;
import com.GreenFleet.GreenFleet.Repositories.Company.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/employee")
    public List<EmployeeDTO> getEmployeesDTO() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeDTO(@PathVariable long id) {
        try {
            Employee employee = employeeRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException("Employee not found with id: " + id));
            return new ResponseEntity<>(new EmployeeDTO(employee), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

// Metodo Post
//    @PostMapping("/employee")
//    public ResponseEntity<Object> registerEmployee(
//                                                   @RequestParam String name,
//                                                   @RequestParam String firstSurname,
//                                                   @RequestParam String lastSurname,
//                                                   @RequestParam String email,
//                                                   @RequestParam String username,
//                                                   @RequestParam String password,
//                                                   @RequestParam String nameCompany,
//                                                   @RequestParam String Authority
//    ) {
//        String message = "";
//        if (name.isBlank()) {
//            message = "Missing name";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (firstSurname.isBlank()) {
//            message = "Missing first surname";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (lastSurname.isBlank()) {
//            message = "Missing last surname";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (email.isBlank()) {
//            message = "Missing email";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (username.isBlank()) {
//            message = "Missing username";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (password.isBlank()) {
//            message = "Missing password";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (nameCompany.isBlank()) {
//            message = "Missing name company";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//        if (!Authority.isBlank()) {
//            message = "Missing authority";
//            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
//        }
//
//
//
//        Rol rol = new Rol(Authority);
//        UserRol userRol = new UserRol(rol);
//        rol.setUserRol(userRol);
//if (!companyRepository.existsByBusinessName(nameCompany)) {
//    message = "Company not found";
//    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND); }
//
//        Company company = companyRepository.findByBusinessName(nameCompany);
//
//        Employee employee = new Employee(name, firstSurname, lastSurname, email, username, password, companyName, userRol, LocalDate.now());
//
//
//
//        employeeRepository.save(employee);
//        message = "Employee registered successfully";
//        return new ResponseEntity<>(message, HttpStatus.OK);
//
//        }
    }
