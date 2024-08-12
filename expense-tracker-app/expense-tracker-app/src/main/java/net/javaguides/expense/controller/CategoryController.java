package net.javaguides.expense.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.javaguides.expense.Dto.CategoryDto;
import net.javaguides.expense.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(
        name = "CRUD REST APIS for category",
        description = "Delete,Create,Get,Update Categories"
)
@AllArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    @Operation(
            summary = "Create Category REST API",
            description = "Create Category REST API to save category into database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP STATUS 201 CREATED"
    )
    //Build create Category REST API

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(
            @RequestBody CategoryDto categoryDto){
        CategoryDto category =
                categoryService.createCategory(categoryDto);

        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }


    @Operation(
            summary = "Get Category REST API",
            description = "Get Category REST API to get category from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 CREATED"
    )
    // Build Get Category REST API
    @GetMapping("{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("id") Long categoryId){
        CategoryDto category = categoryService.getCategoryById(categoryId);
        return ResponseEntity.ok(category);
    }


    @Operation(
            summary = "Get All Categories REST API",
            description = "Get all categories REST API to get categories from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 CREATED"
    )
    // Build get all category REST API
    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories(){
        List<CategoryDto> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }


    @Operation(
            summary = "Update Category REST API",
            description = "Update Category REST API to update category in the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 CREATED"
    )
    // build update category REST API
    @PutMapping("{id}")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable("id") Long categoryId,
                                                      @RequestBody CategoryDto categoryDto){
        CategoryDto updatedCategory = categoryService.updateCategory(categoryId, categoryDto);

        return ResponseEntity.ok(updatedCategory);
    }


    @Operation(
            summary = "Delete Category REST API",
            description = "Delete Category REST API to delete a category from the database"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP STATUS 200 CREATED"
    )
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long categoryId)
    {
        categoryService.deleteCategory(categoryId);
        return ResponseEntity.ok("Category deleted successfully!");
    }
}

