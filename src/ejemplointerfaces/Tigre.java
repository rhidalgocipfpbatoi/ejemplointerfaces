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
public class Tigre extends Animal {

    @Override
    public String sonido() {
        return "roooarrr";
    }

    @Override
    public String toString(){
        return "Tigre";
    }
   
}
