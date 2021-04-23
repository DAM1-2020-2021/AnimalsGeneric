package org.iesfm.animals;

public class Cat implements Specie {
    private int lives;

    public Cat(int lives) {
        this.lives = lives;
    }

    @Override
    public void saySomething() {
        System.out.println("miau");
    }

    public void jump(int meters) {
        if (meters > 10) {
            lives--;
        }

        System.out.println("He saltado " + meters + " metros");
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
