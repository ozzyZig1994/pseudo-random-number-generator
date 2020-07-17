package algoritmosimulacion;

public class Funciones 
{
    double redondeaNumero(double valor)
    {
        valor*= Math.pow(10,4);
        valor+= 0.5;
        valor= (int)valor;
        valor/= Math.pow(10,4);
        
        return valor;
    }
}