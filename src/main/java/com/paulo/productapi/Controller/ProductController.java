package com.paulo.productapi.Controller;

import com.paulo.productapi.ProductModel.ProductModel;
import com.paulo.productapi.ProductService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService proServe;

    @GetMapping("/inventoria")
    public String Crate(long id,String namePro,int codPro, String descPro){
        ProductModel varPro = proServe.createProduto(id,namePro,codPro,descPro);
        return "Id: "+ varPro.getId()+" Name: "+ varPro.getNamePro()+"Codigo: "+varPro.getCodPro()+" Descricao"+varPro.getDescPro();
    }

}
