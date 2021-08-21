
import java.io.IOException;
import sockets.Cliente;
import Interfaz.Interfaz_Cliente;

public class MainCliente {

    public static void main(String[] args) throws IOException{

        Cliente cli = new Cliente();

        System.out.println("Iniciando cliente\n");
        cli.starClient();

        Interfaz_Cliente vent = new Interfaz_Cliente();

    }
}
