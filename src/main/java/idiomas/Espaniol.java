package idiomas;

public class Espaniol implements Saludo {
    @Override
    public void saludo(String s) {
        System.out.println(s + "hola");
    }
}
