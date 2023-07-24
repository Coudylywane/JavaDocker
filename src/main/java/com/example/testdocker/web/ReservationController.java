package com.example.testdocker.web;

import com.example.testdocker.entities.Reservation;
import com.example.testdocker.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;


    @GetMapping("/reservations")
    public List<Reservation>  getReservations() {
        return reservationRepository.findAll();
    }
}
