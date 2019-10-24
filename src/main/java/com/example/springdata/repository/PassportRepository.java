package com.example.springdata.repository;

import com.example.springdata.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository  extends JpaRepository<Passport, Integer> {
    Passport findByNumber(String number);
}
