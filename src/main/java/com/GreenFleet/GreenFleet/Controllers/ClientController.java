package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Dtos.TransactionDetail.ClientDTO;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/client")
    public List<ClientDTO> getClientDTO() {
        return clientRepository.findAll()
                .stream()
                .map(ClientDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/client/{id}")
    public ClientDTO getClientDTO(@PathVariable long id) {
        return new ClientDTO(clientRepository.findById(id).get());
    }


    //Metodo Post
//    @PostMapping("/client")
//    public ResponseEntity<Object> registerClient(@RequestParam String name,
//                                                 @RequestParam String lastName,
//                                                 @RequestParam String email,
//                                                 @RequestParam Integer phone,
//                                                 @RequestParam Integer rut,
//                                                 @RequestParam String password) {
//
//
//
//        String message = "";
//        if (name.isBlank()) {
//            message = "Missing name";
//            return ResponseEntity.badRequest().body(message);
//        }
//        if (lastName.isBlank()) {
//            message = "Missing last name";
//            return ResponseEntity.badRequest().body(message);
//        }
//        if (email.isBlank()) {
//            message = "Missing email";
//            return ResponseEntity.badRequest().body(message);
//        }
//        if (phone == null) {
//            message = "Missing phone";
//            return ResponseEntity.badRequest().body(message);
//        }
//        if (rut == null) {
//            message = "Missing rut";
//            return ResponseEntity.badRequest().body(message);
//        }
//        if (password.isBlank()) {
//            message = "Missing password";
//            return ResponseEntity.badRequest().body(message);
//        }
//
//        String checkDigit = "Test";
//       Client client = new Client(name,lastName,email,phone,rut,password,checkDigit);
//
//
//        clientRepository.save(client);
//        return ResponseEntity.ok("Client registered successfully");
//    }

}
