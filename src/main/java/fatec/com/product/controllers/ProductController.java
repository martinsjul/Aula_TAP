package fatec.com.product.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.com.product.models.Product;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ArrayList<Product> products = new ArrayList();

    public ProductController(){
          
            Product p1 = new Product(1l,
                                    "Notebook", 
                                    3500.00,
                                    "Notebook i7 512 16gb");
          
            Product p2 = new Product();
            p2.setId(2L);
            p2.setName("Smartphone");
            p2.setPrice(2000.00);
            p2.setDescription("Smartphone android 128gb");

            Product p3 = new Product();
            p3.setId(3L);
            p3.setName("Tablet");
            p3.setPrice(1500.00);
            p3.setDescription("Tablet android 64gb");

            products.add(p1);
            products.add(p2);   
            products.add(p3);

             

    }      

        @GetMapping("/{}id")
        public Product geProductById(@PathVariable long id) {
            return products
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

           
        }


        @GetMapping
        public ArrayList<Product> getProducts() {
            return products;
        }
        //aqui dannn
        @PostMapping
        public Product createProduct(Product product){
            products.add(product);
            return product;
        }

}
