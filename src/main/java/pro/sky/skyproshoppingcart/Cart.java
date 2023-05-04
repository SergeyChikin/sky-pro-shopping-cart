package pro.sky.skyproshoppingcart;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope

public class Cart {
    private List<Integer> cart = new ArrayList<>();

    public void addAllPurchases(List<Integer> values) {
        cart.addAll(values);
    }

    public List<Integer> getAllPurchases() {
        return cart;
    }
}
