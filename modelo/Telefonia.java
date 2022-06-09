package modelo;
public class Telefonia 
{
    //---------------------
    //Atributos
    //---------------------
    public long numeroCelular;
    public String operador;
    public int minutos;
    public double costoMinuto;
    private final int COS_MINUTO = 300;

    //---------------------
    //Métodos
    //---------------------

    //Constructor comun u ordinario
    public Telefonia(long nCel, String Oper, int cMin)
    {
        this.numeroCelular = nCel;
        this.operador = Oper;
        this.minutos = cMin;
    }

    public Telefonia(Telefonia pt)
    {
        this.minutos = pt.getMinutos();
        this.numeroCelular = pt.getNumeroCelular();
        this.costoMinuto = pt.getCostoMinuto();
        this.operador = pt.getOperador();
    }
    public Telefonia()
    {
    }

    //Metodos de acceso

    public long getNumeroCelular() 
    {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) 
    {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() 
    {
        return operador;
    }

    public void setOperador(String operador) 
    {
        this.operador = operador;
    }

    public int getMinutos() 
    {
        return minutos;
    }

    public void setMinutos(int minutos) 
    {
        this.minutos = minutos;
    }

    public double getCostoMinuto() 
    {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) 
    {
        this.costoMinuto = costoMinuto;
    }

    public double calcularCostoPlan()
    {
        double costoTotal = COS_MINUTO * minutos;
        if(operador.equals("Movilujo"))
        {
            costoTotal = costoTotal * 0.5;
        }
        return costoTotal;
    }
        
}
