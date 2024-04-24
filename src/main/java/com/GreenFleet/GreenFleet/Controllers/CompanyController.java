package com.GreenFleet.GreenFleet.Controllers;


import com.GreenFleet.GreenFleet.Dtos.Company.CompanyDTO;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Commune;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Location;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Province;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Region;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Repositories.Company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.GreenFleet.GreenFleet.Repositories.Company.CompanyRepository.*;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/company")
    public List<CompanyDTO> getCompaniesDTO() {
        return companyRepository.findAll()
                .stream()
                .map(CompanyDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/company/{id}")
    public CompanyDTO getCompanyDTO(@PathVariable long id) {
        Company company = companyRepository.findById(id);
        if (company == null) {
            throw new EntityNotFoundException("Company not found with id: " + id);
        }
        return new CompanyDTO(company);
    }


    //Metodo Post
//    @PostMapping("/company")
//    public ResponseEntity<Object> registerCompany(@RequestBody Company company,
//                                                  @RequestBody Commune nameCommune,
//                                                  @RequestBody Province nameProvince,
//                                                  @RequestBody Region nameRegion,
//                                                  @RequestBody Location nameLocationAddress) {
//
//        if (!isValidCompany(company) || !isValidLocation(nameCommune, nameProvince, nameRegion, nameLocationAddress)) {
//            return new ResponseEntity<>("Invalid input data", HttpStatus.BAD_REQUEST);
//        }
//
//        // Crear la empresa
//        company.setVerifierCode("CodeTest");
//        company.setEnabled(true);
//        company.setCreatedDay(LocalDate.now());
//        companyRepository.save(company);
//
//        // Crear la ubicación
//        Commune commune = new Commune(nameCommune.getName());
//        Province province = new Province(nameProvince.getName());
//        Region region = new Region(nameRegion.getName(), nameRegion.getNumber());
//        Location location = new Location(nameLocationAddress.getName(), commune, province, region);
//        location.setCompany(company);
//        company.getLocations().add(location);
//
//        companyRepository.save(company);
//
//        return new ResponseEntity<>("Company created successfully", HttpStatus.CREATED);
//    }
//
//    private boolean isValidCompany(Company company) {
//        return company != null &&
//                !company.getBusinessName().isBlank() &&
//                !company.getEmailCompany().isBlank() &&
//                company.getPhoneCompany() != null &&
//                company.getRut() != null &&
//                !company.getPassword().isBlank();
//    }
//
//    private boolean isValidLocation(Commune nameCommune, Province nameProvince, Region nameRegion, Location nameLocationAddress) {
//        return nameCommune != null &&
//                nameProvince != null &&
//                nameRegion != null &&
//                nameLocationAddress != null &&
//                !nameLocationAddress.getName().isBlank();
//    }
}
