package solid.interfacesegregation;

import exceptions.CardPaymentsNotSupported;
import exceptions.CashPaymentsNotSupportedException;
import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import org.apache.commons.collections4.MultiValuedMap;
import payment.Card;
import product.Product;
import product.StockType;

public class CardPaymentVendingMachine_i implements VendingMachine_i {

    private MultiValuedMap<StockType, Product> stock;

    public CardPaymentVendingMachine_i(MultiValuedMap<StockType, Product> stock) {
        this.stock = stock;
    }

    @Override
    public void stockUp(MultiValuedMap<StockType, Product> stock) {
        this.stock = stock;
    }

    @Override
    public MultiValuedMap<StockType, Product> getStock() {
        return stock;
    }

    @Override
    public Product purchaseProduct(StockType stockType, Card card)
        throws CardPaymentsNotSupported, OutOfStockException, InsufficientPaymentException {

        Product selectedProduct = stock.get(stockType)
            .stream()
            .findFirst()
            .orElseThrow(() -> new OutOfStockException());

        if (!card.isAuthorised(selectedProduct.getPrice())) {
            throw new InsufficientPaymentException();
        }

        stock.get(stockType).remove(selectedProduct);

        return selectedProduct;
    }

    @Override
    public Product purchaseProduct(StockType stockType, Double cash)
        throws OutOfStockException, InsufficientPaymentException, CashPaymentsNotSupportedException {
        throw new CashPaymentsNotSupportedException();
    }

    @Override
    public Double getCashBalance() throws CashPaymentsNotSupportedException {
        throw new CashPaymentsNotSupportedException();
    }
}
