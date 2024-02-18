package app;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        int resp = 0;

        ArrayList<Personagem> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
               
        /*System.out.println("Informe o valor do atributo");
        int atri = entrada.nextInt();
        System.out.println("Informe o valor da pericia");
        int peri = entrada.nextInt();
        System.out.println("");*/

 /*
        Personagem p1 = new Personagem ();
        
        p1.setNome("Tahkra Mahalath");
        p1.setVida(50);
        p1.setSanidade(30);
        p1.setAgilidade(20);
        p1.setForça(30);
        p1.setPresença(60);
        p1.setInteligencia(10);
        p1.setAtributos(2);
        p1.setPericia(5);
        
        
        RolagemDados teste = new RolagemDados(p1.getAtributos(), p1.getPericia());
        int resultado = teste.rolagem();

        System.out.println("Resultado da rolagem é : " + resultado);
        
         */
        do {
            System.out.println("");
            System.out.println("====================================================================================================");
            System.out.println("== 1- Cadastro de personagem == 2- Listar Personagens ==  3- Dado == 4- sair ==");
            System.out.println("====================================================================================================");
            resp = entrada.nextInt();

            switch (resp) {

                case 1 -> {

                    CadastroPersonagem P1 = new CadastroPersonagem();
                    P1.cadastro();
                    P1.apresentacao();
                    lista.add(P1);

                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("=-=-= Lista de Personagens Cadastrados =-=-=");
                    System.out.println("");
                    Listar a = new Listar(lista);
                    a.lista();
                }
                case 3 -> {

                    System.out.println("Qual personagem esta executando a ação?");
                    int personagemA = entrada.nextInt();

                    RolagemDados r1 = new RolagemDados(lista.get(personagemA));
                    r1.escolhaDado();


                }

            }

        } while (resp != 4);
    }

}

