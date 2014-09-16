import java.io.*;
import java.util.Vector;


class Main{

	public static void main(String[] args) throws IOException
	{
		File f = null;
        Vector PrimeList = new Vector(1);   //use a vector to store all the primes and 2 is my first ele
        PrimeList.add(2);
		boolean LOCAL_TEST = false;
        boolean PrimeOrNot;
        int PrimeCount = 1;
        int mathNumber = 0;
        
    
        for(int i = 3; ; i++)          //the number starts from 3 because 2 is the base case
        {
            PrimeOrNot = true;
            mathNumber = (int)Math.floor( Math.sqrt( (double) i ) );
            
            //for(int j=0; j<PrimeList.size(); j++) //only need to test up to floor of the sqrt of that number of primes.
            for(int j=0; j<mathNumber && j<PrimeList.size(); j++)
            {
                //System.out.println("current i: "+i);
                //System.out.println("current j: "+j);
                //PrintNumber(PrimeList);
                
                int value = (int)PrimeList.get(j);
            
                if( (i % value) == 0)
                {
                    PrimeOrNot = false;
                    break;
                }
            }
            
            if(PrimeOrNot)
            {
                PrimeList.add(i);
                PrimeCount++;
            }
        
            if(PrimeCount == 1000)         //this controls how many primes to find
                break;
            
        }
        
        //PrintNumber(PrimeList);   //for testing purposes
        PrintSumOfPrimes(PrimeList);

	}
    
    public static void PrintSumOfPrimes(Vector PrimeList)
    {
        int sum = 0;
        for(int index = 0; index<PrimeList.size(); index++)
        {
            sum = sum + (int)PrimeList.get(index);
        }
        
        System.out.println(sum);
    }
    
    
    
    public static void PrintNumber(Vector PrimeList)  //for testing purposes
    {
        System.out.println();
        for(int x=0; x<PrimeList.size(); x++)
            System.out.print(PrimeList.get(x)+" ");
        System.out.println();
    }



}
