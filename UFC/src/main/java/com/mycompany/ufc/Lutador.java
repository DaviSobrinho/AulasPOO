/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufc;
import java.util.Random;
/**
 *
 * @author davi.labre
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
        this.categoria = categoria;
    }
    
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura,
            float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    public void apresentar(){
        System.out.println("IIIT'S TIIIMMMEE!");
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+" de altura");
        System.out.println("Pesando "+this.getPeso()+ " Kg");
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() +1 );
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1 );
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1 );
    }
    public void torneio(Lutador lutador[]){
        String categoria = lutador[0].getCategoria();
        int contadorDeVitorias[] = null;
        int vencedor;
        int vencedorFinal;
        for(int contadorCategoria = 0; contadorCategoria < lutador.length;contadorCategoria++){
            if(lutador[contadorCategoria].getCategoria()!= categoria){
                System.out.println("Impossível realizar o torneio, pois existem lutadores de categorais diferentes");
            }
        }
        for(int contadorLutas = 0; contadorLutas < lutador.length; contadorLutas++){
            for(int oponente = lutador.length; oponente > contadorLutas;oponente-- ){
                vencedor = luta(lutador[contadorLutas], lutador[oponente]);
                switch (vencedor){
                    case 1 ->{
                        contadorDeVitorias[contadorLutas] += 1;
                    }
                    case 2 ->{
                        contadorDeVitorias[oponente] += 1;
                    }
                    default -> {
                        contadorDeVitorias[contadorLutas] += .5;
                        contadorDeVitorias[oponente] += .5;
                    }
                } 
            }
        }
        vencedorFinal = contadorDeVitorias[0];
        for(int varreVencedor = 0; varreVencedor < contadorDeVitorias.length; varreVencedor++){
            if(vencedorFinal < contadorDeVitorias[varreVencedor]){
                vencedorFinal = contadorDeVitorias[varreVencedor];
            }
        }
    }
    int luta(Lutador lutador1,Lutador lutador2){
        Random random = new Random();
        int vencedor = random.nextInt(3);
        System.out.println("Luta entre "+lutador1.getNome()+" e "+lutador2.getNome());
        switch (vencedor) {
            case 1 -> {
                System.out.println("Vencedor: "+lutador1.getNome());
                lutador1.ganharLuta();
                lutador2.perderLuta();
                return 1;
            }
            case 2 -> {
                System.out.println("Vencedor: "+lutador2.getNome());
                lutador2.ganharLuta();
                lutador1.perderLuta();
                return 2;
            }
            default -> {
                System.out.println("Empate");
                lutador1.empatarLuta();
                lutador2.empatarLuta();
                return 0;
            }
        }
    }
}
