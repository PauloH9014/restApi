// File: ProductModel.java (Ou Product.java)

package com.paulo.productapi.ProductModel;

import jakarta.persistence.*;
import lombok.*;

// APRENDIZADO DE JPA.ORM.H2

@Entity // Uma the annotation of tabel of databasee
@Getter
@Setter
public class ProductModel {
    @Id // fields of primary keys
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this annotations is of auto-generate primary-keys.
    private Long id; // JPA

    private String namePro; // -> column
    private int codPro; // -> column
    private String descPro; // -> column
}