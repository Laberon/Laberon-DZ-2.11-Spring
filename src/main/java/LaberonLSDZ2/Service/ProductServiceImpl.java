package LaberonLSDZ2.Service;

import LaberonLSDZ2.Product.Product;
import LaberonLSDZ2.component.BasketComponent;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final BasketComponent basketComponent;

    public ProductServiceImpl(BasketComponent basketComponent) {
        this.basketComponent = basketComponent;
    }
@Override
    public List<Product> add(List<Integer> ids) {
        return basketComponent.add(
                ids.stream()
                        .map(Product::new)
                        .collect(Collectors.toList())
        );
    }
@Override
    public List<Product> get() {
        return basketComponent.get();
    }
}
