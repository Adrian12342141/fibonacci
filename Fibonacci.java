
/**
 * El fibo
 */
public class Fibonacci
{
    

    /**
     * 
     */
    public Fibonacci()
    {
        
        
    }

    /**
     *  
     */
    public void imprimirLosNPrimeros(int n)
    {
      assert (n>0);
      int j=0;
      int res=1;
      System.out.println("estos son los primeros " + n + "numeros de la susecion de fibonacci: \n");
      for(int i=1;i<n;i++){
           System.out.println(j + "\n");
           int aux= j + res;
           j = res;
           res= aux;
        }
    }
}
