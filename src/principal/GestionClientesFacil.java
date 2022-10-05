/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import dominio.Persona;

/**
 *
 * @author loren
 */
public class GestionClientesFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new dominio.Persona("Juan", "Garcia");
        Persona p2 = new dominio.Persona("Manuel", "Jimenez");
        System.out.println(p1);
        System.out.println(p2);
        Persona clientes[] = new Persona[2];
        clientes[0]= p1;
        clientes[1]= p2;
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("clientes = " + clientes[i]);
        }
        Persona maClientes[][] = new Persona[1][2];
        maClientes[0][0] = p1;
        maClientes[0][1] = p2;
        for (int i = 0; i < maClientes.length; i++) {
            for (int j = 0; j < maClientes[i].length; j++) {
                System.out.println("maClientes["+i+"]["+j+"] = " + maClientes[i][j]);
            }
        }
        //Metodo para recorrer tablas pasandole objetos
        Integer numeros[] = {12,14,16};
        leer(numeros);
        leer(clientes);
        //Metodo para imprimir una lista variable
        imprimir(12,18);
        imprimir(11,15,37,54);
       
    }
    
    public static void leer(Object lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista["+i+"]= " + lista[i]);
        }
    }
    //Me convierte el parametro en un array
    public static void imprimir(int...numero){
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
    
}
