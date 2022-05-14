
import java.util.*;
public class Media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0; //contadores de los números positivos y negativos
        int[] numeros = new int[15]; //array que contendrá los números leídos por teclado
        double sumaPos = 0; //acumuladores para las sumas de positivos y negativos                   
        
        //lectura de datos y llenar el array
        System.out.println("Numeros a ingresar : ");
        for (i = 0; i < 15; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //recorrer el array para sumar por separado los números positivos 
         // y los negativos 
         for(var variable :numeros){
             System.out.println(Arrays.toString(numeros));
         }
        for (i = 0; i < 15; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } 
        }
      
        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Suma de los numeros: " + sumaPos + pos);                
        } else {
            System.out.println("....");
        }
       
    }
}