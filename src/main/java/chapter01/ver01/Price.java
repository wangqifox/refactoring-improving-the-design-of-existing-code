package chapter01.ver01;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-04-30 15:06
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
}
