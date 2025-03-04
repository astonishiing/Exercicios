//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escreva um programa que, com base em uma
          temperatura em graus celsius, a
          converta e exiba em Kelvin (K),
          Réaumur (Re), Rankine (Ra) e Fahrenheit (F), s
          eguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
        */
        double C = 2.43, K, F, Re, Ra;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatuda em Fahrenheit: " + F);
        System.out.println("A temperata em Kelvin: " + K);
        System.out.println("A temperatura em Reaumur: " + Re);
        System.out.println("A temperatura em Rankine: " + Ra);
    }
}