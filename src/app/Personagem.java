package app;

import java.util.ArrayList;

public class Personagem {

    private String Nome;
    private int vida;
    private int sanidade;

    private int força;
    private int agilidade;
    private int presença;
    private int vigor;
    private int inteligencia;

    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getPresença() {
        return presença;
    }

    public void setPresença(int presença) {
        this.presença = presença;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void apresentacao() {
        System.out.println("");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Vida: " + this.getVida());
        System.out.println("Sanidade: " + this.getSanidade());
        System.out.println("força: " + this.getForça());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Presença: " + this.getPresença());
        System.out.println("Vigor: " + this.getVigor());
        System.out.println("Inteligência: " + this.getInteligencia());
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }

}
