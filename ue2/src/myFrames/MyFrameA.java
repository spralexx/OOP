package myFrames;

import javax.swing.JFrame;

public class MyFrameA extends JFrame {
	
	private int title;
	
	public void setTitle(int title){
		setTitle(""+title);
	}
	
	public MyFrameA(int x)
	{
		this.title = x;
		setTitle(this.title);
		setSize(200, 200);
	}


}
