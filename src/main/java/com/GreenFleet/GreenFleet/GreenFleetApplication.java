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
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@SpringBootApplication
public class GreenFleetApplication {



	public static void main(String[] args) {
		SpringApplication.run(GreenFleetApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(CompanyRepository companyRepository, EmployeeRepository employeeRepository, RolRepository rolRepository, UserRolRepository UserRolRepository, CommuneRepository communeRepository, ProvinceRepository provinceRepository, RegionRepository regionRepository, LocationRepository locationRepository, ChargingStationRepository chargingStationRepository, CarRepository carRepository, TransactionDetailRepository transactionDetailRepository) {
		return (args) -> {
			Rol rol = new Rol("ADMIN");
			rolRepository.save(rol);

			// Crear un nuevo usuario de rol asociado al rol creado
			UserRol userRol = new UserRol(rol);
			UserRolRepository.save(userRol);

			// Crear una nueva compañía
			Company company = new Company("Besap", "besap@admin.com", 999999, 99999 - 9, "A", "admin", true, LocalDate.now());
			companyRepository.save(company);

			// Crear un nuevo empleado y asignarle la compañía y el usuario de rol creados
			Employee employee = new Employee("admin", "admin", "admin", "admin@admin.com", "admin", ("admin"), company, userRol, LocalDate.now());
			employee.setCompany(company);
			employeeRepository.save(employee);

			Commune commune = new Commune("Vitacura");
			communeRepository.save(commune);

			Province province = new Province("Santiago");
			provinceRepository.save(province);

			Region region = new Region("Metropolitana", 5);
			regionRepository.save(region);

			Location location = new Location("Av Vitacura 1", commune, province, region);
			location.setCompany(company);
			company.getLocations().add(location);
			locationRepository.save(location);

			ChargingStation chargingStation = new ChargingStation("Estación 1", BigDecimal.ZERO, true, company, LocalDate.now());
			chargingStation.setLocation(location);
			chargingStationRepository.save(chargingStation);

			TransactionDetail transaction = new TransactionDetail(LocalDate.now(), LocalDate.now().plusDays(1), BigDecimal.TEN, 100, null);
			transactionDetailRepository.save(transaction);

			Client client = new Client("Pepito", "Perez", "123456789", "pepito@admin.com", "12345", company, userRol, LocalDate.now());


			Car car = new Car("ABC123", "Modelo", null);
			carRepository.save(car);

			transaction.setClient(client);
			car.setClient(client);


			transactionDetailRepository.save(transaction);
			carRepository.save(car);

		};

	}
}
