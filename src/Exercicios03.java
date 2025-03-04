import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicios03 {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        int qtdFuncionarios;
        float salario = 0;
        float mediaSalario = 0;

        String opcao = "";
        try{
            System.out.println("Digite a quantidade de funcionários na empresa");
            qtdFuncionarios = Integer.parseInt(leitor.readLine());

            for(int i = 0; i < qtdFuncionarios; i++){
                System.out.println("Digite os respectivos salarios dos funcionarios: (começa em 0 a contagem) " + i);
                salario = Float.parseFloat(leitor.readLine());
            }
            mediaSalario = salario / qtdFuncionarios;
            System.out.println("A media salarial dos funcionaros é " +  mediaSalario);

        }catch (Exception Error){
            System.out.println("Error" + Error);
        }
    }
}
