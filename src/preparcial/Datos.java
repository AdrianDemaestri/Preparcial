package preparcial;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Datos {
    private String primeraLinea;
    private String segundaLinea;

    public void Datos(){
        Srting[] lineas = leerArchivo();


    }

    private String[] leerArchivo(){
        try {
            String[] lineas = new String[2];
            File archivo = new File("imagen.in");
            Scanner sc = new Scanner(archivo);
            lineas[0] = sc.nextLine();
            lineas[1] = sc.nextLine();

        }catch (Exception e) {
            lineas[0] = lineas[1] = "";
        }
        return lineas;
    }

    public String comprimir(String primeraLinea){
        int cant = primeraLinea.length();
        char c = primeraLinea[0];
        for(int i=0 ; i<cant ; i++){
            if()
        }
    }


    public String descomprimir(){

    }

}
lineas[0] = lineas[1] = "";