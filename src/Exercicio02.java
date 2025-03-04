import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicio02 {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        float alturaCm = 0;
        float medialtura;
        int qtdMulheres = 0, qtdHomens = 0;

        String opcao = "";
        int qtdSexo, qtdSexoOposto;


        try{
            System.out.println("Escreva <F> para sexo Feminino e <M> para masculino");
            opcao = leitor.readLine();

            System.out.println("Digite a quantidade do sexo digitado: ");
            qtdSexo = Integer.parseInt(leitor.readLine());

            System.out.println("Digite a quantidade do sexo oposto");
            qtdSexoOposto = Integer.parseInt(leitor.readLine());

            System.out.println("Digite a altura do sexo escolhido");
            alturaCm = Float.parseFloat(leitor.readLine());


            if(opcao.equalsIgnoreCase("F")){
                System.out.println("A quantidade digitada foi " + qtdSexo + " e a opção escolhida foi " + opcao + " a altura do sexoe escolhido foi " + alturaCm);
            }else {
                medialtura = qtdSexo / alturaCm;
                System.out.println("A quantidade digitada foi " + qtdSexo + " e a opção escolhida foi " + opcao + " e a média das alturas sao " + medialtura);

            }
        }catch (Exception Erro){
            System.out.println("Error" + Erro);
        }

    }
}
