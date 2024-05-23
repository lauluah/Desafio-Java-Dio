public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.selecionarMusica("David Kushner - Daylight");
        reprodutor.pausar();

        AparelhoTelefonico telefonico = new AparelhoTelefonico();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        telefonico.ligar("(71) 99890-9287");

        NavegadorInternet internet = new NavegadorInternet();
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina("https://www.youtube.com/");
    }
}