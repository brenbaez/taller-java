package net.edu.isistan.taller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Par<Animal, Jaula>> animals = new ArrayList<>();
        animals.add(new Par(new Animal("gato",5, 5), new Jaula("gato jaula", 1, "norte")));
        animals.add(new Par(new Animal("perro",5, 5), new Jaula("perro jaula", 1, "norte")));

        animals.stream().forEach(par -> System.out.println(
                "Animal's name: " + par.getL().getName() +
                        ". And it's jails is: " + par.getF().getTitle()));
    /*            Stream.of(
                new Par(new Animal("gato",5, 5), new Jaula("gato jaula", 1, "norte")),
                new Par(new Animal("perro",5, 5), new Jaula("perro jaula", 1, "sur"))
        ).collect(Collectors.toList());*/


    }
}
