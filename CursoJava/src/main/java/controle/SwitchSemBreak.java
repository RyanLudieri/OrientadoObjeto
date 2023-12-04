package controle;

import java.util.Locale;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "vermelha";

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sodan");
            case "vermelha":
                System.out.println("Sei o Heian Nodan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
//            default:
//                System.out.println("Não sei nada");
        }


    }
}
