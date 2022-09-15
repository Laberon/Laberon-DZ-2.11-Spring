package LaberonLSDZ2.component;


import LaberonLSDZ2.Product.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class BasketComponent {

    private final List<Product> products;

    public BasketComponent() {
        this.products = new ArrayList<>();
    }

    public List<Product> get() {
        return Collections.unmodifiableList(products);
    }

    public List<Product> add(List<Product> products) {
        this.products.addAll(products);
        return this.products;
    }
}
