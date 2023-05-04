package pro.sky.skyproshoppingcart.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyproshoppingcart.Cart;

import java.util.List;

@Service
public class StoreService {

    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void addAllPurchases(List<Integer> values) {
        cart.addAllPurchases(values);
    }

    public List<Integer> getAllPurchases() {
        return cart.getAllPurchases();
    }
}
