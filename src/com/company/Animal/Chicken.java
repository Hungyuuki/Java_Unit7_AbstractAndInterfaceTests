package com.company.Animal;

import com.company.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howtoeat(){
        return "It could be fried";
    }
}
