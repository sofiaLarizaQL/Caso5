import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  
    {
        Controlador controlador= new Controlador( new Scanner(System.in));
       try
       {
         controlador.menu();
       }
       catch(IOException e)
       {
       System.out.println("Ocurrió un error de E/S"+ e.getMessage());
       }
       catch (InputMismatchException e)
       {
        System.out.println("Entrada no válida"+ e.getMessage());
       }
       catch(ArithmeticException e)
       {
        System.out.println("No se puede dividir entre 0");
       }
       catch(Exception e )
       {
           System.out.println("Error no controlado"+ e.getMessage());
       }
        System.out.println("Cambio desde rama");
        System.out.println("Cambio rama");
        System.out.println("Cambio");
          
          
          
          
      
    }
    
}
