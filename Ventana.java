package PParcial;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	
	
	public Ventana(){
		super("Calculador de Impuesto sobre la Renta");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(400, 250);
		this.setResizable(false);
		Menu men = new Menu();
		this.add(men);
		PanelBotones pb = new PanelBotones();
		this.add(pb,BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	
	}

	public static void main(String[] args) {
		Ventana v = new Ventana();
	}

}
