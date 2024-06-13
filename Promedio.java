import java.io.*;
public class Promedio{
    public static double PromedioValores() throws IOException {
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    double[] valores = new double[5];
    double resPromedio=0;
    System.out.println("Ingrese los 5 numeros a promediar: ");
    for(int i=0; i<5; i++){
        valores[i] = Double.parseDouble(leer.readLine());
    }
    for(int i=0; i<5; i++){
        resPromedio += valores[i];
    }
    resPromedio = resPromedio/5;
    return resPromedio;
    }
}