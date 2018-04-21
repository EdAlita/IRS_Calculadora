package PParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.text.DecimalFormat;

import javax.swing.JPanel;

public class PanelPersona extends JPanel {

	private Label lNombre,
	              lRFC,
	              lSueldoMensual,
	              lIngresoAnual,
	              lAguinaldo,
	              lAguinaldoE,
	              lAguinaldog,
	              lPrimaV,
	              lPrimaVE,
	              lPrimaVg,
	              lTotalG,
	              llineas;
	
	private Persona persona;
	
	
	PanelPersona(String Nombre,String RFC,double sMensual,double aguinaldo,double PVacacional){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(500,800));
		setFont(new Font("Default",Font.BOLD,18));
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		this.persona = new Persona(Nombre,RFC,sMensual,aguinaldo,PVacacional);
		
		this.lNombre=new Label("Nombre"+" "+this.persona.getNombre());
		this.lNombre.setPreferredSize(new Dimension(400,50));
		this.add(this.lNombre);
	
		this.lRFC=new Label("con RFC"+" "+this.persona.getRfc());
		this.lRFC.setPreferredSize(new Dimension(400,50));
		this.add(this.lRFC);
		
		this.lSueldoMensual=new Label("Sueldo Mesual"+" "+df.format(this.persona.getSueldoMensual()));
		this.lSueldoMensual.setPreferredSize(new Dimension(400,50));
		this.add(this.lSueldoMensual);
		
		this.lIngresoAnual=new Label("Ingreso Anual"+" "+df.format(this.persona.ingresoAnual()));
		this.lIngresoAnual.setPreferredSize(new Dimension(400,50));
		this.add(this.lIngresoAnual);
		
		this.lAguinaldo=new Label("Aguinaldo"+" "+df.format(this.persona.getAguinaldo()));
		this.lAguinaldo.setPreferredSize(new Dimension(400,50));
		this.add(this.lAguinaldo);
		
		this.lAguinaldoE=new Label("Aguinaldo Exento"+" "+df.format(this.persona.aguinaldoExento()));
		this.lAguinaldoE.setPreferredSize(new Dimension(400,50));
		this.add(this.lAguinaldoE);
		
		this.lAguinaldog=new Label("Aguinaldo Gravado"+" "+df.format(this.persona.aguinaldoGravado()));
		this.lAguinaldog.setPreferredSize(new Dimension(400,50));
		this.add(this.lAguinaldog);
		
		this.lPrimaV=new Label("Prima Vacacional"+" "+df.format(this.persona.getPrimaRecibida()));
		this.lPrimaV.setPreferredSize(new Dimension(400,50));
		this.add(this.lPrimaV);
		
		this.lPrimaVE=new Label("Prima Vacacional Exenta"+" "+df.format(this.persona.getPrimaExenta()));
		this.lPrimaVE.setPreferredSize(new Dimension(400,50));
		this.add(this.lPrimaVE);
		
		this.lPrimaVg=new Label("Prima Vacacional Gravada"+" "+df.format(this.persona.primaVacacionalGravada()));
		this.lPrimaVg.setPreferredSize(new Dimension(400,50));
		this.add(this.lPrimaVg);
		
		this.llineas=new Label("-------------------------------------------------------------------------------------------------------------------------------------------------");
		this.llineas.setPreferredSize(new Dimension(1000,100));
		this.add(this.llineas);
		
		this.lTotalG=new Label("Total Gravado"+" "+df.format(this.persona.primaVacacionalGravada()));
		this.lTotalG.setPreferredSize(new Dimension(400,50));
		this.add(this.lTotalG);
	}
}
