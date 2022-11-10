package using_hibernate_part_2.service;

import com.geekbrains.persistence.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductList();

    void saveOrUpdate(Product product);

    Product getProductById(Long id);

    void deleteById(Long id);

}
