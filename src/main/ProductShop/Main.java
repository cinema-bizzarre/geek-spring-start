import controller.ProductController;
import model.Product;
import model.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import service.ProductService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {ProductController.class,
        ProductService.class, ProductRepository.class, Product.class})

public class Main extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application;
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
