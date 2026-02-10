import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerNombres {
    public static void leer(String fichero){ //Método para leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero --> "+ e.getMessage());
        }
    }
}
