import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frameblock {
	
	
	frameblock()
	{
		JFrame frame=new JFrame();  //to create new frame
		frame.setSize(500, 500); //to fix the size
		//frame.getContentPane().setBackground(Color.BLUE);
		  //to make it appear on the screen
		frame.setTitle("Sun's GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jl=new JLabel();
		jl.setSize(200, 300);
		
		
		jl.setText(mainblockchain.mainprint());
		
		frame.add(jl);
		frame.setVisible(true);  
		
		
	}
	
	

}
