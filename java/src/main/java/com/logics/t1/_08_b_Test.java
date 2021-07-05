package com.logics.t1;

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String breed) {
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class _08_b_Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" + dog2.getName() + ":" + dog2.getBreed());
    }
}

/*-

Explanation
abstract class can have constructors and it also possible to have abstract class without any abstract method. So, there is no issue with Animal class.

Java compiler adds super(); as the first statement inside constructor, if call to another constructor using this(...) or super(...) is not available. 

Inside Animal class Constructor, compiler adds super(); => Animal(String name) { super(); this.name = name; }, super() in this case invokes the no-arg constructor of Object class and hence no compilation error here. 

Compiler changes Dog(String) constructor to: Dog(String breed) { super(); this.breed = breed; }. No-arg constructor is not available in Animal class and as another constructor is provided, java compiler doesn't add default constructor. Hence Dog(String) constructor gives compilation error.

There is no issue with Dog(String, String) constructor.

*/
