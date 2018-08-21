package solid.dependencyinversion;

import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import payment.Card;
import product.Product;
import product.Stock;
import product.StockType;

public class App_d {

    public static void main(String[] args)
        throws InsufficientPaymentException, OutOfStockException {

        /* The business has provided advertisement modules which need installing into our vending machines.
        Refactor EmotionalAdVendingMachine & FancyAdVendingMachine to comply with the dependency inversion principle. */

        Card hsbc = new Card(20);

        BasicVendingMachine_d emotionalAdVendingMachine = new EmotionalAdVendingMachine(Stock.getStock());
        Product cola = emotionalAdVendingMachine.purchaseProduct(StockType.COLA, hsbc);

        BasicVendingMachine_d fancyAdVendingMachine = new FancyAdVendingMachine(Stock.getStock());
        Product sprite = fancyAdVendingMachine.purchaseProduct(StockType.SPRITE, hsbc);
    }
}
