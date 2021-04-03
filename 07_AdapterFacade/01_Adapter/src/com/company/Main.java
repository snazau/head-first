package com.company;

import com.company.Adapters.DuckAdapter;
import com.company.Adapters.TurkeyAdapter;
import com.company.Birds.SpecificDuck;
import com.company.Birds.SpecificTurkey;
import com.company.Interfaces.Duck;
import com.company.Interfaces.Turkey;

public class Main {
    static void testDuck(Duck duck) {
        System.out.println("Testing duck");
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        System.out.println("Testing turkey");
        turkey.gobble();
        turkey.fly();
    }

    public static void main(String[] args) {
        SpecificDuck duck = new SpecificDuck();
        SpecificTurkey turkey = new SpecificTurkey();

        Turkey duckAdapter = new DuckAdapter(duck);
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Duck into testDuck");
        testDuck(duck);
        System.out.println();

        System.out.println("TurkeyAdapter into testDuck");
        testDuck(turkeyAdapter);
        System.out.println();

        System.out.println("Turkey into testTurkey");
        testTurkey(turkey);
        System.out.println();

        System.out.println("DuckAdapter into testTurkey");
        testTurkey(duckAdapter);
        System.out.println();
    }
}
