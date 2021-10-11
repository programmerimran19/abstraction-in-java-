/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author Programmer Imran
 */
public abstract class Shape {

    abstract void Area();
    
    public static void main(String[] args) {
        
        Rectangle R = new Rectangle();
        R.Area();
    
        Traingle T = new Traingle();
        T.Area();
        
        Circle C = new Circle();
        C.Area();
        
    }
    
}
