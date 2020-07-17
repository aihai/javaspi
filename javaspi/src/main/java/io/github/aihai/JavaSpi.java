package io.github.aihai;

import java.util.ServiceLoader;

public class JavaSpi {

    public static void main(String[] args) {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for (Animal animal : animals) {
            animal.who();
        }
    }
}
