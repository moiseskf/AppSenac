

package app;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroPersonagem extends Personagem {

    public void cadastro() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Informe os dados do Personagem ");

        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        this.setNome(nome);

        System.out.println("Vida: ");
        int vida = entrada.nextInt();
        this.setVida(vida);

        System.out.println("Sanidade: ");
        int sanidade = entrada.nextInt();
        this.setSanidade(sanidade);

        System.out.println("força: ");
        int forca = entrada.nextInt();
        this.setForça(forca);

        System.out.println("Agilidade");
        int agi = entrada.nextInt();
        this.setAgilidade(agi);

        System.out.println("Presença: ");
        int presenca = entrada.nextInt();
        this.setPresença(presenca);

        System.out.println("Vigor: ");
        int vigor = entrada.nextInt();
        this.setVigor(vigor);

        System.out.println("Inteligencia: ");
        int intel = entrada.nextInt();
        this.setInteligencia(intel);

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("");

    }

}
