package io.github.kpug.chapter1;

import java.util.Collections;
import java.util.List;

/**
 * @author: Lawrence
 * @since: 2017. 12. 2.
 * @note:
 */
public class DonutShop {

    public static Tuple<Donut, Payment> buyDonut(final CreditCard cCard) {
        return new Tuple<>(new Donut(), new Payment(cCard, Donut.price));
    }

    public static Tuple<List<Donut>, Payment> buyDonuts(final int quantity, final CreditCard cCard){
        return new Tuple<>(Collections.nCopies(quantity, new Donut()), new Payment(cCard, Donut.price * quantity));
    }
}
