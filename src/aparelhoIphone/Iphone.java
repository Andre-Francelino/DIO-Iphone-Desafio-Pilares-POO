package aparelhoIphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String acelerometro;

    public Iphone(String acelerometro) {
        this.acelerometro = acelerometro;
    }

    public String getAcelerometro() {
        return acelerometro;
    }

    public void setAcelerometro(String acelerometro) {
        this.acelerometro = acelerometro;
    }

    @Override
    public void selecionarMusica() {
        abrindoIpod();
        System.out.println("Selecionando música no app Ipod do meu Iphone.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no app Ipod do meu Iphone...");
        System.out.println("Som maneiro do caramba!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no app Ipod do meu Iphone \n");
    }

    private void abrindoIpod() {
        System.out.println("Abrindo o app do Ipod no meu Iphone!");
    }

    @Override
    public void fazerChamada() {
        ativarSensorProximidade();
        System.out.println("Fazendo chamada com o Iphone.");
    }

    @Override
    public void receberChamada() {
        ativarSensorProximidade();
        System.out.println("Recebendo chamada com o Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com o Iphone... \n");
    }

    private void ativarSensorProximidade() {
        System.out.println("Ativando sensor de próximidade!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página com o Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando mais uma página com o Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página com o Iphone \n");
    }

    public void mudarOrientacao() {
        if (acelerometro.equals("Retrato")) {
            System.out.println("Mudando orientação do Iphone para Paisagem! \n");
        } else if (acelerometro.equals("Paisagem")) {
            System.out.println("Mudando orientação do Iphone para Retrato! \n");
        }
    }
}
