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
public class Cubo implements Figura {
    
    public double lado;
    public double perimetro;
    public double volumenCubo;
    
    public Cubo(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getperimetroCubo(){
        return perimetro;
    }
    
    public double getvolumenCubo(){
        return volumenCubo;
    }
    
    @Override
    
    public void perimetro(){
    
        perimetro = 12 * lado;
    
    }
    
    public void area(){
        
        volumenCubo = lado * lado * lado;
    
    }
    
    
}
