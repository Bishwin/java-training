package solid.interfacesegregation;

import exceptions.CardPaymentsNotSupported;
import exceptions.InsufficientPaymentException;
import exceptions.OutOfStockException;
import org.apache.commons.collections4.MultiValuedMap;
import payment.Card;
import product.Product;
import product.StockType;

public class BasicVendingMachine_i implements VendingMachine_i {

    private MultiValuedMap<StockType, Product> stock;
    private Double storedCash;

    public BasicVendingMachine_i(MultiValuedMap<StockType, Product> stock) {
        this.stock = stock;
        this.storedCash = 0.0;
    }

    @Override
    public Product purchaseProduct(StockType stockType, Double cash)
        throws OutOfStockException, InsufficientPaymentException {

        Product selectedProduct = stock.get(stockType)
            .stream()
            .findFirst()
            .orElseThrow(() -> new OutOfStockException());

        if (cash < selectedProduct.getPrice()) {
            throw new InsufficientPaymentException();
        }

        stock.get(stockType).remove(selectedProduct);
        storedCash = +cash;

        return selectedProduct;
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
    public Double getCashBalance() {
        return storedCash;
    }

    @Override
    public Product purchaseProduct(StockType stockType, Card card) throws CardPaymentsNotSupported {
        throw new CardPaymentsNotSupported();
    }

}
