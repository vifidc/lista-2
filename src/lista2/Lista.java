package lista2;

public class Lista {
    Gamer[] lista;
    int tamanho;  //capacidade total da lista
    int qtde;  //qtde de elementos na lista

    public Lista (int tamanho){
        lista = new Gamer[tamanho];
        this.tamanho = tamanho;
        this.qtde = 0;
    }

    public boolean verVazio(){
    //verifica se a lista está vazia
        if (qtde==0)
            return true;
        else
            return false;
    }

    public int verQtde(){
        return qtde;
    }

    public void altera(int pos, Gamer valor) throws Exception{
        if (verVazio())
            throw new Exception ("Lista está vazia!! Impossível alterar...");
        if (pos < 0 || pos >=qtde)
            throw new Exception ("Posição inexistente!! Impossível alterar...");
        lista[pos]=valor;        
    }

    public Gamer consultaPos (int pos) throws Exception{
        if (verVazio())
            throw new Exception ("Lista está vazia!! Impossível consultar...");
        if (pos < 0 || pos >=qtde)
            throw new Exception ("Posição inexistente!! Impossível consultar...");
        return lista[pos];
    }

    public void adicionaElemento(int pos, Gamer novo) throws Exception{
        if (qtde==tamanho)
           throw new Exception("Lista cheia! Impossível inserir..");
        if (pos < 0 || pos>qtde)
           throw new Exception("Posição inválida! Impossível inserir..");
        for (int i= qtde-1;i>=pos;i--) 
           lista[i+1]=lista[i];
        lista[pos]=novo;
        qtde++;
    }

    public void excluiElemento(int pos) throws Exception{
        if (verVazio())
            throw new Exception ("Lista está vazia!! Impossível excluir...");
        if (pos < 0 || pos >=qtde)
            throw new Exception ("Posição inexistente!! Impossível excluir...");
        for (int i = pos;i<=qtde-2;i++)
            lista[i]=lista[i+1];
        qtde--;
    }

    public int busca (String x){
        for (int i=0;i<=qtde;i++)
            if (lista[i].nome.equals(x))
                return i;
        return -1;
    }
    
    public void mostraLista(){
        System.out.println("\nRanking");
        for(int i=0;i<qtde;i++){
            System.out.println("\n" + (i+1) + "o. lugar");
             lista[i].mostraGamer();
        }            
    }
}
