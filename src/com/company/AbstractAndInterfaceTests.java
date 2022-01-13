package com.company;

import com.company.Animal.Animal;
import com.company.Animal.Chicken;
import com.company.Animal.Tiger;
import com.company.Edible.Edible;
import com.company.fruits.Apple;
import com.company.fruits.Fruits;
import com.company.fruits.Orange;

public class AbstractAndInterfaceTests {

    public static void main(String[] args) {
        Animal animals[] = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoeat());
            } else if (animal instanceof Tiger) {
                Edible edible = (Tiger) animal;
                System.out.println(edible.howtoeat());
            }
        }
        Fruits fruits[] = new Fruits[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruits fruit : fruits) {
            System.out.println(fruit.howtoeat());

//            if (fruit instanceof Apple) {
//                Edible edible = (Apple) fruit;
//                System.out.println(edible.howtoeat());
//            } else if (fruit instanceof Orange) {
//                Edible edible = (Orange) fruit;
//                System.out.println(edible.howtoeat());
//            }
        }
    }
}