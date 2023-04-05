/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a02;

/**
 *
 * @author davi.labre
 */
public class Smartphone implements Botoes {
    public int volume;
    public int volumeLastHolder;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;
    
    public Smartphone(){
        volume = 0;
        volumeLastHolder = volume;
    }
    
    private int getVolumeLastHolder() {
        return volumeLastHolder;
    }

    private void setVolumeLastHolder(int volumeLastHolder) {
        this.volumeLastHolder = volumeLastHolder;
    }

    private boolean isMudo() {
        return mudo;
    }

    private void setMudo(boolean mudo) {
        this.mudo = mudo;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(Boolean.TRUE);
    }

    @Override
    public void desligar() {
        setLigado(Boolean.FALSE);
    }

    @Override
    public void abrirMenu() {
        
    }

    @Override
    public void fecharMenus() {
        
    }

    @Override
    public void maisVolume(int valor) {
        if(getVolume()+valor <= 100){
            setVolume(getVolume()+valor);
            setVolumeLastHolder(getVolume());
        }else{
            setVolume(100);
            setVolumeLastHolder(100);
        }
    }

    @Override
    public void menosVolume(int valor) {
        if(getVolume() > valor){
            setVolume(getVolume()-valor);
            setVolumeLastHolder(getVolume());
        }else{
            setVolume(0);
            setVolumeLastHolder(0);
        }
    }

    @Override
    public void ligarMudo() {
        setVolume(0);
        setMudo(Boolean.TRUE);
    }

    @Override
    public void desligarMudo() {
        if(mudo){
            try {
            setVolume(getVolumeLastHolder());
            setMudo(Boolean.FALSE);
            } catch (Exception e) {
                System.out.println("Não foi possível desligar o mudo, pois o mudo não estava ligado.");
            }
        } 
    }

    @Override
    public void play() {
        setTocando(Boolean.FALSE);
    }

    @Override
    public void pause() {
        setTocando(Boolean.TRUE);
    }
    public void mostraDados(){
        System.out.println("\nLigado: "+ligado);
        System.out.println("Mudo: "+mudo);
        System.out.println("Tocando: "+tocando);
        System.out.println("Volume: "+volume);
        System.out.println("VolumeHolder: "+volumeLastHolder+"\n");
    }
}
