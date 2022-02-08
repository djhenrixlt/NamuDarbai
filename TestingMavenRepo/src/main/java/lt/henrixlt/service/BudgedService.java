package lt.henrixlt.service;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lt.henrixlt.model.ExpenseList;
import lt.henrixlt.model.IncomeList;

import java.util.Arrays;
@NoArgsConstructor
@ToString
@Getter
public class BudgedService {
    @Setter
    private double  balance;
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
    public void getIncomeBetween(double from,double to){
        Arrays.stream(incomeLists)
                .filter(c -> c != null)
                .filter(C -> C.getSum()>= from )
                .filter(c -> c.getSum() <= to)
                .forEach(C -> System.out.println(C));

    }
    public void getExpensBetween(double from, double to){
//        for (int i =0; i < this.expenseLists.length - 1; i++ ) {
//            if (from <= this.expenseLists[i].getSum()&& to >= this.expenseLists[i].getSum()){
//                System.out.println(expenseLists[i]);
//            }else {
//                System.out.println("Irasai nerasti");
//            }
//        }

            Arrays.stream(expenseLists)
                    .filter(c -> c != null)
                    .filter(C -> C.getSum()>= from )
                    .filter(c -> c.getSum() <= to)
                    .forEach(C -> System.out.println(C));
    }
    public void getIncomesByCategory(Enum category){
        Arrays.stream(incomeLists)
                .filter(C -> C.getCategory().equals(category))
                .forEach(System.out::println);
    }
    public void getExpensByCategory(Enum category){
        Arrays.stream(expenseLists)
                .filter(C -> C.getCategory().equals(category))
                .forEach(System.out::println);
    }

}
