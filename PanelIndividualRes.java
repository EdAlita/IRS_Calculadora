package PParcial;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelIndividualRes extends JPanel {

	private Image fondo;
	
		PanelIndividualRes(String Nombre,String RFC,double sMensual,double aguinaldo,double PVacacional,double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo,JFrame frame){
			super();
			//this.setBackground(Color.LIGHT_GRAY);
			this.setPreferredSize(new Dimension(2000,900));
			this.fondo=new ImageIcon("contabilidad.jpg").getImage();
			
			setFont(new Font("Default",Font.BOLD,18));
			
			PanelPersona pp = new PanelPersona(Nombre,RFC,sMensual,aguinaldo,PVacacional);
			PanelDeduciones pd = new PanelDeduciones(medicos,funerarios,seguro,hipotecario,donativo,retiro,transporte,colegiatura,nivelEducativo);
			PanelIRS pi = new PanelIRS(Nombre,RFC,sMensual,aguinaldo,PVacacional,medicos,funerarios,seguro,hipotecario,donativo,retiro,transporte,colegiatura,nivelEducativo);
			PanelControles pc = new PanelControles(frame);

			this.add(pp,BorderLayout.WEST);
			this.add(pd);
			this.add(pi,BorderLayout.EAST);
			//this.add(pc,BorderLayout.SOUTH);
			
				
			}
		
		public void paintComponent(Graphics g){
			g.drawImage(this.fondo, 0, 0,this.getWidth(),this.getHeight(), this);
		}

}
