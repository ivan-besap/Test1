package com.GreenFleet.GreenFleet;

import com.GreenFleet.GreenFleet.Models.ChargingStation.*;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Company.Employee;
import com.GreenFleet.GreenFleet.Models.Company.Rol;
import com.GreenFleet.GreenFleet.Models.Company.UserRol;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Car;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;
import com.GreenFleet.GreenFleet.Repositories.ChargingStation.*;
import com.GreenFleet.GreenFleet.Repositories.Company.CompanyRepository;
import com.GreenFleet.GreenFleet.Repositories.Company.EmployeeRepository;
import com.GreenFleet.GreenFleet.Repositories.Company.RolRepository;
import com.GreenFleet.GreenFleet.Repositories.Company.UserRolRepository;
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.CarRepository;
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.ClientRepository;
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

@SpringBootApplication
public class GreenFleetApplication {



	public static void main(String[] args) {
		SpringApplication.run(GreenFleetApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(CompanyRepository companyRepository, EmployeeRepository employeeRepository, RolRepository rolRepository, UserRolRepository UserRolRepository, CommuneRepository communeRepository, ProvinceRepository provinceRepository, RegionRepository regionRepository, LocationRepository locationRepository, ChargingStationRepository chargingStationRepository, CarRepository carRepository, TransactionDetailRepository transactionDetailRepository, ClientRepository clientRepository) {
		return (args) -> {

			// 1. Create Location (Assuming independent creation)
			Commune santiagoCommune = new Commune("Santiago");
			communeRepository.save(santiagoCommune);

			Province santiagoProvince = new Province("Santiago");
			provinceRepository.save(santiagoProvince);

			Region metropolitanaRegion = new Region("Metropolitana", 13);
			regionRepository.save(metropolitanaRegion);

			Location companyLocation = new Location("101 Main Street", santiagoCommune, santiagoProvince, metropolitanaRegion);
			locationRepository.save(companyLocation);

			// 2. Create Company
			Company company = new Company("GreenTech Solutions", "greentech@example.com", 123456789, 0, "B", "securePassword", true, LocalDate.now());
			companyRepository.save(company); // Save the company first

			// 3. Create Charging Station (associated with saved company)
			ChargingStation station1 = new ChargingStation("Charging Station 1", new BigDecimal(50.0), true, company, LocalDate.now());


			company.getChargingStations().add(station1);
			chargingStationRepository.save(station1);

			// Create roles (assuming they don't exist already)
			Rol adminRole = new Rol("ADMIN");
			Rol userRole = new Rol("USER");
			rolRepository.saveAll(Arrays.asList(adminRole, userRole)); // Save roles to the repository

			// Create a user role
			UserRol userRol = new UserRol(adminRole);
			UserRolRepository.save(userRol); // Save user role to the repository

			// Create an employee object
			Employee employee = new Employee("John", "Doe", "johndoe", "johndoe@example.com", "securePassword", "1234567890", company, userRol, LocalDate.now());




			// Create a client object
			Client client1 = new Client("Jane", "Smith", "janesmith@example.com", 987654321, 7, "securePassword", "9876543210");
			clientRepository.save(client1); // Save client to the repository

			// Create a transaction detail object
			TransactionDetail transaction = new TransactionDetail(LocalDate.now(), LocalDate.now().plusDays(1), new BigDecimal(20.0), 120, client1);
			transactionDetailRepository.save(transaction); // Save transaction detail to the repository

			// Create a car object
			Car car1 = new Car("DEF456", "Tesla Model S", client1);
			carRepository.save(car1); // Save car to the repository
		};

	}
}
