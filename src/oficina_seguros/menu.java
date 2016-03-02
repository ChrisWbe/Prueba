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
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        Oficina_Seguros persona[] = new Oficina_Seguros[10];
        int i = 0;
        
        int seleccion;
        boolean flag = true;
        
        do{
            System.out.println("\t\t Menú \t\t\nSeleccione:");
            
            System.out.println("\n\n1.Crear nuevo dato (Accidente de transito concerniente al año 2016)");
            System.out.println("\n2.Imprimir los datos existentes");
            System.out.println("\n3.Procentaje de conductores menores de 25 años");
            System.out.println("\n4.Porcentaje de conductores de sexo femenino");
            System.out.println("\n5.Porcentaje de Automóviles registrados fuera de Medellín\n\n");
            
            seleccion = tec.nextInt();
            
                switch(seleccion){
                    case 1:
                        persona[i] = new Oficina_Seguros();
                        persona[i].dato();
                        i++;
                        break;
                    case 2:
                        for(int h=0; h<i; h++){
                            persona[h].imprimirDatos();
                            
                        }
                        break;
                    case 3:
                        int j=0, p;
                        
                        for(p=0; p<i; p++){
                            if(persona[p].getAño()<25){
                                j++;
                            }
                            else{}
                            
                        }
                        
                        System.out.println((j*100)/p + "% de las personas son menores a 25 años\n===============================");
                        break;
                    case 4:
                        j=0;
                        for(p=0; p<i; p++){
                            if(persona[p].getSexo() == 1){
                                j++;
                            }
                            else{}
                            
                        }
                        
                        System.out.println((j*100)/p + "% de las personas fueron mujeres\n===============================");
                        break;
                    case 5:
                        j=0;
                        for(p=0; p<i; p++){
                            if(persona[p].getRegistroCarro() == 2){
                                j++;
                            }
                            else{}
                            
                        }
                        
                        System.out.println((j*100)/p + "% de los automoviles se encuentran registrados en otras ciudades\n===============================");
                        break;
                        
                    case 6:
                        flag = false;
                        break;
            }
            
        }while(flag == true);
        
    }
    
}

