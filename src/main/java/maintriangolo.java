/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class maintriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        triangolo t1= new triangolo(1.0,1.0,1.0);
        
        t1.riconoscimentotriangolo();
        System.out.println("il triangolo è di tipo:" +   t1.riconoscimentotriangolo()); 
        
        t1.calcoloperimetro();
        t1.calcoloarea();
        System.out.println("ha l'aria di "  + t1.calcoloarea() +" hail perimetro di " + t1.calcoloperimetro());
        
    }
    
}
