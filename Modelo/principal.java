/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aluno
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Istanciando
        
        Participante objPart = new Participante("José Eduardo");
        System.out.println("Participante: "+objPart.getNome());
        objPart.Lendo();
        objPart.Programador();
        
    }
    
}
