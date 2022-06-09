package test;
import modelo.Telefonia;

public class Test 
{
    public static void main(String[] args) 
    {
        {
            Telefonia miTelefonia = new Telefonia();  
            miTelefonia.setNumeroCelular(31641882);
            miTelefonia.setOperador("Movilujo");
            miTelefonia.setMinutos(200);
            System.out.println("El numero de celular es: " + miTelefonia.getNumeroCelular()); 
            System.out.println("El operador es: " + miTelefonia.getOperador()); 
            System.out.println("Cantidad minutos: " + miTelefonia.getMinutos()); 
            System.out.println("El costo del plan es de : $" + miTelefonia.calcularCostoPlan());
        }   
    }
}
