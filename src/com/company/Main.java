package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        //Clase asignatura
        System.out.println("==============================================================================================================");
  Asignatura a=new Asignatura("MM111");
  a.setNombre("Geometria y trigonometria");
  a.setCapacidad(42);
  a.setHorario("13:20");
        System.out.println(a.toString());
        System.out.println("==============================================================================================================");
//Clase catedratico
        Catedratico b=new Catedratico("Fernando Garza");
        b.setEdad(32);
        b.setEspecialidad("Geometria");
        b.setTelefono(95143050);
        System.out.println(b.toString());
        System.out.println("==============================================================================================================");
        //Clase alumno
        alumno al = new alumno("201930060186");
        al.setNombre("Arnol Martinez");
        al.setEdad(23);
        al.setEstatura(1.65);
        al.setTelefono("96131986");
        System.out.println(al.toString());
        System.out.println("==============================================================================================================");

    }
}
