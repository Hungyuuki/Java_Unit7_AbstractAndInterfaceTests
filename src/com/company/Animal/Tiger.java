package com.company.Animal;

import com.company.Edible.Edible;

public class Tiger extends Animal implements Edible {
        @Override
        public String makeSound() {
            return "Tiger: roarrrrr!";
        }
        @Override
    public String howtoeat(){
            return "It could be fresh";
        }
    }

