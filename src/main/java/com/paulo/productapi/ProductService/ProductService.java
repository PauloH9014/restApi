
package com.paulo.productapi.ProductService;

import com.paulo.productapi.ProductModel.ProductModel;
import com.paulo.productapi.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Descriptor;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repositoryProduct;

    public ProductModel createProduto(long id,String namePro,int codPro, String descPro){
        ProductModel varPro = new ProductModel();
        varPro.setId(id);
        varPro.setNamePro(namePro);
        varPro.setCodPro(codPro);
        varPro.setDescPro(descPro);
        return repositoryProduct.save(varPro);
    }
    public ProductModel getProduto(Long id){
       return repositoryProduct.findById(id).orElse(null);
    }
}