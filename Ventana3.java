package PParcial;

import javax.swing.JFrame;

public class Ventana3 extends JFrame {
	public Ventana3(String Nombre,String RFC,double sMensual,double aguinaldo,double PVacacional,double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo){
		super("Calculador de Impuesto sobre la Renta");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelIndividualRes indres = new PanelIndividualRes(Nombre,RFC,sMensual,aguinaldo,PVacacional,medicos,funerarios,seguro,hipotecario,donativo,retiro,transporte,colegiatura,nivelEducativo,this);
		this.add(indres);
		this.setLocation(0, 0);
		this.pack();

	}

	public static void main(String[] args) {
		Ventana2 v = new Ventana2();
	}
}
