package org.iesfm.animals;

public class Dog implements Specie {
    private String kind;

    public Dog(String kind) {
        this.kind = kind;
    }

    @Override
    public void saySomething() {
        System.out.println("guau");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
