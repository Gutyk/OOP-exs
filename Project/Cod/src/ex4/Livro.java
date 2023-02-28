package ex4;

public class Livro {
    int id;
    String titulo;
    String autor;
    boolean disponivel;

    public void emprestar(){
        if (disponivel){
            disponivel = false;
        }
    }
    public void devolver(){
        if (!disponivel){
            disponivel = true;
        }
    }
    public String getData(){
        String aux = "";
        aux += "ID:  " + id + "\n";
        aux += "Titulo:  " + titulo + "\n";
        aux += "Autor:  " + autor + "\n";
        aux += "Disponivel:  " + disponivel + "\n";
        return aux;
    }
}
