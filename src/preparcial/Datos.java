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

    public String comprimir(){

        String cadenaGenerada = "";
        char c = this.primeraLinea.charAt(0);
        int contador, cant, i=0, j=1;
        cant = this.primeraLinea.length();

        for(i=0 ; i<cant ; i++){
            contador = 0;
            j = i+1;
            do{

                if(this.primeraLinea.charAt(i) == this.primeraLinea.charAt(j)){
                    contador++;
                    j++;
                }
            }while(this.primeraLinea.charAt(i) != this.primeraLinea.charAt(j));
            cadenaGenerada += "(" + contador + this.primeraLinea.charAt(i) + ")";
            i = j;
        }
    }


    public String descomprimir(String cadena){
        int index =-1, longitudRepeticion=-1;

        for (int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i) == '('){
                index = i;
                for(int j=0; j<cadena.length(); j++){
                    if(cadena.charAt(index + j) == ')') {
                        longitudRepeticion = j-1;
                        break;
                    }
                }
                break;
            }
        }
        if (index == -1)
            return cadena;
        else{
            int cantidad = Integer.parseInt(cadena.substring(index,index+longitudRepeticion));
            return descomprimir(cadena);
        }
    }

}
