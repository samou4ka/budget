package com.dsytnykov.budget.service;

import com.dsytnykov.budget.model.Category;
import com.dsytnykov.budget.model.Expense;
import com.dsytnykov.budget.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryService {

    CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public void create(Category data) {
        log.debug("Create object");
        repository.save(data);
    }

    public void update(Category data) {
        log.debug("Update object");
        repository.save(data);
    }

    public void deleteById(long id) {
        log.debug("Delete object");
        repository.deleteById(id);
    }

    public Category findById(long id) {
        log.debug("Get object by id");
        return repository.findById(id).orElse(new Category());
    }
}
