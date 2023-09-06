import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parameterOne = input.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parameterTwo = input.nextInt();

        try {
            contar(parameterOne, parameterTwo);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro");
        }
    }
    static void contar( int parameterOne, int parameterTwo) throws ParametrosInvalidosException {
        if(parameterOne> parameterTwo)
            throw new ParametrosInvalidosException();
        else
            for (int i = 1; i <= (parameterTwo - parameterOne); i++) {
                System.out.println("Imprimeinto o número "+i);
            }
    }
}
