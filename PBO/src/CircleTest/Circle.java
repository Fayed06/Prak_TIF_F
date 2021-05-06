/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleTest;

/**
 *
 * @author ASUS
 */
public class Circle {
    private int Radius;
    public void setRadius(int jari){
        Radius= jari;
    }
    public double getArea (){
        return Radius * 3.14 * Radius;
    }    
    public double getPerimeter (){
        return Radius * 3.14 * 2;
    }
    
}
