package myFrames;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameB extends MyFrameA
{

	FlowLayout layout = new FlowLayout();

	private String[] lables;

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
		super(x);
		this.lables = lables;
		setLabels(this.lables);
	}

}
