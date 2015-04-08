import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {
	public static void main(String[] args) {
		JFrame[] myFrames = new JFrame[7];
		int numberOfFrames = myFrames.length;
		int size=(numberOfFrames*100)+100;
		System.out.println(numberOfFrames);
		for(int i=0; i<myFrames.length; i++){
			myFrames[i]=new JFrame();
			myFrames[i].setTitle("Fenster"+numberOfFrames--);
			myFrames[i].setSize(size,size);
			myFrames[i].setLocationRelativeTo(null);
			size=size-100;
			myFrames[i].add(new JLabel("Moin"));
			myFrames[i].setVisible(true);		
		}
	}
}