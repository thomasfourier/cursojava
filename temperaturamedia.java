import java.util.Scanner;

public class temperaturamedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double somadorTemperaturas = 0;
        int numeroTemperaturas = 0;

        while(true) {
            System.out.println("Insira uma temperatura: ");
            double temperatura = scanner.nextDouble();

            if(temperatura == 0){
                break;
            }

            somadorTemperaturas += temperatura;
            numeroTemperaturas += 1;
        }
        double mediaTemperaturas = somadorTemperaturas / numeroTemperaturas;

        System.out.println("Temperatura média: " + mediaTemperaturas);

    }
    
}
