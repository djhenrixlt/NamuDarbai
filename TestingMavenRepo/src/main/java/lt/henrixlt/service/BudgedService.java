package lt.henrixlt.service;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lt.henrixlt.model.ExpenseList;
import lt.henrixlt.model.IncomeList;

import java.util.Arrays;
@NoArgsConstructor
@ToString
@Getter
public class BudgedService {
    private int indexIncome = 0;
    private int indexExpens = 0;
    private IncomeList[] incomeLists = new IncomeList[100];
    private ExpenseList[] expenseLists = new ExpenseList[100];

    public void addIncoms(IncomeList incomeList){
        this.incomeLists[this.indexIncome] = incomeList;
        this.indexIncome++;
    }
    public void addExpenseList(ExpenseList expenseList){
        this.expenseLists[this.indexExpens] = expenseList;
        this.indexExpens++;
    }
    public void getIncomeByID(int id){
        System.out.println(incomeLists[id]);
    }
    public void getExpensByID(int id){
        System.out.println(expenseLists[id]);
    }
    public void getIncomesByCategory(String category){
        Arrays.stream(incomeLists)
                .filter(C -> C.getCategory().equals(category))
                .forEach(System.out::println);
    }
    public void getExpensByCategory(String category){
        Arrays.stream(expenseLists)
                .filter(C -> C.getCategory().equals(category))
                .forEach(System.out::println);
    }

}
