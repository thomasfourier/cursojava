import java.util.Scanner;

public class mediaalunos {
public static void main(String [] args){
     entradaUsuario();
       
}

public static String informaResultado(double media){
     return(media >= 7 ? "O aluno está aprovado com média de " + media:"O aluno está reprovado com média de " + media);

}

public static double calculaMedia(double somatorioNotas, int numeroNotas){
     double media = somatorioNotas / numeroNotas;
     return media;
}

public static void entradaUsuario(){

     Scanner scanner = new Scanner(System.in);

       double somadorNotas = 0;
       int somadorNumeroNotas = 0;

       while(true){
          System.out.println("Insira uma nota: ");
          double nota = scanner.nextDouble();

          if(nota == 0){
               break;
          }
          somadorNotas += nota;
          somadorNumeroNotas += 1;
     }

          
     double media = calculaMedia(somadorNotas, somadorNumeroNotas);
     System.out.println(informaResultado(media));

    

     }
}
