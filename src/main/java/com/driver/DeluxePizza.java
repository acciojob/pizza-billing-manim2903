package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg); // parent constructor is being called
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
