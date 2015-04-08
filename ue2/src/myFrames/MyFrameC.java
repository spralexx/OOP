package myFrames;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameC extends JFrame
{

	private String title;
	private int size;
	private int[] numbers;
	FlowLayout layout = new FlowLayout();

	public void setTitle(int title)
	{
		setTitle("" + title);
	}

	public void setLabels(int[] numbers)
	{
		setLayout(layout);

		for (int xx : this.numbers)
		{
			this.add(new JLabel("" + xx));
		}

	}

	public MyFrameC(String title, int size, int[] numbers)
	{
		this.title = title;
		this.size = size;
		this.numbers = numbers;
		setTitle(this.title);
		setSize(this.size, this.size);
		setLabels(this.numbers);

	}

}
