package io.github.kpug.chapter1;

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

    public static Payment combine2(Payment payment1, Payment payment2) {
        if(payment1.creditCard.equals(payment2.creditCard)){
            return new Payment(payment1.creditCard, payment1.amount + payment2.amount);
        } else {
            throw new IllegalArgumentException("Can't combine payments to different cards");
        }
    }
}
