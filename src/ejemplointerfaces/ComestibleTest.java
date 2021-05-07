/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author Rober
 */
public class ComestibleTest {
    
    public static void main(String[] args) {
        Comestible comestibles[] = { new Pollo(), new Manzana(), new Naranja()};

        System.out.println("¿Cómo se comen los siguientes alimentos?");
        for (int i = 0; i < comestibles.length; i++) {
            System.out.println(comestibles[i] + ": " + comestibles[i].comoSeCome());
        }


        Animal animales[] = { new Pollo(), new Tigre()};

        System.out.println("¿Qué sonido hacen los siguientes animales?");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i] + ": " + animales[i].sonido());
        }
    }
}
