/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula2calculo;

/**
 *
 * @author 55649
 */
public class Aula2Calculo {

    public static void main(String[] args) {
       
        System.out.println("Linha 1- Raiz 64 : " + Math.sqrt(64));

        
        Double a = (Math.exp(0.5 * Math.log(64)));
        int a2 = (int) Math.round (a);
        

        System.out.println("Linha 2- raiz com exp e log e realint: "+ a2);
        System.out.println("Linha 3- raiz com exp e log sem realint: "+Math.exp(0.5 * Math.log(64)));
        
        
        Double y = Math.sin(45*Math.PI/180 + 0.0001)*10000*0.1;

        System.out.println("Linha 4- Formatar "+ Math.ceil(y)+0.0001);
        
        
        Double x = Math.floor (Math.exp(3*Math.log(8) + 0.001))*1000;
        
        System.out.println("Linha 5- Potencia com exp e log formatar:"+x*0.001);
        
        System.out.println("Linha 6-Potencia com exp e log sem formatar:"+ Math.exp(3*Math.log(8)));
        
        Double x2 = Math.floor (Math.exp(3*Math.log(8) + 0.001))*1000;
        
        System.out.println("Linha 7- Potencia com operador** e formatar: "+x2*0.001);
        
        
        System.out.println("Linha 8- Raiz cubica " + Math.exp(0.3333333333333333 * Math.log(8)));
        
        System.out.println("Linha 9- Absoluto "+ Math.abs(-8));
            
        System.out.println("Linha 10- Absoluto "+ Math.abs(8));
        
        
        
        System.out.println("Linha 11- Convertendo para Inteiro 5.5 "+Math.round(5.5));
                
               
        System.out.println("Linha 12- Convertendo para Inteiro: 6.5 " + (int)Math.floor(6.5));
                
        System.out.println("Linha 13- Convertendo para Inteiro: 6.5 + 0.0001: " + Math.round(6.5+0.0001));
                
                
        System.out.println("Linha 14- Convertendo para Inteiro: 5.45" + (int)Math.floor(5.4));
                
               
        System.out.println("Linha 15- Convertendo para Inteiro: 5.51 " + Math.round(5.51));
                
               
        System.out.println("Linha 16- Convertendo para Real 87: "+ Double.parseDouble("87"));


        System.out.println("Linha 17- Convertendo pata Inteiro 3/4: " + Math.round(0.75));
    }
}
