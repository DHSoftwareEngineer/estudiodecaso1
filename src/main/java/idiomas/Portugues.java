package idiomas;

public class Portugues implements Saludo{
    @Override
    public void saludo(String s) {
        System.out.println(s + "olá");
    }
}
