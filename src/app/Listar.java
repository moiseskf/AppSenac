package app;

import java.util.ArrayList;

public class Listar {

    ArrayList<Personagem> lista = new ArrayList<>();

    public Listar(ArrayList Lista) {
        this.lista = Lista;
    }

    public void lista() {

        for (int j = 0; j < lista.size(); j++) {
            System.out.println("Personagem : " + j);
            lista.get(j).apresentacao();
        }
    }

}
