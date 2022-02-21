package lt.henrixlt.service;

import lt.henrixlt.model.CategoryIncome;
import lt.henrixlt.model.IncomeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BudgedServiceTest {
//    public void addIncoms(IncomeList incomeList){
//        this.incomeLists[this.indexIncome] = incomeList;
//        this.indexIncome++;
//    }

    @Test
    @DisplayName("Test add incoms success")
    public void testAddIncoms(){
        BudgedService budgedService = new BudgedService();
        IncomeList incomeList = IncomeList.builder()
                .sum(100)
                .toTheBank(true)
                .category(CategoryIncome.Alga)
                .additionalInfo("nera")
                .build();
        budgedService.addIncoms(incomeList);
        Assertions.assertEquals(incomeList,budgedService.getIncomeLists()[0]);
        Assertions.assertEquals(100,budgedService.getIncomeLists()[0].getSum(),"3 reiksme suma turi buti lygiu 100");
    }


}
//TODO: parasyti J uni testus buged service metodams kekvienam metodui sekmes senarijus kitas nesekmes