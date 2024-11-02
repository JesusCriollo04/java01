
package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
       //clcular el area de un triaungulo y area de circulo 
        double base;
        double altura;
        double respuesta;
        double radio;
        double pi;
        pi = 3.14;
        Scanner input= new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.print("Ingrese base de triaungulo: ");
        base=input.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
        altura= input.nextDouble();
        respuesta=(base*altura)/2;
        System.out.print("El area del triangulo es: " + respuesta);
        System.out.println("################");
        System.out.println("Area del circulo");
        System.out.println("Ingresar radio del circulo: ");
        radio= input.nextDouble();
        respuesta=pi*radio*radio;
        System.out.println("El area del circulo es: "+ respuesta);
        System.out.print("holaaaa");
    }
}
