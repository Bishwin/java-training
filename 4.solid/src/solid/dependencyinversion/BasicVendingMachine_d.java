package solid.dependencyinversion;

import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import org.apache.commons.collections4.MultiValuedMap;
import payment.Card;
import product.Product;
import product.StockType;

public interface BasicVendingMachine_d {

    Product purchaseProduct(StockType stockType, Card card)
        throws OutOfStockException, InsufficientPaymentException;

    MultiValuedMap<StockType, Product> getStock();

    void stockUp(MultiValuedMap<StockType, Product> stock);
}
