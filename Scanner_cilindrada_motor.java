/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner_cilindrada_motor;

/**
 *
 * @author USUARIO
 */

class ParametrosPotencia{

    int CalcularPotenciaIndicada(int z1, int z2 ,int z3){
    return (z1*z2)/z3;
    }
    double CalcularPotenciaIndicada(double z1, double z2, double z3 ){
    return (z1*z2)/z3;
    }
    int CalcularPotenciaEfectiva(int z1, int z2 ,int z3){
    return (z1*z2)/1000*z3;
    }
    double CalcularPotenciaEfectiva(double z1, double z2, double z3 ){
    return (z1*z2)/1000*z3;
    }
}
public class Scanner_cilindrada_motor {
    public static void main(String[] args) {
        System.out.println("  *******UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE******* ");
         System.out.println("             ********PROGRAMACION******** ");
         System.out.println("\033[34m-Estudiante: Medardo Chango");
         System.out.println("********************************************************");
         System.out.println("\033[31mPOLIMORFISMO 2 TAREA"); 
         System.out.println("");
    
        ParametrosPotencia Objeto1=new ParametrosPotencia();
        ParametrosPotencia Objeto2=new ParametrosPotencia();
        ParametrosPotencia Objeto3=new ParametrosPotencia();
        ParametrosPotencia Objeto4=new ParametrosPotencia();
        int resultado1;
        Objeto1.CalcularPotenciaIndicada(1000, 20,10);                                       
        resultado1=Objeto1.CalcularPotenciaIndicada(1000, 220,10);
        System.out.println("\033[34m-Potencia Motor Indicada: "+resultado1);
        
        double resultado2;
        Objeto2.CalcularPotenciaIndicada(100.2, 220.8,10.5);
        resultado2=Objeto2.CalcularPotenciaIndicada(100.2, 220.8,10.5);
        System.out.println("\033[34m-Potencia Motor Indicada: "+resultado2);
        
        int resultado3;
        Objeto3.CalcularPotenciaEfectiva(2000, 220,8);                                       
        resultado3=Objeto3.CalcularPotenciaEfectiva(2000, 220,8);
        System.out.println("\033[34m-Potencia Motor Efetiva: "+resultado3);
        
        double resultado4;
        Objeto4.CalcularPotenciaEfectiva(200.33, 120.2,1.2);
        resultado4=Objeto4.CalcularPotenciaEfectiva(200.33, 120.2,1.2);
        System.out.println("\033[34m-Potencia Motor Efectiva: "+resultado4);
    }
    
}