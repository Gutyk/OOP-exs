package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instanciação
        Scanner input = new Scanner(System.in);
        Bola bola1 = new Bola();
        Bola bola2 = new Bola();
        Bola bola3 = new Bola();

        // entrada de dados
        System.out.print("Cor da bola 1: ");
        bola1.cor = input.nextLine();
        System.out.print("Raio da bola 1: ");
        bola1.raio = input.nextDouble();

        input.nextLine();

        System.out.print("Cor da bola 2: ");
        bola2.cor = input.nextLine();
        System.out.print("Raio da bola 2: ");
        bola2.raio = input.nextDouble();

        input.nextLine();

        System.out.print("Cor da bola 3: ");
        bola3.cor = input.nextLine();
        System.out.print("Raio da bola 3: ");
        bola3.raio = input.nextDouble();

        // repete o código acima para as bolas 2 e 3
        Bola bola = maiorBola(bola1, bola2, bola3);
        System.out.println("A cor da maior bola é: " + bola.cor);
    }

    public static Bola maiorBola(Bola bola1, Bola bola2, Bola bola3) {
        Bola bola = new Bola();
        Bola[] listBolas = new Bola[3];

        listBolas[0] = bola1;
        listBolas[1] = bola2;
        listBolas[2] = bola3;

        for (Bola bolaAtual : listBolas) {
            if (bolaAtual.raio > bola.raio) {
                bola = bolaAtual;
            }
        }

        return bola;
    }
}
