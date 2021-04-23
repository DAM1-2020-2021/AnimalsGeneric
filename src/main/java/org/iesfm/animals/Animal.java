package org.iesfm.animals;

import java.util.Objects;

public class Animal<T extends Specie> {
    private String color;
    private int age;
    private T specie;

    public Animal(String color, int age, T specie) {
        this.color = color;
        this.age = age;
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getSpecie() {
        return specie;
    }

    public void setSpecie(T specie) {
        this.specie = specie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal<?> animal = (Animal<?>) o;
        return getAge() == animal.getAge() && Objects.equals(getColor(), animal.getColor()) && Objects.equals(getSpecie(), animal.getSpecie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getAge(), getSpecie());
    }
}
