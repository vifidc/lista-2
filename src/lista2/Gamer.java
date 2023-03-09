/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author 32148801
 */
public class Gamer {
    String nome;
    int pontos;

    public Gamer(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }
    
    public void mostraGamer(){
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontos);
    }
    
    
}
