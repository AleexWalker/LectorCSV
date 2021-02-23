import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MostarCoronavirus {
    public static void main(String[] args) throws IOException {
        FileReader archivo = new FileReader(args[0]);
        BufferedReader lector = new BufferedReader(archivo);
        Scanner teclado = new Scanner(System.in);

        String linea;
        String [] valores;

        System.out.print("¿En qué provincia deseas consultar las Hospitalizaciones totales?");
        String entrada = teclado.next();

        while ((linea = lector.readLine()) != null){
            valores = linea.split(",");
            if (valores[0].equals(entrada))
                System.out.println(valores);

        }
        archivo.close();
    }
}
