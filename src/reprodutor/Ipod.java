package reprodutor;

public class Ipod implements ReprodutorMusical{
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música no meu Ipod.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no meu Ipod...");
        System.out.println("Adoro essa música! Da hora d+");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no meu Ipod \n");
    }
}
