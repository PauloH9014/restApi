
package com.paulo.productapi.ProductService;

import com.paulo.productapi.ProductModel.ProductModel;
import com.paulo.productapi.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repositoryProduct;

    public ProductModel save(ProductModel productModel){
        return repositoryProduct.save(productModel);
    }

    public List<ProductModel> findAll(){
        return repositoryProduct.findAll();
    }

    public ProductModel findById(Long id){
        return repositoryProduct.findById(id).orElse(null);
    }

    public void delete(Long id){
        repositoryProduct.deleteById(id);
    }
}