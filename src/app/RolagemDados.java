package app;

import java.util.Random;
import java.util.Scanner;

public class RolagemDados {

    Scanner entrada = new Scanner(System.in);
    private Personagem P;
    private int atributo;
    private int pericia;
    private int dador;
    private int resultado;
    int maior = 0;

    public RolagemDados(Personagem p) {
        this.P = p;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

    public int getPericia() {
        return pericia;
    }

    public void setPericia(int pericia) {
        this.pericia = pericia;
    }

    public int getDador() {
        return dador;
    }

    public void setDador(int dador) {
        this.dador = dador;
    }

    /*===================================================================================================================*/
 /*===================================================================================================================*/
    public void acrobacias() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void adestramento() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void artes() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void atletismo() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void crime() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void ciencia() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void diplomacia() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void enganacao() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void fortitude() {
        this.setPericia(0);
        this.setAtributo(P.getVigor());

    }

    public void furtividade() {
        this.setPericia(0);
        this.setAtributo(P.getVigor());

    }

    public void iniciativa() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void intimidacao() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void intuicao() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void luta() {
        this.setPericia(0);
        this.setAtributo(P.getForça());

    }

    public void investigacao() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void medicina() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void percepcao() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void pilotagem() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void pontaria() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void profissao() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void reflexo() {
        this.setPericia(0);
        this.setAtributo(P.getAgilidade());

    }

    public void religiao() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void sobrevivencia() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void tecnologia() {
        this.setPericia(0);
        this.setAtributo(P.getInteligencia());

    }

    public void vontade() {
        this.setPericia(0);
        this.setAtributo(P.getPresença());

    }

    public void magias() {
        this.setPericia(0);
        this.setAtributo(P.getForça());

    }

    /*===================================================================================================================*/
    /*===================================================================================================================*/
    public void escolhaDado() {
        System.out.println("Qual perícia o personagem deverá testar? ");

        System.out.println("");
        System.out.println("1- Acrobacias 2- Adestramento 3- Artes 4- Atletismo 5- Crime 6- Ciência 7- Diplomacia 8- Enganção 9- Fortitude 10- Furtividade");
        System.out.println("11- Iniciativa 12- Intimidação 13 - Intuição 14- Luta 15- Investigacao 16- Medicina 17- percepcao 18- pilotagem 19- pontaria");
        System.out.println("20- profissao 21- reflexo 22- religiao 23- sobrevivencia 24- Tecnologia 25- Vontade 26- Magias");
        int resp = entrada.nextInt();
        System.out.println("");
        System.out.println("");
        

        switch (resp) {
            case 1 -> {
                acrobacias();
                break;
            }
            case 2 -> {
                adestramento();
                break;
            }
            case 3 -> {
                artes();
                break;
            }
            case 4 -> {
                atletismo();
                break;
            }
            case 5 -> {
                crime();
                break;
            }
            case 6 -> {
                ciencia();
                break;
            }
            case 7 -> {
                diplomacia();
                break;
            }
            case 8 -> {
                enganacao();
                break;
            }
            case 9 -> {
                fortitude();
                break;
            }
            case 10 -> {
                furtividade();
                break;
            }
            case 11 -> {
                iniciativa();
                break;
            }
            case 12 -> {
                intimidacao();
                break;
            }
            case 13 -> {
                intuicao();
                break;
            }
            case 14 -> {
                luta();
                break;
            }
            case 15 -> {
                investigacao();
                break;
            }
            case 16 -> {
                medicina();
                break;
            }
            case 17 -> {
                percepcao();
                break;
            }
            case 18 -> {
                pilotagem();
                break;
            }
            case 19 -> {
                pontaria();
                break;
            }
            case 20 -> {
                profissao();
                break;
            }
            case 21 -> {
                reflexo();
                break;
            }
            case 22 -> {
                religiao();
                break;
            }
            case 23 -> {
                sobrevivencia();
                break;
            }
            case 24 -> {
                tecnologia();
                break;
            }
            case 25 -> {
                vontade();
                break;
            }
            case 26 -> {
                magias();
                break;
            }

        }
        rolagem();
    }

    public void rolagem() {
        Random random = new Random();
        int i = atributo;


        do {

            dador = random.nextInt(1, 20);
            System.out.println(dador);

            if (maior < dador) {
                maior = dador;
            }
            i--;
        } while (i != 0);
        System.out.println("");
        System.out.println("");
        this.resultado = maior + pericia;
        System.out.println("Resultado de maior valor : " + maior);
        System.out.println("Maior valor : " + maior + " + " + " pericia : " + pericia + " : " + resultado);

    }

}
