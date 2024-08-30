import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Escolha a unidade de temperatura: ");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        System.out.println("3.Kelvin");

        int unidadeInicial = scanner.nextInt();

        System.out.println("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.println("Temperatura final: ");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3.Kelvin");

        int unidadeFinal = scanner.nextInt();

        double temperaturaConvertida = 0;

        switch (unidadeInicial){
            case 1: //Celsius
                if (unidadeFinal == 2){//F
                    temperaturaConvertida = (temperatura * 1.8) + 32;
                } else if (unidadeFinal == 3){ //K
                    temperaturaConvertida = temperatura + 273.15;
                } else {
                    temperaturaConvertida = temperatura;
                }
                break;

                case 2: //Fahrenheit
                    if (unidadeFinal == 1){ //C
                        temperaturaConvertida = (temperatura - 32) / 1.8;
                    } else if (unidadeFinal == 3){ //F
                        temperaturaConvertida = (temperatura - 32) * 5/9 + 273.15;
                    } else {
                        temperaturaConvertida = temperatura;
                    }
                    break;

            case 3: //Kelvin
                if (unidadeFinal == 1) { //C
                    temperaturaConvertida = temperatura - 273.15;
                } else if (unidadeFinal == 2) { //F
                    temperaturaConvertida = (temperatura - 273.15) * 1.8 + 32;
                } else {
                    temperaturaConvertida = temperatura;
                }
                break;
        }
        System.out.println("A Temperatura convertida é: " + temperaturaConvertida);
    }
}