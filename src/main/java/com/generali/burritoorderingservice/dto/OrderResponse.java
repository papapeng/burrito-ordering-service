package com.generali.burritoorderingservice.dto;

import com.generali.burritoorderingservice.constant.Protein;
import com.generali.burritoorderingservice.constant.Salsa;
import com.generali.burritoorderingservice.constant.Tortilla;
import com.generali.burritoorderingservice.constant.Vegetable;

import java.util.List;

public class OrderResponse {

    private Long id;
    private Tortilla tortilla;
    private Protein protein;
    private List<Vegetable> vegetables;
    private Salsa salsa;
    private int avocadoCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public int getAvocadoCount() {
        return avocadoCount;
    }

    public void setAvocadoCount(int avocadoCount) {
        this.avocadoCount = avocadoCount;
    }
}
