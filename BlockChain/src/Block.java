import java.util.Date;  

public class Block {
	
	public String hash;    //hash is known the other blocks too that's why it is public
	private String data;   //in each block the data should be private 
	public String previousHash;   //previous hash is also known to all the blocks
	private Date time;       //the time when a block has been created;
	public int nonce=0;
	
	@SuppressWarnings("deprecation")
	Block(String data,String previousHash)
	{
		this.previousHash=previousHash;
		this.data=data;
		this.time=new Date();
		this.nonce=nonce;
		this.hash=calculatehash();   //a block's hash depends on it's previous block's hash and it's time and data;see calculatehash
		
		
	}
	
	public String calculatehash()  //it will calculate the unique hash for every block created
	{
		String Generatedhash=StringUtil.applySha256(previousHash+time+data+Integer.toString(nonce));
		
		return Generatedhash;   //returning the combination of the above data of a block 
		                        //to generate a unique hash value
		
		
	}

	public static void add(Block block) {
		// TODO Auto-generated method stub
		
	}

	public static String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


