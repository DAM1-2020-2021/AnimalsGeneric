package org.iesfm.animals;

public class Main {

    public static void main(String[] args) {
        // NO COMPILA Animal<Str> str = new Animal("black", 3, "hola");

        Animal<Cat> cat = new Animal("black", 3, new Cat(7));

        cat.getSpecie().jump(4);
    }
}
