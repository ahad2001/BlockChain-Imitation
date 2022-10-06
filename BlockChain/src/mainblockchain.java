import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

import com.google.gson.GsonBuilder;
/*source - https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa */

public class mainblockchain {
	

/*------------------------------------------------ Blockchain creation-------------------------------------------*/
	
	public static int blockcount=1;   //static variables are components of class,not of smth else,keeping it static cuz it would
	                                  //represent the number f=of blocks created
	
	public static ArrayList<Block> blockchain = new ArrayList<Block>(); 
	
	public static void main(String[] args) {
		
		Block a1=new Block("Hi im the first blockchainchain", "0");		
		a1.hash=Blockmining(5,a1);
		blockchain.add(a1); 
		
		Block a2=new Block("Yo im the second blockchainchain",blockchain.get((blockchain.size()-1)).hash);		
		a2.hash=Blockmining(5,a2);
		blockchain.add(a2); 
		
		Block a3=new Block("Hey im the third blockchainchain",blockchain.get((blockchain.size()-1)).hash);		
		a3.hash=Blockmining(5,a3);
		blockchain.add(a3); 

		
	    String blockchainchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);		
	   
	    if(checkvalidity()==1)
	    {
	    	System.out.println("\nThis BlockChain is Totally Valid.Here's the BlockChain :\n");
	    	System.out.println(blockchainchainJson);
	    	
	    }
	    else System.out.println("This BlockChain is Corrupted");
	    
	  //  System.out.println(blockchainchainJson);
	    
	    
	   
		
	}
	
	public static String mainprint()
	{
		return new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		
	}
	
	/*------------------------------------------------ Blockchain Validity checking-------------------------------------------*/
	
	public static int checkvalidity()
	{
		System.out.println("\nChecking the Validity of the BlockChain....");
		//for the dramatic effect i have added this delay in time
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Block a1,a2;
		int check=0;
		for(int i=0;i<blockchain.size();i++)
		{
			if(blockchain.get(i).hash.equals(blockchain.get(i).calculatehash())==false)  //to check if two strings are same
			{

				System.out.println("Block's own hash is not equal to the the calculated hash.System is corrupted");
				check++;
			}
			if(i>0 && (blockchain.get(i).previousHash.equals(blockchain.get(i-1).calculatehash()))==false)
			{
				System.out.println("Block's previous hash is not equal to the the calculated hash of previous block."
						+"System is corrupted");
				check++;

			}

		}
		if(check==0)
		{
			return 1;
		}
		else return 0;

	}
	
	public static String Blockmining(int difficulty,Block b1)
	{   
		System.out.println("Block No. :"+blockcount+" Is Being Mined Now...");
		int nonce=0;
		
	    String hj="0";
	    for(int i=0;i<difficulty-1;i++)
	    {
	    	hj=hj+"0";
	    }
	   
        while((b1.hash.substring(0, difficulty)).equals(hj)==false)
        {
        	b1.nonce++;
        	b1.hash=b1.calculatehash();
        	
        }
      
        System.out.println("Block No. :"+blockcount+" : " +b1.hash+" Has Been Mined Successfully");
        blockcount++;
		return b1.hash;
		
		
	}
	
	
}
