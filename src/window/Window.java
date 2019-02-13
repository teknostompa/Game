package window;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;

public class Window {
	static GraphicsConfiguration gc;
	public static void main(String[] args){
		JFrame window= new JFrame("Game");
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setContentPane(new GamePanel());
		window.pack();
	}
}
