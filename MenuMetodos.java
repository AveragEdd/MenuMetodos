import java.io.*;
public class MenuMetodos {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        try{
            System.out.println("Escoja una de las siguientes opciones de las cuales desea realizar");
            System.out.println("1. Arreglo 6x6 con numeros pares");
            System.out.println("2. Promedio de 5 numeros");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("Ingrese su opcion: ");
            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Imprimiendo la matriz.... \n");
                    ArregloPares arreglo = new ArregloPares();
                    ArregloPares.Arreglo6x6();
                    break;
                
                case 2:
                    Promedio PromedioValores = new Promedio();
                    double r = Promedio.PromedioValores();
                    System.out.println("El promedio de los 5 valores es "+ r);
                    break;
                
                case 3:

                    break;

                case 4:

                    break;
                    
                default:
                    System.out.println("Debe elegir una opción entre 1 a 4");
                    break;
            }
        } catch(IOException e){

        }
    }
}
