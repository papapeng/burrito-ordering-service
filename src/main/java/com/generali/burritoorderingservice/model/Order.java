package com.generali.burritoorderingservice.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    public Order() {
        // do nothing
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tortilla;
    private String protein;
    private String vegetables;
    private String salsa;
    private int avocadoCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public int getAvocadoCount() {
        return avocadoCount;
    }

    public void setAvocadoCount(int avocadoCount) {
        this.avocadoCount = avocadoCount;
    }
}