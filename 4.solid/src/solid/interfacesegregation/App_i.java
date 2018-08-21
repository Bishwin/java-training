package solid.interfacesegregation;


import exceptions.CardPaymentsNotSupported;
import exceptions.CashPaymentsNotSupportedException;
import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import payment.Card;
import product.Product;
import product.Stock;
import product.StockType;

public class App_i {

    public static void main(String[] args)
        throws OutOfStockException, InsufficientPaymentException, CashPaymentsNotSupportedException, CardPaymentsNotSupported {

        /* The business requires that we support card payments for our vending machines.
        In addition, our designer indicates that more changes are in the backlog.

        Refactor BasicVendingMachine_i to comply with interface segregation principle */

        BasicVendingMachine_i basicVendingMachine = new BasicVendingMachine_i(Stock.getStock());

        Product cola = basicVendingMachine.purchaseProduct(StockType.COLA, 0.9);

        Card santanderCard = new Card(100.58);

        CardPaymentVendingMachine_i cardVendingMachine = new CardPaymentVendingMachine_i(Stock.getStock());
        Product lion = cardVendingMachine.purchaseProduct(StockType.LION, santanderCard);
        //cardVendingMachine.purchaseProduct(StockType.FANTA, 0.7);

    }
}
