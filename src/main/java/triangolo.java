/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class triangolo {
    private double latoa;
    private double latob;
    private double latoc;
    private String nome;

   

    public triangolo(double latoa, double latob, double latoc) {
        this.latoa = latoa;
        this.latob = latob;
        this.latoc = latoc;
        this.nome=nome;
    }


    
    public String riconoscimentotriangolo()
    {
         nome="rettangolo";  
         
        if(latoa==latob && latoa==latoc && latob==latoc)
        {
            nome= "equilatero"; 
        }
        if(latoa== latob && latoa!=latoc && latob!=latoc)
        {
            nome="isoscele";
        }
       if(latoa!=latob && latoa!=latoc && latob!=latoc)
       {
           nome="scaleno";
       }
      
       
        
       
       return nome;
    
    }
    
    public double calcoloarea()
    {
        double area=0.0;
        if(nome=="equilatero")
        {
            area=latoa*latoa * 0.433;
        }
        if(nome=="isoscele")   
        {
            double altezza= latoa*latoa - latoc*latoc / 2*2;
            altezza=Math.sqrt(altezza);
            area=latoc*altezza/2;
        }
        if(nome=="rettangolo")
        {
            area=latoa*latob/2;
        }
        if(nome=="scaleno")
        { 
            double p=latoa*latob*latoc/2;
            area=p*(p-latoa)*(p-latob)*(p-latoc);
            area=Math.sqrt(area);
        }
        return area;
    }
    public double calcoloperimetro()
    {
        double perimetro=0.0;
        perimetro=latoa+latob+latoc;
        return perimetro;
    }
}