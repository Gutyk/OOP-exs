package ex3;

public class Funcionario {
    int id;
    String name;
    double salarioBruto;

    public double salario(double retorno) {
        double salarioDesc;
        salarioDesc = salarioBruto - salarioBruto * retorno / 100;

        return salarioDesc;
    }

    public double aumentoSalario(double adicionar) {
        salarioBruto = salarioBruto + salarioBruto * adicionar / 100;
        return salarioBruto;
    }

    public String data() {
        String aux = "";
        aux += "ID: " + id + "\n";
        aux += "Nome: " + name + "\n";
        aux += "Salario bruto: " + String.format("%.2f", salarioBruto) + "\n";
        return aux;
    }
}


