/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

import java.awt.*;
import java.util.Arrays;

/**
 *
 * @author Rober
 */
public class OrdenarRectangulos {
    public static void main(String[] args) {
        RectanguloComparable[] rectangulos = {
            new RectanguloComparable(3, 5, Color.BLUE, true),
            new RectanguloComparable(2, 5, Color.RED, true),
            new RectanguloComparable(8, 9, Color.GREEN, true),
            new RectanguloComparable(1, 2, Color.YELLOW, true)};
        
        Arrays.sort(rectangulos);
        
        for (RectanguloComparable rectangulo : rectangulos) {
            System.out.println(rectangulo);
        }
    }
}
