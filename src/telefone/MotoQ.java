package telefone;

public class MotoQ implements AparelhoTelefonico{

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada com o Motorola MotoQ.");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada com o Motorola MotoQ.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz com o Motorola MotoQ... \n");
    }
}
