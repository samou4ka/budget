package com.dsytnykov.budget.controller;

import com.dsytnykov.budget.model.Expense;
import com.dsytnykov.budget.service.ExpenseService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping(value = "")
    public void create(@NonNull @RequestBody Expense data) {
        expenseService.create(data);
    }

    @PutMapping(value = "")
    public void update(@NonNull @RequestBody Expense data) {
        expenseService.update(data);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
        expenseService.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public Expense findById(@PathVariable("id") long id) {
        return expenseService.findById(id);
    }
}
