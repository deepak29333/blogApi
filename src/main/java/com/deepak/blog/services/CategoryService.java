package com.deepak.blog.services;

import com.deepak.blog.payloads.CategoryDto;

import java.util.List;
public interface CategoryService {
    //create
     CategoryDto  createCategory(CategoryDto categoryDto);
     //update
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
    //detele
     void deleteCategory(Integer categoryId);
     // get
     CategoryDto getCategory(Integer categoryId);
     //get all
    List<CategoryDto> getCategories();
}
