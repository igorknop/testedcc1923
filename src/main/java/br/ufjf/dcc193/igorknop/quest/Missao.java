package br.ufjf.dcc193.igorknop.quest;

public class Missao {
    private Heroi heroi;

    public Missao(Heroi heroi){
        System.out.println("O Rei criou uma nova missão!");
        setHeroi(heroi);
    }
    public Missao(){
        this(null);
    }

    public void iniciar(){
        System.out.println("A missão teve início.");
    }
    public void concluir() {
        this.heroi.agir();
        System.out.println("A missão chegou ao fim!");
    }

    public Heroi getHeroi() {
        return heroi;
    }

    public void setHeroi(Heroi heroi) {
        this.heroi = heroi;
    }
    
}
