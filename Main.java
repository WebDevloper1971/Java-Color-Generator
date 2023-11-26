import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) {
		
		 try { 
			  
			 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

//			 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//			 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//			 UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//			 UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
		 } 
	        catch (Exception e) { 
	            System.out.println("Look and Feel not set"); 
	        } 
		 
		new AppWindow();
		
	
		
		

	}

}
