package LaberonLSDZ2.Service;

import LaberonLSDZ2.Product.Product;

import java.util.List;

public interface ProductService {
    List<Product> add(List<Integer> ids);

    List<Product> get();
}
