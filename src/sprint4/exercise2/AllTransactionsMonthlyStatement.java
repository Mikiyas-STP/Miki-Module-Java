package sprint4.exercise2;

public class AllTransactionsMonthlyStatement implements Statement {

    @Override
    public String getTransactionsList() {
        return " +£2,000.00 (Salary), -£500.00 (Rent), -£50.00 (Groceries)";
    }

    @Override
    public String getStatementPeriod() {
        return "Jan 2026";
    }
}
