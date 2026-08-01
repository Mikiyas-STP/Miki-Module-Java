package sprint4.exercise2;

public interface StatementSender {
    void sendStatement(String statementContent);

    // Overloaded method- accepts Statement contract
    void sendStatement(Statement statement);
}