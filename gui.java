package projectoop;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui extends JFrame {
	
	gui() throws IOException
	{
		
		//this.setLayout(null);
		this.setSize(1200, 900);
		BufferedImage img = ImageIO.read(new File("C://Users//K_K//Downloads//qq.jpg"));

		JLabel backi = new JLabel(new ImageIcon(img));
		backi.setLayout(null);
		backi.setSize(1920, 1080);
		
		this.setMinimumSize(new Dimension(1200,900));
		
		Panel panel1 = new Panel();
		panel1.setLayout(null);
		panel1.setBounds(20, 20, 400, 400);
		panel1.setBackground(Color.green);
		
		Panel panel2 = new Panel();
		panel2.setLayout(null);
		panel2.setBounds(20, 440, 400, 550);
		panel2.setBackground(Color.black);
		
		Panel panel3 = new Panel();
		panel3.setLayout(null);
		panel3.setBounds(450, 20, 1400, 750);
		panel3.setBackground(Color.LIGHT_GRAY);
		
		
		
		Label label1 = new Label();
		label1.setBounds(1200, 800, 650, 200);
		label1.setBackground(Color.black);
		
		Label label2 = new Label();
		label2.setBounds(1230, 830, 40, 40);
		label2.setBackground(Color.yellow);
		
		Label label3 = new Label();
		label3.setBounds(1230, 940, 40, 40);
		label3.setBackground(Color.red);
		
		
		Label label4 = new Label();
		label4.setBounds(1500, 830, 40, 40);
		label4.setBackground(Color.green);
		
		Label label5 = new Label();
		label5.setBounds(1500, 940, 40, 40);
		label5.setBackground(Color.blue);
		
		Panel panel4 = new Panel();
		panel4.setLayout(null);
		panel4.setBounds(450,800, 650, 200);
	
	
		TextArea tr1 = new TextArea("",100,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		tr1.setBounds(450, 800, 680, 200);
		//tr1.setSize(640,50);
		
	//	panel4.add(tr1);
		getContentPane().add(tr1);
	
		getContentPane().add(panel2);
		getContentPane().add(panel1);
		getContentPane().add(panel3);
		
			
		//frame.add(backi);
		getContentPane().add(label5);
		getContentPane().add(label4);
		getContentPane().add(label3);
		getContentPane().add(label2);	
		
		getContentPane().add(label1);
		getContentPane().add(backi);
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		gui f = new gui();
		f.setVisible(true);
	}

}
