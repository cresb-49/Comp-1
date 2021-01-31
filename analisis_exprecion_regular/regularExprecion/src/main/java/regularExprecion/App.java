package regularExprecion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String binary ="";
        int randomNum = 0;
        int M = 0;
        int  N=10;
        for(int i = 0;i<3;i++){
            randomNum = (int)Math.floor(Math.random()*(N-M+1)+M);
            binary +="1";
            for (int j = 0; j < randomNum; j++) {
                binary += "0";
            }

        }
        System.out.println("El binario generado es: "+binary);
    }
}
