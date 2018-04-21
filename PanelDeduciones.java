package PParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.text.DecimalFormat;
import javax.swing.JPanel;

public class PanelDeduciones extends JPanel {
	private Label ltotald,
	              lMaxdeducir,
	              lMedicos,
	              lfunerarios,
	              lSGMM,
	              lHipotecarios,
	              lDonativos,
	              lRetiro,
	              lTransporte,
	              lNivel,
	              lPago,
	              llineas;
	private Deducciones dec;
	PanelDeduciones(double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo){
		
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(600,800));
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		this.dec=new Deducciones(medicos,funerarios,seguro,hipotecario,donativo,retiro,transporte,colegiatura,nivelEducativo);
		
		setFont(new Font("Default",Font.BOLD,18));
		
		this.lMedicos=new Label("Medicos y Hospitales"+" "+this.dec.getMedicos());
		this.lMedicos.setPreferredSize(new Dimension(500,50));
		this.add(lMedicos);
		
		this.lfunerarios=new Label("Gastos Funerarios"+" "+this.dec.getFunerarios());
		this.lfunerarios.setPreferredSize(new Dimension(500,50));
		this.add(lfunerarios);
		
		this.lSGMM=new Label("Seguro de Gastos Medicos"+" "+this.dec.getSeguro());
		this.lSGMM.setPreferredSize(new Dimension(500,50));
		this.add(lSGMM);
		
		this.lHipotecarios=new Label("Hipotecarios"+" "+this.dec.getHipotecario());
		this.lHipotecarios.setPreferredSize(new Dimension(500,50));
		this.add(lHipotecarios);
		
		this.lDonativos=new Label("Donativos"+" "+this.dec.getDonativo());
		this.lDonativos.setPreferredSize(new Dimension(500,50));
		this.add(lDonativos);
		
		this.lRetiro=new Label("Subcuenta Retiro"+" "+this.dec.getRetiro());
		this.lRetiro.setPreferredSize(new Dimension(500,50));
		this.add(lRetiro);
		
		this.lTransporte=new Label("Trasporte Escolares"+" "+this.dec.getTransporte());
		this.lTransporte.setPreferredSize(new Dimension(500,50));
		this.add(lTransporte);
		
		this.lNivel=new Label("Nivel Educativo"+" "+this.dec.getNivelEducativo());
		this.lNivel.setPreferredSize(new Dimension(500,50));
		this.add(lNivel);
		
		this.lMaxdeducir=new Label("Maximo a deducir coleguiaturas"+" "+this.dec.deducibleColegiatura());
		this.lMaxdeducir.setPreferredSize(new Dimension(500,50));
		this.add(lMaxdeducir);
		
		this.lPago=new Label("Total pagado de Coleguiatura"+" "+this.dec.getColegiatura());
		this.lPago.setPreferredSize(new Dimension(500,50));
		this.add(lPago);
		
		this.llineas=new Label("-------------------------------------------------------------------------------------------------------------------------------------------------");
		this.llineas.setPreferredSize(new Dimension(1000,100));
		this.add(this.llineas);
		
		this.ltotald=new Label("Total de deduciones"+" "+this.dec.maximoDeducir());
		this.ltotald.setPreferredSize(new Dimension(500,50));
		this.add(this.ltotald);
	}

}
