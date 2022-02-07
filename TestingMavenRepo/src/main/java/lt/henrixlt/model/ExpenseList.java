package lt.henrixlt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ExpenseList {
    private int id;
    private double sum;
    private LocalDate date = LocalDate.now();
    private CategoryExpenses category;
    private PaymentMethod paymentMethod;
    private String additionalInfo;
}
