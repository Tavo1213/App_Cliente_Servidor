package sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import sockets.Connection;
import Interfaz.Interfaz_Cliente;

public class Servidor extends Connection{
    public Servidor() throws IOException{super("servidor");}

    public void startServer(){


        try{
            System.out.println("Esperando...");
            cs = ss.accept();
            System.out.println("Cliente en linea");

            salidaCliente = new DataOutputStream(cs.getOutputStream());

            salidaCliente.writeUTF("Petición recibida y aceptada");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream())); //recibe las entradas del cliente

            while((mensajeServidor = entrada.readLine()) !=null){ //lee constantemente las entradas del cliente y las imprime en consola
                System.out.println(mensajeServidor);
            }

            System.out.println("Fin de la conexion");

            ss.close(); //cierra la conexion
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

