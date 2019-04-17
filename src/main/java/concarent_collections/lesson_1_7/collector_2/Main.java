package concarent_collections.lesson_1_7.collector_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 30.03.2019
 **/

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(new Account(1000L, "1917", "active"),
                new Account(10_000_000L, "7777", "deleted"),
                new Account(100_00L, "6969", "active"));

        //Grouping and print all accounts with "active" status
        //Группировка и распечатка всех аккаунтов со статусом «активный»
        Map<String, List<Account>> groupingByStatus = accounts.stream().collect(
                Collectors.groupingBy(Account::getStatus));
        groupingByStatus.get("active").forEach(ac -> System.out.println("status:" +
                ac.getStatus() + " balance: " + ac.getBalance()));

        //partition
        /*
        эта операция проще, чем группировка, и она делит поток по предикату на 2 части.
        Этот код печатает учетные записи по флагу (true или false) в соответствии
        с предикатом a-> a.getBalance ()> = 10_000
         */
        Map<Boolean, List<Account>> partByBalance = accounts.stream().collect(
                Collectors.partitioningBy(a -> a.getBalance() >= 10_000));
        partByBalance.forEach((k, v) -> {
            System.out.print("flag: " + k + " -> \n");
            v.forEach(ac -> System.out.println("account number: " + ac.getNumber() +
                    " balance: " + ac.getBalance()));
        });

        //Этот код рассчитывает сумму остатков по всем счетам по статусу
        Map<String, Long> sumByStatus = accounts.stream().collect(
                Collectors.groupingBy(Account::getStatus, Collectors.summingLong(Account::getBalance)));
        sumByStatus.forEach((k, v) -> System.out.println(k + ": "+  String.valueOf(v)));

        //Иногда полезно получить некоторую статистику из потока данных.
        // Вот как вы можете сделать это, используя класс Collectors:
        // среднее значение сальдо
        System.out.println(accounts.stream().collect(Collectors.summarizingLong(
                Account::getBalance)) + "\n" +
                accounts.stream().collect(Collectors.averagingLong(Account::getBalance)));


    }
}
