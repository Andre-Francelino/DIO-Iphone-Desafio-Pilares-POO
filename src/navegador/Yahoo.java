package navegador;

public class Yahoo implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de serviço de e-mail do Yahoo!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de serviço de e-mail do Yahoo!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página de serviço de e-mail do Yahoo! \n");
    }
}
