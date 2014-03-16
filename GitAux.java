/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author Francisco and Jesus
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alumno 1"); // alumno 1
    }
    
    public void metodoAlumno2(){ 
 	System.out.println("metodo 2"); 
	System.out.println("modificado por Jesus Galera"); // Jesus Galera 
    } 
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// modificaciones Jesus Galera y Alumno1
 	System.out.println("Jesus Galera inserta esta sentencia"); 
	System.out.println("Alumno 1 inserta esta sentencia");
    }

    public void testGitAux(){
    // metodo rama testing
        System.out.println("Metodo de testing");
    }
}
