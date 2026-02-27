public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Joana";
        String nomeDois = "Mateus";

        int tamanhoDaString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);

        System.out.println("Olá, " + nome.toUpperCase() + "! " + "Seu nome tem o tamanho de " + tamanhoDaString + " caracteres.");
        System.out.println("Os nomes são iguais? " + saoIguais);
    }
}
