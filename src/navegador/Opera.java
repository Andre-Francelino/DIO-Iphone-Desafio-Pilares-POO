package navegador;

public class Opera implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web pelo Opera.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de uma página web pelo Opera.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página web pelo Opera \n");
    }
}
