import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import javax.swing.*;

@SuppressWarnings("serial")
public class ColorPanel extends JPanel{
	
	private JButton change;
	private JPanel p1,p2,p3,p4;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2,b3,b4;
	
	
	

	public ColorPanel() {
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		l1 = new JLabel("",SwingConstants.CENTER);
		l2 = new JLabel("",SwingConstants.CENTER);
		l3 = new JLabel("",SwingConstants.CENTER);
		l4 = new JLabel("",SwingConstants.CENTER);
		
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		
		JPanel[] panelArr = {p1,p2,p3,p4};
		JLabel[] labelArr = {l1,l2,l3,l4};
		JButton[] btnArr = {b1,b2,b3,b4};
		
		
		
		
		
		// For first iteration when app will open
		
		for(int i = 0; i < panelArr.length; i++) {
			String color = colorGenerator();
			
			panelArr[i].setLayout(null);
			panelArr[i].setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, Color.white));
			
			labelArr[i].setText(color);
			labelArr[i].setBounds(0,720/2-30,256,30);
			labelArr[i].setForeground(Color.BLACK);
			labelArr[i].setFont(new Font("MV Boli",Font.BOLD,14));
			
			btnArr[i].setText("COPY");
			btnArr[i].setBounds(80, 720/2+40, 256-160, 40);
			btnArr[i].setBackground(Color.black);
			btnArr[i].setForeground(Color.white);
			btnArr[i].setPreferredSize(new Dimension(50,40));
			btnArr[i].setFocusable(false);
			btnArr[i].setFocusPainted(false);
			btnArr[i].setBorderPainted(false);
			btnArr[i].setBorder(BorderFactory.createLineBorder(Color.black));
			
			panelArr[i].add(labelArr[i]);
			panelArr[i].add(btnArr[i]);
			panelArr[i].setBackground(Color.decode(color));
		}
		
		
	
		
		// For copying the values
		
		for(int i = 0; i < btnArr.length; i++) {
			
			String copyStr = labelArr[i].getText();
			
			
			btnArr[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					// Copy text thing to clipboard
					
					StringSelection stringSelection = new StringSelection(copyStr);
					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					clipboard.setContents(stringSelection, null);
					
					JOptionPane.showMessageDialog(getParent(), "Code Copied");

					
				}
			});
		}
		
		
		
		// After Button is clicked 
		
		change = new JButton("<html>S<br>P<br>A<br>C<br>E<br>B<br>A<br>R</html>");
		change.setBackground(Color.black);
		change.setForeground(Color.white);
		change.setFocusable(true);
		change.setFocusPainted(false);
		change.setBorderPainted(false);
		change.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < panelArr.length; i++) {
					String color = colorGenerator();
				
					labelArr[i].setText(color);
					panelArr[i].setBackground(Color.decode(color));
				}
				
			}
		});
		
		
		add(change);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		
		setLayout(new GridLayout());
		setBackground(Color.white);
		
		
		
		

		
		
		
		
	}
	
	
	private String colorGenerator() {

		String colorStr = "#";
		
		// Hex color value has alphabets from a-f, A-F, 0-9;

		String arr[] = {"a","b","c","d","e","f","0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		
		// Random class generates random values in range
		Random random = new Random();
		
		
		// AS hex color = #aaf2f2 i.e a -> 1, a -> 2, f -> 3, 2 -> 4, f -> 5, 2 -> 6;
		int i = 6;
		
		// loop six times 
		while(i > 0) {
			colorStr += arr[random.nextInt(arr.length)];
			i --;
		}
		
		return colorStr;
	}

}
