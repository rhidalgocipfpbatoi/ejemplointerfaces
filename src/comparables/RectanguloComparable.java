/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

import java.awt.*;

/**
 *
 * @author Rober
 */
public class RectanguloComparable extends Rectangulo implements Comparable<RectanguloComparable>{

    public RectanguloComparable(int ancho, int alto, Color color, boolean relleno) {
        super(ancho, alto, color, relleno);
    }
    
    
    @Override
    public int compareTo(RectanguloComparable o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea()) {
            return -1;
        }
        
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Área:" + getArea();
    }
    
    
    
}
