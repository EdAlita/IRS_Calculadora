package PParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.text.DecimalFormat;

import javax.swing.JPanel;

public class PanelIRS  extends JPanel{
	
	private Label lDPermitidas,
	  			  lMcalculaISR,
	              lCuotaFija,
	              lExcedentes,
	              lPagoE,
	              lTotalPagar,
	              llineas;
	private ISR isr;

	PanelIRS(String Nombre,String RFC,double sMensual,double aguinaldo,double PVacacional,double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(600,800));
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		setFont(new Font("Default",Font.BOLD,18));
		
		isr = new ISR(Nombre,RFC,sMensual,aguinaldo,PVacacional,medicos,funerarios,seguro,hipotecario,donativo,retiro,transporte,colegiatura,nivelEducativo);
		
		double monto = this.isr.getMonto()-isr.maximoDeducible();
		this.isr.cuotaFija(monto);
		
		this.lDPermitidas=new Label("Deducion Permitida"+" "+df.format(this.isr.maximoDeducible()));
		this.lDPermitidas.setPreferredSize(new Dimension(400,50));
		this.add(this.lDPermitidas);
		
		this.lMcalculaISR=new Label("Monto sobre el cual se calcula ISR"+" "+df.format(monto));
		this.lMcalculaISR.setPreferredSize(new Dimension(400,50));
		this.add(this.lMcalculaISR);
		
		this.lCuotaFija=new Label("Cuota Fija"+" "+df.format(this.isr.getCuota()));
		this.lCuotaFija.setPreferredSize(new Dimension(400,50));
		this.add(this.lCuotaFija);
		
		this.lExcedentes=new Label("% Excedente limite Inferior"+" "+df.format(this.isr.getPorcentaje()));
		this.lExcedentes.setPreferredSize(new Dimension(400,50));
		this.add(this.lExcedentes);
		
		this.lPagoE=new Label("Pago de Excedentes limite inferior"+" "+df.format(this.isr.getPago()));
		this.lPagoE.setPreferredSize(new Dimension(400,50));
		this.add(this.lPagoE);
		
		this.llineas=new Label("-------------------------------------------------------------------------------------------------------------------------------------------------");
		this.llineas.setPreferredSize(new Dimension(1000,100));
		this.add(this.llineas);
		
		this.lTotalPagar=new Label("Total a Pagar"+" "+df.format(this.isr.getCuota()+this.isr.getPago()));
		this.lTotalPagar.setPreferredSize(new Dimension(400,50));
		this.add(this.lTotalPagar);
	}
}
