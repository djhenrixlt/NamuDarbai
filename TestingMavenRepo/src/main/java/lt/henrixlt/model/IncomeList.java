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
public class IncomeList {
    private int id;
    private double sum;
    private LocalDate date = LocalDate.now();
    private CategoryIncome category;
    private boolean  toTheBank;
    private String additionalInfo;

}
