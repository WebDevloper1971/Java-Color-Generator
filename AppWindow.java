import java.awt.BorderLayout;


import javax.swing.*;

@SuppressWarnings("serial")
public class AppWindow extends JFrame{
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	
	private ColorPanel colorpanel;

	

	public AppWindow() {
		
		
		
		
		colorpanel = new ColorPanel();
	
		add(colorpanel,BorderLayout.CENTER);
		
		setTitle("Color Generator");
		setSize(WIDTH,HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
