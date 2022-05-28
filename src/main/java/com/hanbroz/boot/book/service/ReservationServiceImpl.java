package com.hanbroz.boot.book.service;

import com.hanbroz.boot.book.model.Player;
import com.hanbroz.boot.book.model.Reservation;
import com.hanbroz.boot.book.model.SportType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReservationServiceImpl implements ReservationService {

    private static final SportType TENNIS = new SportType(1,"Tennis");
    private static final SportType SOCCER = new SportType(2,"Soccer");

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceImpl() {
        reservations.add(new Reservation(
                "Tennis #1"
                , LocalDate.now()
                , 16
                , new Player("Roger", "N/A")
                , TENNIS));

        reservations.add(new Reservation(
                "Tennis #2"
                , LocalDate.now()
                , 20
                , new Player("James", "N/A")
                , TENNIS));
    }

    @Override
    public List<Reservation> query(String courtName) {
        return this.reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
                .collect(Collectors.toList());
    }
}
