public class App {
    public static void main(String[] args) throws Exception {
        
        iPhone meuIPhone = new iPhone();

        // funções do reprodutor musical
        meuIPhone.selecionarMusica("Dire Straits - Sultans Of Swing");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // funções do aparelho telefônico
        meuIPhone.ligar("+55 (00) 1 2345-6789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // funções do navegador na internet
        meuIPhone.adicionarNovaAba();
        meuIPhone.exibirPagina("https://www.dio.me/");
        meuIPhone.atualizarPagina();
    }
}
