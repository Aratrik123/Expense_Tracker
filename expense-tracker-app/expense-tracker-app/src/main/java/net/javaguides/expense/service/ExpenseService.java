package net.javaguides.expense.service;

import net.javaguides.expense.Dto.ExpenseDto;

import java.util.List;

public interface ExpenseService {

    ExpenseDto createExpense(ExpenseDto expenseDto);
    ExpenseDto getExpenseById(Long expenseId);
    List<ExpenseDto> getAllExpenses();
    ExpenseDto updateExpense(long expenseId, ExpenseDto expenseDto);
    void deleteExpense(Long expenseId);
}
