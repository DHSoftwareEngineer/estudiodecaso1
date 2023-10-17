package idiomas;

public class Ingles implements Saludo {

    @Override
    public void saludo(String s) {
        System.out.println(s + "hello");
    }
}
