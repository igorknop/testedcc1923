package br.ufjf.dcc193.igorknop.quest;

public class Clerigo implements Heroi {
    public Clerigo(){
        System.out.println("Um novo clérigo chega ao reino...");
    }
    public void agir() {
        System.out.println("O clérigo cura!");
    }
}
