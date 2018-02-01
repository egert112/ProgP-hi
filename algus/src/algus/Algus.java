/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 *Esimene katsetus. Muutujad, valik, massiiv
 * @author if17
 */
public class Algus {

    /**Programmi töö alguskoht
     * @param args the command line arguments
     */
     public static void ilmakommentaar(int temperatuur) {
        if(temperatuur>0){System.out.println("sulab");}
        else{System.out.println("jäätab");}
     }
     public static void Toasoojus(int toasoojus) {
        if(toasoojus<0){System.out.println("Väga külm");}
        else if(toasoojus>=19){System.out.println("Soe");}
        else if(toasoojus>50){System.out.println("Sellist soojust ei eksisteeri");}
        else {System.out.println("Kõrvetavalt palav");}
     }
public static void main(String[] args) {
        System.out.println("Hello, Web!");
        ilmakommentaar(3);
        Toasoojus(21);
        Toasoojus(-2);
        Toasoojus(100);
       }
}
