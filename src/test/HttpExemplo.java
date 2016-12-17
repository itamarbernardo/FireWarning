/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import newpackege.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelosiedler
 */
public class HttpExemplo {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        String url = "http://192.168.0.101:8084/MyNewHome/webresources/sensor?sensorId=2";
        Acesso a = new Acesso(url);
        a.start();
        System.out.println("Testing 1 - Send Http GET request");

        while (true) {
            try {
                String json = a.sendGet();
                System.out.println("Resultado: " + json);
                Thread.sleep(500);

            } catch (InterruptedException ex) {
                Logger.getLogger(Acesso.class.getName()).log(Level.SEVERE, null, ex);

            } catch (Exception ex) {
                Logger.getLogger(Acesso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
