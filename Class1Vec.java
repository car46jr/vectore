
package vectores;


public class Class1Vec {
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
            System.out.println("Media de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
       
    }
