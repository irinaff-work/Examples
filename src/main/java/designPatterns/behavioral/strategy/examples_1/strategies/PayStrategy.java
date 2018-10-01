package designPatterns.behavioral.strategy.examples_1.strategies;

/**
 * Created by IFatkullina on 26.09.2018.
 * Общий интерфейс стратегий оплаты
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
