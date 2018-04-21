package PParcial;

import javax.swing.JFrame;

public class Ventana4 extends JFrame {
	public Ventana4(){
		super("Calculador de Impuesto sobre la Renta");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(800, 500);
		this.add(new PanelGrupal());
		this.pack();
		this.setVisible(true);
	
	}

	public static void main(String[] args) {
		Ventana v = new Ventana();
	}
	}

