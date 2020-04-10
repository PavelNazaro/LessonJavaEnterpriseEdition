package ru.geekbrains;

import ru.geekbrains.cart.CartService;
import ru.geekbrains.cart.LineItem;
import ru.geekbrains.persist.Product;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class CartController implements Serializable {

    @Inject
    private CartService cartService;

    public List<LineItem> getAllLineItems(){
        return cartService.getAllLineItems();
    }

    public void addToCart(Product product){
        cartService.appProductQty(product, "", 1);
    }

    public void removeFromCart(Product product){
        cartService.removeProductQty(product, "", 1);
    }
}
