public class Conversor 
{
    public double convertir (double celcius)
    {
        return (celcius*1.8)+32;
    }
    public double convertir (double valor, String tipo)
    {
        if("KmAMIllas".equalsIgnoreCase(tipo))
        {
            return valor*0.621371;
        }
       throw new IllegalArgumentException ("Tipo"+"de conversión no soportada");
    
    }
    public int[] convertir (int segundos)
    {
        int min =segundos /60;
        int seg =segundos % 60;
        return new int [] {min, seg};
        
    
    }
}

