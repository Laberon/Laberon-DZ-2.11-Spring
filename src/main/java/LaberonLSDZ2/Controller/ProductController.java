package LaberonLSDZ2.Controller;

import LaberonLSDZ2.Product.Product;
import LaberonLSDZ2.Service.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class ProductController {

    private ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/add")
    public List<Product> add(@RequestParam ("id") List<Integer> ids){
        return productService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Product> get(){//@RequestParam List<Integer> ids
        return productService.get();
    }
}
