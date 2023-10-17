package org.example;

import idiomas.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import paises.Paises;

public class Greeting {
    private Saludo saludo;

    @Autowired
    public void setSaludo(Saludo xSaludo){
        this.saludo = xSaludo;

    }

    public void print(){
        String s = "Saludo: ";
        saludo.saludo(s);
    }
}
