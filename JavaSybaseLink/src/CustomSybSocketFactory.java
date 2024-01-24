/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.sybase.jdbcx.SybSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author rahul
 */
public class CustomSybSocketFactory implements SybSocketFactory {
    @Override
    public Socket createSocket(String dbHost, int dbPort, Properties props) throws IOException {
        SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        return (SSLSocket) sslsocketfactory .createSocket(dbHost, dbPort);
    }
}
