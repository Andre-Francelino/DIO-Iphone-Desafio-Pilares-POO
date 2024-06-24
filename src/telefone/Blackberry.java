package telefone;

public class Blackberry implements AparelhoTelefonico{

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada com o Blackberry.");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada com o Blackberry.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com o Blackberry... \n");
    }

}
