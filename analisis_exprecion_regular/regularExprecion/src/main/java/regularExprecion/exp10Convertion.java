/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularExprecion;

/**
 *
 * @author carlo
 */
public class exp10Convertion {
    
    public exp10Convertion(){
        
    }
    /**
     * RETORNA EL VALOR BINARIO DE UNA CADENA DE UNOS Y CEROS
     * @param binary
     * @return 
     */
    public int convertBinary(String binary){
        char[] bin = binary.toCharArray();
        int length = binary.length();
        int partialResult=0;
        int cont=0;
        int temp = 0;
        for(int i=(length-1);i>-1;i--){
            temp = (Integer.parseInt(String.valueOf(bin[i])))*((int)Math.pow(2, cont));
            partialResult+=temp;
            cont++;
        }
        cont=0;
        return partialResult;
    }
}
