import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        if (product == null){
            return null;
        }
        return productRepository.addProduct(product);
    }
}
