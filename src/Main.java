import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempMin, tempMax;
        double[] temperaturas = new double[24];

        System.out.print("Informe a temperatura minima: ");
        tempMin = sc.nextDouble();
        System.out.print("Informe a temperatura maxima: ");
        tempMax = sc.nextDouble();

        for (int i = 0; i < 24; i++) {
            System.out.print("Temperatura da hora " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double soma = 0;
        int acimaMax = 0;
        double menor = temperaturas[0];
        double maior = temperaturas[0];

        for (double t : temperaturas) {
            soma += t;
            if (t > tempMax) acimaMax++;
            if (t < menor) menor = t;
            if (t > maior) maior = t;
        }

        double media = soma / 24;

        System.out.println("\n=== RELATORIO DA ESTUFA ===");
        System.out.println("Média: " + media);
        System.out.println("Temperaturas acima do limite: " + acimaMax);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);

        if (maior > tempMax) {
            System.out.println("ALERTA: temperatura acima do limite!");
        }
        if (menor < tempMin) {
            System.out.println("ALERTA: temperatura abaixo do limite!");
        }

        sc.close();
    }
}
