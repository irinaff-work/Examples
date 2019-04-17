package concarent_collections.lesson_1_7.collector_2;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 30.03.2019
 **/

public class Account {
    private long balance;
    private String number;
    private String status;

    public Account(long balance, String number, String status) {
        this.balance = balance;
        this.number = number;
        this.status = status;
    }

    public long getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public String getNumber() {
        return number;
    }
}
