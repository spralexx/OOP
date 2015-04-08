package myFrames;

public class Main
{
	public static void main(String[] args)
	{

		MyFrameA myAFrame = new MyFrameA(1111);
		MyFrameB myBFrame = new MyFrameB(2013, new String[]
		{ "Hallo Flensburg!", "Hallo Deutschland!", "Hallo Welt" });

		int[] evenNumbersTo100 = new int[50];
		int counter = 0;

		for (int i = 2; i <= 100; i += 2)
		{
			evenNumbersTo100[counter++] = i;
		}
		MyFrameC myCFrame = new MyFrameC("Zahlen", 300, evenNumbersTo100);
		myAFrame.setVisible(true);
		myBFrame.setVisible(true);
		myCFrame.setVisible(true);

	}

}
