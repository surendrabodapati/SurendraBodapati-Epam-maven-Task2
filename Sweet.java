/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newyear;

/**
 *
 * @bhuvanbandarupalli
 */
public class Sweet {
    int price,weight;
    Sweet(int price,int weight)
    {
        this.price=price;
        this.weight=weight;
    }
                int getPrice()
    {
        return price;
    }
    int getWeight()
    {
        return weight;
    }
    String className()
    {
        return "sweet";
    }
}
