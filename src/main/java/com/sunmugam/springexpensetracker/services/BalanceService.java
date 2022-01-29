package com.sunmugam.springexpensetracker.services;

import com.sunmugam.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
