/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Gabriel
 */
public class Cuadrado implements Figura{
    
    public double lado;
    public double perimetro;
    public double area;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getperimetroCuadrado(){
        
        return perimetro;
        
    }
    
    public double getareaCuadrado(){
        
        return area;
        
    }
    
    @Override
    public void perimetro(){
        perimetro = lado + lado + lado + lado;
    }
    
    public void area(){
        
        area = lado * lado;
        
    }
    
}
