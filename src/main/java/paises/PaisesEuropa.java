package paises;

import org.springframework.beans.factory.annotation.Autowired;

public class PaisesEuropa implements Paises{


    @Override
    public void paises(String s) {
        System.out.println(s);
        System.out.println("1. Escocia");
        System.out.println("2. España");
        System.out.println("3. Portugal");
    }
}
