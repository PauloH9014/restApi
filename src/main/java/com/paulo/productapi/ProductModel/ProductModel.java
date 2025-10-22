// File: ProductModel.java (Ou Product.java)

package com.paulo.productapi.ProductModel;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@NoArgsConstructor // OBRIGATÓRIO para o JPA
@Data // Inclui Getters, Setters, toString, equals, etc.

// 🚨 O NOME DA CLASSE ESTÁ CORRETO: public class ProductModel

public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Agora o Lombok cuida de todos os construtores, Getters e Setters.
}