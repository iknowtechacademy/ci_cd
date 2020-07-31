package com.iknow.tdd.katacalculadora;

public class Calculadora {
    
    public String suma(String parametros){
        
        if(parametros.equals("")){
            return "0";
        }
        
        int total = 0;
        
        String[] sumandos=parametros.split(",");
        for(int i=0;i< sumandos.length;i++){
            Integer numero = new Integer(sumandos[i]);
            total = total + numero;
        }
        
        return new Integer(total).toString();
        
    }
    
}
