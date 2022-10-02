/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.gitcolab;

/**
 *
 * @author HP
 */
public class Student {
    public String name;
    public String dni;

    public Student(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }
    public String getUserInformation(){
        String info = "";
        info += "---- USER INFORMATION ------\n";
        info += "NOMBRE DE USUARIO: "+this.name+"\n";
        info += "DNI: "+this.dni+"\n";
        return info;
    }
}
