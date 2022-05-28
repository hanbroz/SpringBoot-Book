package com.hanbroz.boot.book.model;

import java.time.LocalDate;

public class Reservation {

    public String getCourtName() {
        return courtName;
    }

    private String courtName;
    private LocalDate date;
    private int hour;
    private Player player;
    private SportType sportType;

    public Reservation(String courtName, LocalDate date, int hour, Player player, SportType sportType) {
        this.courtName = courtName;
        this.date = date;
        this.hour = hour;
        this.player = player;
        this.sportType = sportType;
    }
}
