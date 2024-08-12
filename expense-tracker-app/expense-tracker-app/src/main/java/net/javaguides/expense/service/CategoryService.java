package net.javaguides.expense.service;

import net.javaguides.expense.Dto.CategoryDto;
import net.javaguides.expense.controller.CategoryController;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto getCategoryById(Long categoryId);
    List<CategoryDto> getAllCategories();
    CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto);
    void deleteCategory(Long categoryId);

}
