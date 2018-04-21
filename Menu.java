package PParcial;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends JPanel{

	private Image fondo;
	
		public Menu(){
			super();
			this.setPreferredSize(new Dimension(1200,600));
			this.fondo=new ImageIcon("contabilidad.jpg").getImage();

		}
		
		public void paintComponent(Graphics g){
			g.setFont(new Font("Default",Font.BOLD,100));
			g.setColor(Color.BLUE);
			g.drawImage(this.fondo, 0, 0,this.getWidth(),this.getHeight(), this);
			g.drawString("Calculador de", 100, 200);
			g.drawString("Impuestos", 150, 300);
			g.drawString("Sobre la", 200, 400);
			g.drawString("Renta", 250, 500);
			g.setFont(new Font("Default",Font.BOLD,35));
			g.drawString("por: Edwing Ulin y Miguel Bucio", 300, 550);
		}


}
