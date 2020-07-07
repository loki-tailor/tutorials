package com.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

/*-
 * 
 * @author lokeshwar @created 07-07-2020
 *
 *	"The access level can't be more restricitive than that of the overridden method"
 *	"The access level CAN be less restricitive than that o the overridden method"
 *
 * Permissible subclass modifiers, based on superclass modifier, for same method:
 * * If - superclass has 'public', then subclass can't have 'private' or 'protected' or 'default'
 * * If - superclass has 'protected', then subclass can have 'public' & 'protected', but not 'private' or 'default'
 * * If - superclass has 'private', then subclass can have 'public', 'private', 'protected' or 'default'
 * * If - superclass has 'default' i.e. no keyword, then subclass can have 'public', 'protected', 'default', but not 'private'
 */

public class RestrictiveAccessModifierInOverridingMethod {
    public static void main(String[] args) {
	Animal a = new Animal();
	Animal b = new Horse();
//	a.eat();
//	b.eat();
    }
}

class Animal {
    void eat() throws IOException {
	System.out.println("Generic Animal Eating Generically");
    }
}

class Horse extends Animal {
    
    // below will give error as:
    // eclipse compile error: Cannot reduce the visibility of the inherited method from Animal
    // private void eat() {
    
    public void eat() throws FileNotFoundException {
	System.out.println("Horse class is eating !!");
    }
}
