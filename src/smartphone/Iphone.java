package smartphone;
public class Iphone implements AparelhoMusical, AparelhoTelefonico, NavegadorWeb {

    @Override
    public void exibirPagina(String url) {
        System.out.println("URL = " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atandendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando no telefone");
    }
    
}
