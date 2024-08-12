package net.javaguides.expense.mapper;

import net.javaguides.expense.Dto.CategoryDto;
import net.javaguides.expense.entity.Category;

public class CategoryMapper {

    public static Category mapToCategory(CategoryDto categoryDto)
    {
        return new Category(
                categoryDto.id(),
                categoryDto.name()
        );
    }

    public static CategoryDto mapToCategoryDto(Category category){
        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }
}
