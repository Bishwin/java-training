package solid.openclosed;

import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import product.Product;
import product.Stock;
import product.StockType;

public class App_o {

    public static void main(String[] args) throws InsufficientPaymentException, OutOfStockException {

        /* The business requires that new vending machine features are delivered quickly.
        To avoid retesting existing products each time we develop a new feature we must avoid modifying them.

        Refactor BasicVendingMachine_o to comply with open / closed principle */

        BasicVendingMachine_o basicVendingMachine = new BasicVendingMachine_o(Stock.getStock());
        Product fanta = basicVendingMachine.purchaseProduct(StockType.FANTA, 1.0);
    }

}
