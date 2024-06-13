package com.exemplo.dispositivo;

import com.exemplo.navegador.NavegadorNaInternet;
import com.exemplo.reprodutor.ReprodutorMusical;
import com.exemplo.telefone.AparelhoTelefonico;

public class iPhone2007 implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    // Métodos da interface ReprodutorMusical
    @Override
    public void playMusic() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selectMusic(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void call(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void voicemail() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos da interface NavegadorNaInternet
    @Override
    public void browser(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página...");
    }

    // Main para testar
    public static void main(String[] args) {
        iPhone2007 meuIphone = new iPhone2007();

        // Testando ReprodutorMusical
        meuIphone.playMusic();
        meuIphone.selectMusic("Whatever - whatever");
        meuIphone.pauseMusic();

        // Testando AparelhoTelefonico
        meuIphone.call("123456789");
        meuIphone.answer();
        meuIphone.voicemail();

        // Testando NavegadorNaInternet
        meuIphone.browser("www.example.com");
        meuIphone.addNewTab();
        meuIphone.refreshPage();
    }
}
