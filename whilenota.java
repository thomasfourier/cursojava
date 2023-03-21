import java.util.Scanner;

public class whilenota {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double temperatura = 0;
        int contador = 0;

        while(true){
            System.out.println("Insira a temperatura: ");
            double temp = scanner.nextDouble();

            if(temp == 0){
                break;
            }
            temperatura += temp;
            contador += 1;

            }

            double media = temperatura / contador;
            
            System.out.println("Média: " + media);

        }
    
    }
