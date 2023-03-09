package lista2;

public class Lista2 {

    public static void main(String[] args) throws Exception{
           Lista ranking = new Lista(10);
           ranking.adicionaElemento(0, new Gamer("Pedro", 250));
           ranking.adicionaElemento(1, new Gamer("Maria", 600));
           ranking.adicionaElemento(2, new Gamer("Jõao", 300));
           ranking.adicionaElemento(3, new Gamer("Solange", 3000));
           ranking.adicionaElemento(4, new Gamer("Taís", 500));
           ranking.mostraLista();
    }

}