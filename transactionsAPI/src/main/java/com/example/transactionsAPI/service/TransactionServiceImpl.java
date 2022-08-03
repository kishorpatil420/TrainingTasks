package com.example.transactionsAPI.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.transactionsAPI.entity.Transaction;
import com.example.transactionsAPI.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepository transactionRepository;
	@Override
	public void addTransactionDetails(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	@Override
	public List<Transaction> getTransactionByName(String transactionName) {
		// TODO Auto-generated method stub
		
		List<Transaction> transactions = transactionRepository.getTrasactionsByTransactionName(transactionName);
		return transactions;
	}
	@Override
	public List<Transaction> getAllTrasanctions() {
		// TODO Auto-generated method stub
		List<Transaction> transactions = transactionRepository.findAll();
		return transactions;
	}
	@Override
	@Transactional
	public Page<Transaction> getTransactionByPage(Optional<Integer> pageNo,Optional<Integer> pageSIze, Optional<String> sortBy) {
		// TODO Auto-generated method stub
		System.out.println("page Size" + pageSIze);
		
		return transactionRepository.findAll(PageRequest.of(pageNo.orElse(0),
				pageSIze.orElse(5),Direction.ASC,sortBy.orElse("transactionId")));
	}

}
