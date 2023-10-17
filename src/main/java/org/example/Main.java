package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import paises.Paises;
import paises.SeleccionPaises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        Scanner select = new Scanner (System.in);
        ApplicationContext context;
        BeanFactory factory;
        context = new ClassPathXmlApplicationContext("file:META-INF/beanPaises.xml");
        factory = context;
        SeleccionPaises test = (SeleccionPaises) factory.getBean("Paises");
        test.print();
        System.out.print("Seleccione su respuesta: ");
        num = select.nextInt();
        context = new ClassPathXmlApplicationContext("file:META-INF/beanPaises.xml");
        factory = context;
        Greeting greeting;
        switch (num){

            case 1:
                context = new ClassPathXmlApplicationContext("file:META-INF/beanIngles.xml");
                factory = context;
                greeting = (Greeting) factory.getBean("Greeting");
                greeting.print();
                break;
            case 2:
                context = new ClassPathXmlApplicationContext("file:META-INF/beanEspaniol.xml");
                factory = context;
                greeting = (Greeting) factory.getBean("Greeting");
                greeting.print();
                break;
            case 3:
                context = new ClassPathXmlApplicationContext("file:META-INF/beanPortugues.xml");
                factory = context;
                greeting = (Greeting) factory.getBean("Greeting");
                greeting.print();
                break;
        }
    }
}