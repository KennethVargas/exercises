package lesson4.datesAndCalendar;

import java.util.Date;

public class TransactionTester {

    public static void main(String[] args) {
        Transaction transaction = new Transaction("Withdrawal", new Date(), "11101", 50.00 );
        System.out.println(transaction);
    }
}