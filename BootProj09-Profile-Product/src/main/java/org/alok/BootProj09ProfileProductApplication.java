package org.alok;

import org.alok.controller.ProductController;
import org.alok.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "org.alok")
public class BootProj09ProfileProductApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application and get the application context
        ApplicationContext context = SpringApplication.run(BootProj09ProfileProductApplication.class, args);

        // Retrieve the ProductController bean from the application context
        ProductController controller = context.getBean(ProductController.class);

        // Invoke the method in ProductController to get product information
        try {
            List<Product> productList = controller.showProductInfo(101);
            productList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the application context to gracefully shut down the application
            SpringApplication.exit(context);
        }
    }
}
