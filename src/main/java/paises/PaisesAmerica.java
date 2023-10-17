package paises;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;

public class PaisesAmerica implements Paises{


    @Override
    public void paises(String s) {
        System.out.println(s);
        System.out.println("1. Estados Unidos");
        System.out.println("2. Costa Rica");
        System.out.println("3. Brasil");
    }
}
