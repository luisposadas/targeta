public class Targeta
{
    private float saldo;
    public Targeta()
    {
        saldo = 0;
    }
    public void depositar(float dinero)
    {
        if(dinero >= 0)
        {
        saldo = saldo + dinero;
    }
    }
    public float retirar(float dinero)
    {
    if (saldo >=dinero){
    saldo = saldo - dinero;
    return dinero;
    }else 
    return 0;
    
    }
    public void consulta()
    {
        System.out.println(saldo);
    }
        
    
}
