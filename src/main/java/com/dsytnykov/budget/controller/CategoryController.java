package com.dsytnykov.budget.controller;

import com.dsytnykov.budget.model.Category;
import com.dsytnykov.budget.model.Expense;
import com.dsytnykov.budget.service.CategoryService;
import com.dsytnykov.budget.service.ExpenseService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(ExpenseService expenseService) {
        this.categoryService = categoryService;
    }

    @PostMapping(value = "")
    public void create(@NonNull @RequestBody Category data) {
        categoryService.create(data);
    }

    @PutMapping(value = "")
    public void update(@NonNull @RequestBody Category data) {
        categoryService.update(data);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") long id) {
        categoryService.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable("id") long id) {
        return categoryService.findById(id);
    }
}
