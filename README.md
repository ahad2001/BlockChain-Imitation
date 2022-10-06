# BlockChain-Imitation
#### This project is a simple implementation of BlockChain Technology,developed with the core features of BlockChain Technology. 

## Detailed Runthrough  
Class Block : In this class all the components of a block which are hash(the own unique digital printing) of each blocks,the hash of the previous block,the time stamp(the time when a block is created),the data and the nonce(starting with 0) have been initialized.The constructor of the Block class is needed to create new blocks,consisting two parameters,(those two properties being private).The calculatehash function,will calculate the hash for each block based on its DATA,PREVIOUS HASH,TIME,NONCE and then it will combine all of these as a string and would apply SHA256 algorithm on them,which would produce a 40 digit hexadecimal unique code,which is the hash of a block.

Class StringUtil : This class consists of SHA256 algorithm.In a simple way which is a sort of encryption algorithm that would take multiple number of strings and process those strings in a complicated way to produce a single string from those inputs,which would be unique everytime.

Class mainblockchain( main class ) : Creation of a block by passing data and previous hash as arguments is placed. After that,the block is sent to BLOCKMINING function which would mine the block.
The Blockmining function takes block and a integer as arguements.The integer is basically the number of 0’s required in the first few digits of the generated hash calculated by CLACULATEHASH function.At First blockmining function creates a string with that integer number of 0s.Then it checks if the first that integer number of digits in the hash of the passed block is 0 or not.If not, it increases the nonce by 1 and call CALCULATEHASH function which again calculates the hash with increased nonce.It is noteworthy that all the nonce starts with 0,and gets increased with the step.When the hash of passed block to the BLOCKMINING function starts with “that integer” number of 0's then the loop stops and it returns the hash of the passed block.

Specific Format : Then that block is added to the arraylist of blocks,this step is necessary because  all the components of a block should be shown in a specific format taken from GSONBUILDER Function,and the GSONBUILDER Function takes input as an arraylist,That’s why it is a must to add all the blocks to the arraylist first.

Detecting Validity : To check the validity of the entire blockchain, CHECKVALIDITY Function is used.In this function arraylist is iterated through to check if the calculated hash using CALCULATEHASH function of a block is already acting as current the hash of the block or not,if not then the hash of the block has been tampered by external sources,thus making the whole blockchain corrupted.It is also needed to check if the previous hash of a block is exactly same as the calculated hash of the previous block by Calculating previous block’s hash using CALCULATEHASH Function.if not then the blockchain is corrupted.IF these two conditions are false for the entire blockchain’s arraylist,then the blockchain is not corrupted so it is absolutely fine.

## Console Output 
Block is added and being mined 
![Blockchain mining](https://user-images.githubusercontent.com/81913695/194234229-19692d16-c2d5-4160-b271-fffc20be6922.jpg)

## Potential feautures 
This project is well rounded for now but I have a plan for adding gui function in here and also make it like a real life blockchain which would be accessible as ADMIN AND USERS where they can enter data,make transactions,edit data and check the validity.




## Authors
- [@ahad2001](https://github.com/ahad2001)
