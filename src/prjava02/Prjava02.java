/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author elafia
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versio 0.1 del projecte prjava02");
        try{
            InetAddress adreça = InetAddress.getLocalHost();
            String ipAddr = adreça.getHostAddress();
            String hostname = adreça.getHostName();
            System.out.println("hostname = "+hostname);
            System.out.println("Adreça IP: "+ipAddr);
            System.out.println("Nom de l'usuari: "+System.getProperty("user.name"));
            System.out.println("Carpeta Personal: "+System.getProperty("user.home"));
            System.out.println("Sistema operatiu: "+System.getProperty("os.name"));
            System.out.println("Versió OS: "+System.getProperty("os.version"));
        }
        catch (IOException e){
            
        }   
    }  
}