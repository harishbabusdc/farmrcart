package technology.kie.farmrcart.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import technology.kie.farmrcart.brand.Product;
import technology.kie.farmrcart.brand.ProductRepository;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class ProductDtoController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/productdto")
    public List<ProductDto> productDtoList(){
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        products.forEach(product -> {
            ProductDto productDto = new ProductDto();
            productDto.setImage(product.getImage());
            productDto.setLink(product.getLink());
            productDto.setTitle(product.getTitle());
            productDto.setSubtitles(product.getSubtitle());
            productDtos.add(productDto);

        });
        return productDtos;
    }
    @PostMapping("/productdto")
    public Product productSave(@RequestBody Product product){
        Product productsave = productRepository.save(product);
        return productsave;
    }

}