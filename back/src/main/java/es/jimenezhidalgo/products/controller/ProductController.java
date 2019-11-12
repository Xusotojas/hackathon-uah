package es.jimenezhidalgo.products.controller;

import es.jimenezhidalgo.products.controller.httpexceptions.IdNotFoundException;
import es.jimenezhidalgo.products.model.Product;
import es.jimenezhidalgo.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    private final ProductService mProductService;

    public ProductController(ProductService productService) {
        mProductService = productService;
    }

    @GetMapping("getUserProducts")
    public List<Product> getUserProducts(@NonNull @RequestParam(value= "id") String dni) {
        System.out.printf(dni);
        List<Product> products = mProductService.getUserProducts(dni);
        if (products.isEmpty()) {
            throw new IdNotFoundException();
        }
        return products;
    }


}
