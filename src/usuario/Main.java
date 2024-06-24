package usuario;

import navegador.NavegadorInternet;
import navegador.Opera;
import navegador.Safari;
import navegador.Yahoo;
import reprodutor.Ipod;
import reprodutor.Mp3Player;
import reprodutor.ReprodutorMusical;
import aparelhoIphone.Iphone;
import telefone.AparelhoTelefonico;
import telefone.Blackberry;
import telefone.MotoQ;

public class Main {
    public static void main(String[] args) {

        // Reprodutor - MP3 Player
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.selecionarMusica();
        mp3Player.reproduzirMusica();
        mp3Player.pausarMusica();

        // Reprodutor - Ipod
        Ipod ipod = new Ipod();
        ipod.selecionarMusica();
        ipod.reproduzirMusica();
        ipod.pausarMusica();

        // Telefone - Blackberry
        Blackberry black = new Blackberry();
        black.fazerChamada();
        black.receberChamada();
        black.iniciarCorreioVoz();

        // Telefone - MotoQ
        MotoQ motorola = new MotoQ();
        motorola.fazerChamada();
        motorola.receberChamada();
        motorola.iniciarCorreioVoz();

        // Navegador Internet - Safari
        Safari safari = new Safari();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

        // Navegador Internet - Opera
        Opera opera = new Opera();
        opera.exibirPagina();
        opera.adicionarNovaAba();
        opera.atualizarPagina();

        // Navegador Internet - Serviço de e-mail
        Yahoo yahoo = new Yahoo();
        yahoo.exibirPagina();
        yahoo.adicionarNovaAba();
        yahoo.atualizarPagina();


        // Iphone (Aparelho)
        Iphone meuIphone = new Iphone("Retrato");
        System.out.println("===== Funcionalidades no aparelho Iphone ====== \n ");

        meuIphone.mudarOrientacao();

        // Reprodutor - Iphone
        ReprodutorMusical repIphone = meuIphone;
        meuIphone.selecionarMusica();
        meuIphone.reproduzirMusica();
        meuIphone.pausarMusica();

        // Telefone - Iphone
        AparelhoTelefonico teleIphone = meuIphone;
        meuIphone.fazerChamada();
        meuIphone.receberChamada();
        meuIphone.iniciarCorreioVoz();

        // Navegador Internet - Iphone
        NavegadorInternet webIphone = meuIphone;
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
