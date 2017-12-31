package io.github.kpug.chapter1;

/**
 * @author: Lawrence
 * @since: 2017. 12. 2.
 * @note:
 */
public class Purchase {

    public Donut donut;
    public Payment payment;

    public Purchase(Donut donut, Payment payment) {
        this.donut = donut;
        this.payment = payment;
    }


}
