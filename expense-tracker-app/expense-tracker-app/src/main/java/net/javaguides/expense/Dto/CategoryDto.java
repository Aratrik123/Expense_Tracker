package net.javaguides.expense.Dto;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        description = "Category DTO(Data Transfer Object) to transfer data between the client and the server."
)
public record CategoryDto(Long id,
                          @Schema(
                                  description = "Category name"
                          ) String name) {
}
