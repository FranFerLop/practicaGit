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
<<<<<<< HEAD
	// modificaciones Jesus Galera
 System.out.println("Jesus Galera inserta esta sentencia"); 
=======
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
>>>>>>> 7fb81c73b702aa49974fe4ac305536693c49f73a
    }
    public void testGitAux(){
    // metodo rama testing
        System.out.println("Metodo de testing");
    }
}
