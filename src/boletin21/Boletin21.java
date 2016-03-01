/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.*;
import java.util.Arrays;


/**
 *
 * @author aparracorbacho
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        Utils util = new Utils();
        String []palabras = new String[6];
        File file = new File("palabras.txt");
        
        util.imprime("Introduce 6 palabras");
        for (int i= 0;i<palabras.length;i++){
            util.imprime("Introduce la palabra numero "+i);
            palabras[i] = util.qstring();
        }
        
       Arrays.sort(palabras);
        FileWriter fw = null;
       try {
       fw  = new FileWriter("palabras.txt");
           for (int i = 0; i<palabras.length;i++){
               fw.write(i +" " +palabras[i] + "\n");
           }
       } catch (IOException error) {
           util.imprime("Error "+error);
       } finally { 
           fw.close();
       }
        
       
}
}

