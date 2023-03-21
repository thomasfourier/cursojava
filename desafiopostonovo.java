import java.util.Scanner;

public class desafiopostonovo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do litro da gasolina? ");
        double valorLitro = scanner.nextDouble();
        double valorTotal = 0;

        for(int i = 1; i <= 50; i++){
            valorTotal = valorLitro * i;
            System.out.println("Numero de litros: " + i + " │  Valor do Litro: " + valorLitro + " │  Valor total: " + valorTotal);
        }

    }
    
}
