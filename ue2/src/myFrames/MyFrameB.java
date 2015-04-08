package myFrames;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameB extends JFrame
{

	FlowLayout layout = new FlowLayout();

	private String[] lables;
	private int title;

	public void setTitle(int title)
	{
		setTitle("" + title);
	}

	public void setLabels(String[] lables)
	{
		setLayout(layout);

		for (String xx : this.lables)
		{
			this.add(new JLabel(xx));
		}

	}

	public MyFrameB(int x, String lables[])
	{
		this.title = x;
		this.lables = lables;
		setTitle(this.title);
		setSize(200, 200);
		setLabels(this.lables);
	}

}
