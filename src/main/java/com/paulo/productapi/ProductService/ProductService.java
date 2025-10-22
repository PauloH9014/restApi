// File: Service.java (Nomeie como ProductService.java para clareza)

package com.paulo.productapi.ProductService;

// 🚨 CORREÇÃO: Use o caminho e o nome corretos
import com.paulo.productapi.ProductModel.ProductModel;
import com.paulo.productapi.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repositoryProduct;

    // 🚨 CORREÇÃO: O tipo de retorno e de argumento é ProductModel
    public ProductModel save(ProductModel productModel){
        return repositoryProduct.save(productModel);
    }

    // 🚨 CORREÇÃO: O tipo da lista é ProductModel
    public List<ProductModel> findAll(){
        return repositoryProduct.findAll();
    }

    // 🚨 CORREÇÃO: O tipo de retorno é ProductModel
    public ProductModel findById(Long id){
        return repositoryProduct.findById(id).orElse(null);
    }

    public void delete(Long id){
        repositoryProduct.deleteById(id);
    }
}