package paises;

import idiomas.Saludo;
import org.springframework.beans.factory.annotation.Autowired;

public class SeleccionPaises {
    private Paises paises;

    @Autowired
    public void setPaises(Paises xPaises){
        this.paises = xPaises;

    }

    public void print(){
        String s = "Seleccione el país de su preferencia: ";
        paises.paises(s);
    }
}
