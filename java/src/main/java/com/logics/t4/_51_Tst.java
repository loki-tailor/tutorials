package com.logics.t4;

import java.util.ArrayList;
import java.util.List;

interface Sellable {
}

abstract class Animal {
}

class Mamal extends Animal {
}

class Rabbit extends Mamal implements Sellable {
}

public class _51_Tst {

    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }

    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mamal());
    }

    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Mamal());
    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }

}
