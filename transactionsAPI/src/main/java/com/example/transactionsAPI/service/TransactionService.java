package com.example.transactionsAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.transactionsAPI.entity.Transaction;

public interface TransactionService {

	void addTransactionDetails(Transaction transaction);

	List<Transaction> getTransactionByName(String transactionName);

	List<Transaction> getAllTrasanctions();

	Page<Transaction> getTransactionByPage(Optional<Integer> pageNo, Optional<Integer> pageSize, Optional<String> sortBy);

}
