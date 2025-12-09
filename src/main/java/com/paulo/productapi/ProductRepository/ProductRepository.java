
package com.paulo.productapi.ProductRepository;

import com.paulo.productapi.ProductModel.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Spring interface promovies basic crud of operations
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    ProductModel findByName(String name);
    ProductModel findByCod(String name);
    ProductModel findByDesc(String name);
}