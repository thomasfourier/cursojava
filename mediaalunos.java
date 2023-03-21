import java.util.Scanner;

public class mediaalunos {
    public static void main(String [] args){
       Scanner scanner = new Scanner(System.in);

       double soma = 0;

       for(double i = 0; i < 6; i++){
            System.out.println("Insira uma nota: ");
            double nota = scanner.nextDouble();
            soma += nota;

       }

       double media = soma / 6;

       System.out.println("Média: " + media);
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

       double media = somadorNotas / somadorNumeroNotas;

       System.out.println("A média é : " + media);

}
}