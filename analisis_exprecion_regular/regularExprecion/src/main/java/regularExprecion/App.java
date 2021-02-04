package regularExprecion;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        exp10Convertion convercionSistema = new exp10Convertion();
        String binary = "";
        ArrayList<String> binarios = new ArrayList();
        int randomNum = 0;
        int M = 0;
        int N = 9;
        
        for (int y = 0; y < 100; y++) {
            for (int i = 0; i < 3; i++) {
                randomNum = (int) Math.floor(Math.random() * (N - M + 1) + M);
                binary += "1";
                for (int j = 0; j < randomNum; j++) {
                    binary += "0";
                }
            }
            binarios.add(binary);
            binary="";
        }
        
        System.out.println("Los binarios encontrados son:");
        for(String var: binarios){
            int temp = convercionSistema.convertBinary(var);
            System.out.println("Binario: "+var+" conversion: "+temp+", divicion entre 7: "+temp/7);
        }        
        
    }
}
