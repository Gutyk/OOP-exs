package ex3;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.id = 123;
        f.name = "Selmini";
        f.salarioBruto = 1000;

        System.out.println(f.data());
        System.out.println();

        f.aumentoSalario(20);
         System.out.println(f.data());
    }
}
