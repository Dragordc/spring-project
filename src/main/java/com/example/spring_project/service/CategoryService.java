package com.example.spring_project.service;

import com.example.spring_project.domain.Category;


import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
