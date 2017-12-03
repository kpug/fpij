package io.github.kpug;

/**
 * @author: Lawrence
 * @since: 2017. 12. 2.
 * @note:
 */
public class Payment {
    public final CreditCard creditCard;
    public final int amount;

    public Payment(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    public Payment combine(Payment payment){
        if(creditCard.equals(payment.creditCard)) {
            return new Payment(creditCard, amount + payment.amount);
        } else {
            throw new IllegalArgumentException("Cards don't match.");
        }
    }
}
