/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina_seguros;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class Oficina_Seguros {
    
    private int año;
    private int sexo;
    private int registroCarro;
    Scanner in = new Scanner(System.in);

    public void dato(){
        System.out.println("Ingrese el años de nacimiento de la persona: ");
        año = in.nextInt();
        in.nextLine();//Limpia el Buffer
        System.out.println("Ingrese el sexo de la persona de la siguente manera, 1=Femenino, 2=Masculino");
        sexo = in.nextInt();
        in.nextLine();//Limpia el Buffer
        System.out.println("Ciudad donde se encuentra registreado el automovil, 1=Medellin, 2=Otras ciudades");
        registroCarro = in.nextInt();
        in.nextLine();
        
    }
    
    public void imprimirDatos(){
        System.out.println("\n=====================================\nAño: "+año+"\nSexo: "+sexo+"\nRegistro: "+registroCarro+"\n");
    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getRegistroCarro() {
        return registroCarro;
    }

    public void setRegistroCarro(int registroCarro) {
        this.registroCarro = registroCarro;
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    
}
