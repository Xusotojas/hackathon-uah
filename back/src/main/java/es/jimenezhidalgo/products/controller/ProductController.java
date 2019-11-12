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

    /*@GetMapping
    public List<LogbookEntry> getAllFlights(
            @RequestParam(value = "limit", required=false) Optional<Integer> limit,
            @RequestParam(value = "offset", required=false) Optional<Integer> offset) {
        return mProductServicer.getAllFlights(limit, offset);
    }

    @GetMapping("flight/{id}")
    public LogbookEntry getFlight(@PathVariable("id") int id) {
        LogbookEntry logbookEntry = mProductServicer.getFlight(id).orElse(null);
        return mProductServicer.getFlight(id).orElse(null);
    }

    @PostMapping
    public void addFlight(@Valid @NonNull @RequestBody LogbookEntry logbookEntry) {
        mProductServicer.addFlight(logbookEntry);
    }

    @DeleteMapping
    public void removeFlight(@NonNull @RequestParam(value = "id") int id) {
        if (mProductServicer.removeFlight(id) == 0) {
            throw new IdNotFoundException();
        }
    }

    @PutMapping("update")
    public void updateFlight(@NonNull @RequestParam(value = "id") int id, @NonNull @RequestBody LogbookEntry entryToUpdate) {
        if (mProductServicer.updateFlight(id, entryToUpdate) == 0) {
            throw new IdNotFoundException();
        }
    }*/

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
