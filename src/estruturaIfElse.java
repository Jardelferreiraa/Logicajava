public class estruturaIfElse {
    public static void main(String[] args) {
//        int idade = 30;
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }

//        boolean estaChovendo = true;
//        if (!estaChovendo) {
//            System.out.println("Vamos sair para passear.");
//        }
//        else {
//            System.out.println("Não vamos sair para passear.");
//        }

        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {
            System.out.println("Pede um ifood e zé delivery,");
        }
        else if (temDinheiro || temCartao){
            System.out.println("Pede um ifood.");
        }
        else {
            System.out.println("Não pede nada.");
        }
        String mensagem = (temDinheiro) ? "Pede um ifood." : "Não pede ifood."; //Ternário
        System.out.println(mensagem);
    }
}
