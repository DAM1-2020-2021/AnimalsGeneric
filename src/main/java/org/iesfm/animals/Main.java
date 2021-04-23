package org.iesfm.animals;

public class Main {

    public static void main(String[] args) {
        // Animal<String> str = new Animal("black", 3, "hola"); // no compila por culpa del type bound

        Animal<Cat> cat = new Animal("black", 3, new Cat(7));
        Animal<Mouse> mouse = new Animal("black", 3, new Mouse());

        cat.getSpecie().jump(4);
    }
}
