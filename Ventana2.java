package PParcial;
import javax.swing.JFrame;

public class Ventana2 extends JFrame{
	
	public Ventana2(){
		super("Calculador de Impuesto sobre la Renta");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(400, 250);
		PanelIndividual ind = new PanelIndividual(this);
		this.add(ind);
		this.pack();

	}

	public static void main(String[] args) {
		Ventana2 v = new Ventana2();
	}

}
