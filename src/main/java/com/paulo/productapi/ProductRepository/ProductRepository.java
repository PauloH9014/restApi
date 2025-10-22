// File: ProductRepository.java

package com.paulo.productapi.ProductRepository;

// 🚨 CORREÇÃO: Importe ProductModel, não Product.
import com.paulo.productapi.ProductModel.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    // 🚨 CORREÇÃO: O tipo de retorno deve ser ProductModel, não Product
    ProductModel findByName(String name);
}