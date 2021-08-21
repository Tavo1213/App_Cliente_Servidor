import java.io.IOException;
import sockets.Servidor;

public class MainServidor {
    public static void main(String[] args) throws IOException{
        Servidor serv = new Servidor();

        System.out.println("Iniciando servidor\n");
        serv.startServer();
    }
}
