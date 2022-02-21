package lt.henrixlt.service;

import lt.henrixlt.model.CategoryExpenses;
import lt.henrixlt.model.CategoryIncome;
import lt.henrixlt.model.ExpenseList;
import lt.henrixlt.model.IncomeList;
import lt.henrixlt.model.PaymentMethod;
import lt.henrixlt.util.Meniu;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AppService {
    private BudgedService budgedService = new BudgedService();


    private int incomeID;
    private int expensesID;

    public void runApp() {

        Scanner scanner = new Scanner(System.in);
        stage1:
        while (true) {
            System.out.println("Prasome pasirinkti: ");
            Meniu.printMeniu();
            switch (scanner.next()) {
                case "1":
                    IncomeList incomeList = new IncomeList();
                    incomeID++;
                    setIncoms(scanner,incomeList);
                    budgedService.addIncoms(incomeList);
                    break;
                case "2":
                    ExpenseList expenseList = new ExpenseList();
                    System.out.println("iveskite Islaidu suma :");
                    double expenses = scanner.nextDouble();
                    setExpenses(scanner, expenses,expenseList);
                    budgedService.addExpenseList(expenseList);


                    break;
                case "3":
                    Arrays.stream(budgedService.getExpenseLists())
                            .filter(a -> a != null)
                            .forEach(System.out::println);
                    break;
                case "4":

                    Arrays.stream(budgedService.getIncomeLists())
                            .filter(a -> a != null)
                            .forEach(System.out::println);
                    break;
                case "5":
                    //gauti islaidas pagal ID
                    System.out.println("iveskite suma nuo:");
                    double from = scanner.nextDouble();
                    System.out.println("iveskite suma iki");
                    double to = scanner.nextDouble();
                    budgedService.getExpensBetween(from,to);

                    break;
                case "6":
                    //Gauti pajemas pagal ID
                    System.out.println("iveskite suma nuo:");
                    double from2 = scanner.nextDouble();
                    System.out.println("iveskite suma iki");
                    double to2 = scanner.nextDouble();
                    budgedService.getIncomeBetween(from2,to2);

                    break;
                case "7":
                    //pagal kategorija islaidos
                    System.out.println("pasirinkite kategorija");
                    Meniu.prinCategoryExpens();
                    budgedService.getExpensByCategory(CategoryExpenses.valueOf(scanner.next().toUpperCase(Locale.ROOT)));

                    break;
                case "8":
                    // pagal kategorija pagal pajemas
                    System.out.println("pasirinkite kategorija");
                    Meniu.printCategoryIncome();
                    budgedService.getIncomesByCategory(CategoryIncome.valueOf(scanner.next()));

                    break;
                case "9":
                    break stage1;
                default:
                    System.out.println("ivesta bloga reiksme");
            }
        }
    }

    private void setIncoms(Scanner scanner,IncomeList incomeList ) {
        incomeList.setId(incomeID);
        System.out.println("iveskite norima pinigu suma patalpinti i savo saskaita: ");
        incomeList.setSum(scanner.nextDouble());
        setCategoryIncome(scanner, incomeList);
        incomeList.setToTheBank(true);
        System.out.println("iveskite papildoma info");
        incomeList.setAdditionalInfo(scanner.next());
        budgedService.setBalance(budgedService.getBalance() + incomeList.getSum());
    }

    private void setCategoryIncome(Scanner scanner, IncomeList incomeList) {
        System.out.println("pasirinkite kategorija: ");
        Meniu.printCategoryIncome();
        switch (scanner.next()){
            case "1":
                incomeList.setCategory(CategoryIncome.Alga);
                break;
            case "2":
                incomeList.setCategory(CategoryIncome.Hobiai);
                break;
            case "3":
                incomeList.setCategory(CategoryIncome.ParduotasDaiktas);
                break;
            case "4":
                incomeList.setCategory(CategoryIncome.PasiskolinauIskaimyno);
                break;
            case "5":
                incomeList.setCategory(CategoryIncome.BobutesPaskola);
                break;
            default:
                System.out.println("ivesta bloga reiksme");
        }
    }

    private void setExpenses(Scanner scanner, double expenses,ExpenseList expenseList) {
        if (expenses < budgedService.getBalance()) {
            expensesID++;
            expenseList.setId(expensesID);
            expenseList.setSum(expenses);
            budgedService.setBalance(budgedService.getBalance() - expenses);
            setCategoryEXpens(scanner, expenseList);
            setPaymentMethod(scanner, expenseList);
        } else {
            System.out.println("nepakankamas likutis");
        }

        System.out.println("iveskite papildoma informacija");
        expenseList.setAdditionalInfo(scanner.next());
    }

    private void setCategoryEXpens(Scanner scanner, ExpenseList expenseList) {
        System.out.println("pasirinkite kategorija: ");
        Meniu.prinCategoryExpens();
        switch (scanner.next()){
            case "1":
                expenseList.setCategory(CategoryExpenses.MaistasIrBiutis);
                break;
            case "2":
                expenseList.setCategory(CategoryExpenses.Transportas);
                break;
            case "3":
                expenseList.setCategory(CategoryExpenses.AtostogosIrkeliones);
                break;
            case "4":
                expenseList.setCategory(CategoryExpenses.SveikataIrGrozis);
                break;
            case "5":
                expenseList.setCategory(CategoryExpenses.Namai);
                break;
            case "6":
                expenseList.setCategory(CategoryExpenses.KitosIslaidos);
                break;
            default:
                System.out.println("ivesta neteisinga reiksme");

        }
    }

    private void setPaymentMethod(Scanner scanner, ExpenseList expenseList) {
        System.out.println("pasirinkite mokejimo buda :");
        Meniu.printCategory();

        switch (scanner.next()) {
            case "1":
                expenseList.setPaymentMethod(PaymentMethod.Card);
                break;
            case "2":
                expenseList.setPaymentMethod(PaymentMethod.Cash);

                break;
            case "3":
                expenseList.setPaymentMethod(PaymentMethod.Paypal);
                break;
            case "4":
                expenseList.setPaymentMethod(PaymentMethod.BTC);
                break;
            case "5":
                expenseList.setPaymentMethod(PaymentMethod.ETH);
                break;
            case "6":
                expenseList.setPaymentMethod(PaymentMethod.SOL);
                break;
            default:
                System.out.println("ivesta bloga reiksme");
        }
    }
}
