package com.example.transactionsAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.transactionsAPI.entity.Transaction;
import com.example.transactionsAPI.service.TransactionService;

@RestController
@RequestMapping("api/v1/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping()
	public void addTransactionDetails(@RequestBody Transaction transaction){
		transactionService.addTransactionDetails(transaction);
		
	}
	
	@GetMapping("/transaction-name/{transactionName}")
	public List<Transaction> getTransactionByName(@PathVariable String transactionName){
		return transactionService.getTransactionByName(transactionName);
	}
	
	@GetMapping()
	public List<Transaction> getAllTransactions(){
		return transactionService.getAllTrasanctions();
	}
	
	@GetMapping("/page")
	private Page<Transaction> getAllTransactions(@RequestParam("pageNo") Optional<Integer> pageNo, 
			@RequestParam("pageSize") Optional<Integer> pageSize,
			@RequestParam("sort") Optional<String> sortBy
			){
		return transactionService.getTransactionByPage(pageNo,pageSize,sortBy);
	}


}
