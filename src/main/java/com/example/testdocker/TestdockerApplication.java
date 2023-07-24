package com.example.testdocker;

import com.example.testdocker.entities.Reservation;
import com.example.testdocker.entities.ReservationStatus;
import com.example.testdocker.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdockerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
		return args -> {
            reservationRepository.save(Reservation.builder().title("RES 1").price(1200).status(ReservationStatus.CREATED).build());
			reservationRepository.save(Reservation.builder().title("RES 2").price(2300).status(ReservationStatus.CONFIRMED).build());
			reservationRepository.save(Reservation.builder().title("RES 3").price(312).status(ReservationStatus.CANCELLED).build());
        };
	}

}
