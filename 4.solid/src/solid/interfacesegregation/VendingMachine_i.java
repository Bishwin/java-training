package solid.interfacesegregation;

import exceptions.CardPaymentsNotSupported;
import exceptions.CashPaymentsNotSupportedException;
import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import org.apache.commons.collections4.MultiValuedMap;
import payment.Card;
import product.Product;
import product.StockType;

public interface VendingMachine_i {

    /* The problem is the interface is forcing sub classes to implement methods they do not need.
    This is a violation of the interface segregation principle */

    void stockUp(MultiValuedMap<StockType, Product> stock);

    MultiValuedMap<StockType, Product> getStock();

    Product purchaseProduct(StockType stockType, Double cash)
        throws OutOfStockException, InsufficientPaymentException, CashPaymentsNotSupportedException;

    Double getCashBalance() throws CashPaymentsNotSupportedException;

    Product purchaseProduct(StockType stockType, Card card)
        throws CardPaymentsNotSupported, OutOfStockException, InsufficientPaymentException;
}
