package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do{
            System.out.println(gerarMenu());
            opcao = input.nextInt();
            if(opcao < 1 || opcao >5){
                System.out.println("Opção invalida");
            }
        }while(opcao != 5);
    }

    public static String gerarMenu(){
        String aux = "Escolha uma opção\n";
        aux += "1. Cadastrar livro\n";
        aux += "2. Consultar livro\n";
        aux += "3. Emprestar livro\n";
        aux += "4. Devolver livro\n";
        aux += "5. Finalizar\n";
        return aux;
    }
}
