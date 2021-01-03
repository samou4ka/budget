package com.dsytnykov.budget.service;

import com.dsytnykov.budget.model.Expense;
import com.dsytnykov.budget.repository.ExpenseRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExpenseService {

    private ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public void create(Expense data) {
        log.debug("Create object");
        repository.save(data);
    }

    public void update(Expense data) {
        log.debug("Update object");
        repository.save(data);
    }

    public void deleteById(long id) {
        log.debug("Delete object");
        repository.deleteById(id);
    }

    public Expense findById(long id) {
        log.debug("Get object by id");
        return repository.findById(id).orElse(new Expense());
    }
}
