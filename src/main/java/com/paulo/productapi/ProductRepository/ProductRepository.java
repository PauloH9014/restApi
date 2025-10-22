
package com.paulo.productapi.ProductRepository;

import com.paulo.productapi.ProductModel.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    ProductModel findByName(String name);
}