import java.io.IOException;
import java.util.Scanner;
public class Controlador 
{
    private final Scanner sc;
    public Controlador(Scanner sc)
    {
        this.sc =sc;
    }
    public void menu() throws IOException
    {
        int opc; 
      
        do
        {
            System.out.println("\n Menú de opciones");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor");
            System.out.println("3. Contador");
            System.out.println("4. Banco");
            System.out.println("5. Auto");
            System.out.println("6. Libro");
            System.out.println("7. División");
            System.out.println("8. División con"
                    + "entrada de usuario");
            System.out.println("9. Validad edad");
            System.out.println("10. Archivo");
            System.out.println("0. Salir");
            System.out.println("elija una opción");
            
            try
            {
              opc= Integer.parseInt(sc.nextLine());
            } 
            catch (NumberFormatException e) 
            {
                opc= -1;
            }
            switch(opc)
            {
                case 1:
                    demoCalculadora();
                    break;
                case 2:
                    demoConversor();
                    break;
                case 7: 
                    demoDividir();
                    break;
            }   
             
            
            
         
        }
        while(true && !false);
        
    }
   private void demoCalculadora()
   {
     Calculadora c = new Calculadora(); 
       System.out.println("Sumar 2+3"+ 
               c.sumar(2,3));
       System.out.println("Sumar 1+2+3"+
               c.sumar(1, 2, 3));
       System.out.println("Sumar 2.3+5.9="+
              c.sumar(2.3, 5.9));
   }
   
   private void demoConversor()
   {
       Conversor conv= new Conversor();
       System.out.println("25°C a F =>"+ conv.convertir(25.1)+"F");
       System.out.println("10 km a millas =>"+ conv.convertir(10, "KmAMillas")+"mi");
       System.out.println("Convertir de seg a minutos") ;
       int [] mm = conv.convertir(130);
       System.out.println("130  seg =>"+ mm[0]+ "min"+ mm[1]+ "seg"); 
   }
   private void demoDividir()
   {
       Scanner sc = new Scanner(System.in);
     
        System.out.print("Ingrese el dividendo: ");
        int numA = sc.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int numB = sc.nextInt();
       
        Division dv = new Division();
        
        int resultado =dv.divisor(numA, numB);
        System.out.print("Resultado " + resultado);
       
       
   }
}
