package sprint4.exercise2;

public class OutgoingTransactionsMonthlyStatement implements Statement {

    @Override
    public String getTransactionsList(){
        return "-£500.00 (Rent), -£50.00 (Groceries)";
    }

    @Override
    public String getStatementPeriod(){
        return "August 2026";
    }
}
