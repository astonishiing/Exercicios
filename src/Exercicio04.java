import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercicio04 {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        float alturaParede, larguraParede, alturaAzulejo, larguraAzulejo, qtd;

        String opcao;
        try{
            System.out.println("Informe a altura da parede: ");
            alturaParede = Float.parseFloat(leitor.readLine());

            System.out.println("Informe a largura da parede: ");
            larguraParede = Float.parseFloat(leitor.readLine());

            System.out.println("Informe a altura do azulejo");
            alturaAzulejo = Float.parseFloat(leitor.readLine());

            System.out.println("Informe a largura do azulejo");
            larguraAzulejo = Float.parseFloat(leitor.readLine());

            qtd = (alturaParede * larguraParede) / (alturaAzulejo * alturaAzulejo);
            System.out.println("A quantidade de azulejos necessaria eh: " + qtd);

        }catch (Exception Error){
            System.out.println("Error" + Error);
        }
    }

    //Possiveis melhorias: diminuição na quantidade de System.out.println e leitor.readLine

}
