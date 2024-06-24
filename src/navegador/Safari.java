package navegador;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web pelo Safari.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de uma página web pelo Safari.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web pelo Safari \n");
    }
}
