package objectProgramming1.PaymentCalculator;

public class PaymentCalculator {
    private static final int YEAR_MONTHS = 12;


    public double nettoYearPayment(Employee emp) {
        return emp.getMonthlySalary() * YEAR_MONTHS;
    }

    public void bruttoYearPayment(Employee emp) {

    }
}
