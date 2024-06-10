import smartphone.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone quinze = new Iphone(); 

        quinze.adicionarNovaAba();
        quinze.atualizarPagina();
        quinze.atender();
        quinze.iniciarCorreioVoz();
        quinze.selecionarMusica("musica");
        quinze.tocar();
        quinze.pausar();
        
    }
}
