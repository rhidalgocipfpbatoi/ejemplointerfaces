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
public class Pollo extends Animal implements Comestible{

    @Override
    public String sonido() {
        return "Kikiriki!!";
    }

    @Override
    public String comoSeCome() {
        return "Frito o asado";
    }

    @Override
    public String toString(){
        return "Pollo";
    }
    
}
