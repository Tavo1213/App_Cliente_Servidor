package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import sockets.Connection;

public class Cliente extends Connection {
    public Cliente() throws IOException{super("cliente");}

    public void starClient(){
        try {
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            cs.close();//fin de la conexion
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
