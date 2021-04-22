/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author edwin
 */
public class Formatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cabecera="\n\tPRONOSTICO DEL CLIMA\n";
        
                cabecera+="\n\tDia\t\tMañana\tNoche\tCondiciones\n";
                cabecera+="\t----\t\t----\t----\t----\n";
                String pronostico="\tDomingo\t25C\t\t33C\t\tSoleado\n";
                pronostico+="\tLunes\t18C\t\t19C\t\tNublado\n";
                pronostico+="\tMartes\t40C\t\t29C\t\tCaluroso\n";
                System.out.println(cabecera+pronostico);
                
                
    }
    
}
