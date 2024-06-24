package reprodutor;

public class Mp3Player implements ReprodutorMusical{

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a música com o MP3 Player.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo a música com o MP3 Player...");
        System.out.println("Esse som é muito massa!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música com o MP3 Player \n");
    }
}
