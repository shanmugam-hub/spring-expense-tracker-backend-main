package com.sunmugam.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunmugam.springexpensetracker.models.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
