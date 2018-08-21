package solid.singleresponsibility;

import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import payment.Card;
import product.Stock;
import product.StockType;

public class App_s {

    public static void main(String[] args) throws InsufficientPaymentException, OutOfStockException {

        /* The business requires a vending machine which can accept card payments for products.
        Refactor the VendingMachine_s class to comply with the Single Responsibility principle */

        Card llyods = new Card(500);

        VendingMachine_s vendingMachine = new VendingMachine_s(Stock.getStock());
        vendingMachine.purchaseProduct(StockType.WALKERS, llyods);
        vendingMachine.getStock();

    }
}
