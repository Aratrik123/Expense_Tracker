package net.javaguides.expense.Dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(
        description = "Expense DTO(Data Transfer Object) to transfer data between the client and the server."
)
public record ExpenseDto(Long id,

                         @Schema(
                                description = "Expense amount"
                         )
                         BigDecimal amount,

                         @Schema(
                                 description = "Expense created date"
                         )
                         LocalDate expenseDate,

                         @Schema(
                                 description = "Associated Expense category"
                         )
                         CategoryDto categoryDto) {
}
