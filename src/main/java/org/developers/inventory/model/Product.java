package org.developers.inventory.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "product")
@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    private String name;

    private float price;

    private int quantity;

    private String category;

    private float weight;

    @Column(name = "stock")
    private boolean onStock;

}
