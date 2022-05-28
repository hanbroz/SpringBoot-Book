package com.hanbroz.boot.book.service;

import com.hanbroz.boot.book.model.Reservation;

import java.util.List;

public interface ReservationService {
    public List<Reservation> query(String courtName);
}
