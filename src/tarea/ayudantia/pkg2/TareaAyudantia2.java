
package tarea.ayudantia.pkg2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class TareaAyudantia2 {

    public static void main(String[] args) {
        String direccion="C:\\Users\\usuario\\Downloads\\texto.txt";
        LeeFichero(direccion);
        EscribirFichero(direccion);
    }
   public static String LeeFichero(String direccion){
      File archivo = null;
      FileReader leerfichero = null;
      BufferedReader leerlinea = null;
      String retornar="";
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (direccion);
         leerfichero = new FileReader (archivo);
         leerlinea = new BufferedReader(leerfichero);
         // Lectura del fichero
         String linea;
         while((linea=leerlinea.readLine())!=null)
            //System.out.println(linea);
            retornar=retornar+"\n"+linea;
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != leerfichero ){   
               leerfichero.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return retornar;
   }
   public static String EscribirFichero(String direccion){
       FileWriter EscribirFichero=null;
       PrintWriter Escribirlinea=null;
       try{
           String linea="\nThe first man who stepped on the moon.";
           EscribirFichero= new FileWriter(direccion, true);
           Escribirlinea = new PrintWriter(EscribirFichero);
           Escribirlinea.write(linea);
       }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("ficher no encontrado");
        }finally {
            if (EscribirFichero!= null) {
                try {
                    EscribirFichero.close();
		} catch (IOException e) {
                    e.printStackTrace();
                 }
            }
   }
   return LeeFichero(direccion);
}
}
    

