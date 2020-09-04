import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Área do terreno
        double aTerreno;
        // Valor do terreno
        double valTerreno;
        // Área Construída
        double aConstruida;
        // Valor da Área Construída
        double valConstruida;
        // Valor do IPTU
        double iptu;

        // Ler entrada do usuário
        Scanner read = new Scanner(System.in);

        // Lê a área do terreno
        System.out.println("Área do terreno (m2): ");
        aTerreno = read.nextFloat();
        // Lê a área construída
        System.out.println("Área construída (m2): ");
        aConstruida = read.nextFloat();

        // Define valor do m2 a partir da área do terreno
        if (aTerreno <= 200) {
            valTerreno = 0.10;
        } else {
            if (aTerreno > 200 && aTerreno <= 450) {
                valTerreno = 0.43;
            } else {
                valTerreno = 1.20;
            }
        }

        // Define valor do m2 a partir da área construída
        if (aConstruida <= 50) {
            valConstruida = 0.00;
        } else {
            if (aConstruida > 50 && aConstruida <= 75) {
                valConstruida = 0.15;
            } else {
                if (aConstruida > 75 && aConstruida <= 95) {
                    valConstruida = 0.35;
                } else {
                    valConstruida = 0.45;
                }
            }
        }

        // Calculando o valor do IPTU
        iptu = (aTerreno*valTerreno) + (aConstruida*valConstruida);

        System.out.println("Valor da Área do Terreno: " + valTerreno);
        System.out.println("Valor da Área Construída: " + valConstruida);
        System.out.println("Valor do IPTU           : " + iptu);


    }

}