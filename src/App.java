import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Assento[][] assentos = new Assento[20][11];
        // adicionando os assentos nas devidas classes
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 11; j++) {
                if (j >= 0 && j <= 5) {
                    assentos[i][j] = new AssentoPrimeiraClasse();
                } else {
                    assentos[i][j] = new AssentoEconomico();
                }
            }
        }

        System.out.println("Informe a fileira e a poltrona desejadas : ");
        int fileira = scanner.nextInt();
        int poltrona = scanner.nextInt();
        if (fileira >= 1 && fileira <= 20 && poltrona >= 1 && poltrona <= 11) {

            boolean reserva = assentos[fileira - 1][poltrona - 1].reservar();
            System.out.println(assentos[fileira][poltrona]);

            if (reserva = true) {
                System.out.println("reserva feita.");
             //   System.out.println(assentos[fileira][poltrona]);
            }
        } else {
            System.out.println("tente outra.");
        }
        scanner.close();
    }

}
