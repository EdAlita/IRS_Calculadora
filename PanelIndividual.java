package PParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelIndividual extends JPanel implements ActionListener{
	
	private Label lNombre,
	              lRFC,
	              lSMensual,
	              lAguinaldo,
	              lPVacacional,
	              lDMH,
	              lDGF,
	              lSGMM,
	              lHipotecarios,
	              lDonativos,
	              lAportacion,
	              lTransporte,
	              lNivelE,
	              lColeguiatura,
	              lEspacio,
	              lIntruciones,
	              lIntruciones2;
	private TextField tfNombre,
	                  tfRFC,
	                  tfSMensual,
	                  tfAguinaldo,
		              tfPVacacional,
		              tfDMH,
		              tfDGF,
		              tfSGMM,
		              tfHipotecarios,
		              tfDonativos,
		              tfAportacion,
		              tfTransporte,
		              tfColeguiatura;
	private JButton btSiguiente;
	private JButton btAtras;
	private JRadioButton rbSecundaria,
	                     rbPrimaria,
	                     rbPreparatoria;
	protected String NivelE,
	               Nombre,
	               RFC;
	protected double SMensual,
	               Aguinaldo,
	               PVacacional,
	               Hospital,
	               funerarios,
	               Seguro,
	               Hipoteca,
	               Donativos,
	               Aportaciones,
	               Transporte,
	               Coleguiatura;
	JFrame frame;
	PanelIndividual(JFrame frame){
		super();
		this.frame=frame;
		this.Nombre="Hola";
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(1200,650));
		setFont(new Font("Default",Font.BOLD,18));
		
		this.lIntruciones=new Label("Bienvenido, llene los datos siguentes para poder calcular su Impuesto sobre la Renta. Porfavor llene todos los datos,");
		this.lIntruciones.setPreferredSize(new Dimension(1200,50));
		this.add(this.lIntruciones);
		
		this.lIntruciones2=new Label("los que no cumplan asignelos 0.00");
		this.lIntruciones2.setPreferredSize(new Dimension(1200,50));
		this.add(this.lIntruciones2);
		
		this.lNombre=new Label("Nombre");
		this.lNombre.setPreferredSize(new Dimension(300,50));
		this.add(this.lNombre);
		
		this.tfNombre= new TextField();
		this.tfNombre.setPreferredSize(new Dimension(200,25));
		this.add(this.tfNombre);
		
		this.lRFC=new Label("RFC");
		this.lRFC.setPreferredSize(new Dimension(300,50));
		this.add(this.lRFC);
		
		this.tfRFC= new TextField();
		this.tfRFC.setPreferredSize(new Dimension(200,25));
		this.add(this.tfRFC);
		
		this.lSMensual=new Label("Sueldo Mensual");
		this.lSMensual.setPreferredSize(new Dimension(300,50));
		this.add(this.lSMensual);
		
		this.tfSMensual= new TextField();
		this.tfSMensual.setPreferredSize(new Dimension(200,25));
		this.add(this.tfSMensual);
		
		this.lAguinaldo=new Label("Aguinaldo Resibido");
		this.lAguinaldo.setPreferredSize(new Dimension(300,50));
		this.add(this.lAguinaldo);
		
		this.tfAguinaldo= new TextField();
		this.tfAguinaldo.setPreferredSize(new Dimension(200,25));
		this.add(this.tfAguinaldo);
		
		this.lPVacacional=new Label("Prima Vacacional");
		this.lPVacacional.setPreferredSize(new Dimension(300,50));
		this.add(this.lPVacacional);
		
		this.tfPVacacional= new TextField();
		this.tfPVacacional.setPreferredSize(new Dimension(200,25));
		this.add(this.tfPVacacional);
		
		this.lDMH=new Label("Deducion Medicos y Hospitalarios");
		this.lDMH.setPreferredSize(new Dimension(300,50));
		this.add(this.lDMH);
		
		this.tfDMH= new TextField();
		this.tfDMH.setPreferredSize(new Dimension(200,25));
		this.add(this.tfDMH);
		
		this.lDGF=new Label("Deducion Gastos Funerarios");
		this.lDGF.setPreferredSize(new Dimension(300,50));
		this.add(this.lDGF);
		
		this.tfDGF= new TextField();
		this.tfDGF.setPreferredSize(new Dimension(200,25));
		this.add(this.tfDGF);
		
		this.lSGMM=new Label("Seguro de Gastos Medicos Mayores");
		this.lSGMM.setPreferredSize(new Dimension(300,50));
		this.add(this.lSGMM);
		
		this.tfSGMM= new TextField();
		this.tfSGMM.setPreferredSize(new Dimension(200,25));
		this.add(this.tfSGMM);
		
		this.lHipotecarios=new Label("Hipotecarios");
		this.lHipotecarios.setPreferredSize(new Dimension(300,50));
		this.add(this.lHipotecarios);
		
		this.tfHipotecarios= new TextField();
		this.tfHipotecarios.setPreferredSize(new Dimension(200,25));
		this.add(this.tfHipotecarios);
		
		this.lDonativos=new Label("Donativos");
		this.lDonativos.setPreferredSize(new Dimension(300,50));
		this.add(this.lDonativos);
		
		this.tfDonativos= new TextField();
		this.tfDonativos.setPreferredSize(new Dimension(200,25));
		this.add(this.tfDonativos);
		
		this.lAportacion=new Label("Aportacion a retiro");
		this.lAportacion.setPreferredSize(new Dimension(300,50));
		this.add(this.lAportacion);
		
		this.tfAportacion= new TextField();
		this.tfAportacion.setPreferredSize(new Dimension(200,25));
		this.add(this.tfAportacion);
		
		this.lTransporte=new Label("Transporte Escolar");
		this.lTransporte.setPreferredSize(new Dimension(300,50));
		this.add(this.lTransporte);
		
		this.tfTransporte= new TextField();
		this.tfTransporte.setPreferredSize(new Dimension(200,25));
		this.add(this.tfTransporte);
		
		this.lNivelE=new Label("Nivel Educativo Hijos");
		this.lNivelE.setPreferredSize(new Dimension(225,50));
		this.add(this.lNivelE);
		
		this.rbPrimaria=new JRadioButton("Primaria",true);
		this.rbSecundaria=new JRadioButton("Secundaria");
		this.rbPreparatoria=new JRadioButton("Preparatoria");
		this.add(this.rbPrimaria);
		this.add(this.rbSecundaria);
		this.add(this.rbPreparatoria);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbPrimaria);
		bg.add(rbSecundaria);
		bg.add(rbPreparatoria);
			
		this.lColeguiatura=new Label("Coleguiatura Total");
		this.lColeguiatura.setPreferredSize(new Dimension(300,50));
		this.add(this.lColeguiatura);
		
		this.tfColeguiatura= new TextField();
		this.tfColeguiatura.setPreferredSize(new Dimension(200,25));
		this.add(this.tfColeguiatura);
		
		this.lEspacio=new Label("");
		this.lEspacio.setPreferredSize(new Dimension(300,200));
		this.add(this.lEspacio);
		
		this.btAtras=new JButton("Atras");
		this.btAtras.setFont(new Font("Holi",Font.BOLD,24));
		this.btAtras.setPreferredSize(new Dimension(300,50));
		this.btAtras.addActionListener(this);
		this.add(this.btAtras);
		
		this.btSiguiente=new JButton("Siguiente");
		this.btSiguiente.setFont(new Font("Holi",Font.BOLD,24));
		this.btSiguiente.setPreferredSize(new Dimension(300,50));
		this.btSiguiente.addActionListener(this);
		this.add(this.btSiguiente);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent evt) {
	
		if(evt.getSource()==this.btAtras){
		this.frame.dispose();
		}else if(evt.getSource()==this.btSiguiente){
			try{
				if(this.rbPrimaria.isSelected()){
					this.NivelE="Primaria";
				}else if(this.rbSecundaria.isSelected()){
					this.NivelE="Secundaria";
				}else if(this.rbPreparatoria.isSelected()){
					this.NivelE="Preparatoria";
				}
			this.Nombre=this.tfNombre.getText();
			this.RFC=this.tfRFC.getText();
			this.SMensual= Double.parseDouble(this.tfSMensual.getText());
			this.Aguinaldo=Double.parseDouble(this.tfAguinaldo.getText());
			this.PVacacional=Double.parseDouble(this.tfPVacacional.getText());
			this.Hospital=Double.parseDouble(this.tfDMH.getText());
			this.funerarios=Double.parseDouble(this.tfDGF.getText());
			this.Seguro=Double.parseDouble(this.tfSGMM.getText());
			this.Hipoteca=Double.parseDouble(this.tfHipotecarios.getText());
			this.Donativos=Double.parseDouble(this.tfDonativos.getText());
            this.Aportaciones=Double.parseDouble(this.tfAportacion.getText());
            this.Transporte=Double.parseDouble(this.tfTransporte.getText());
            this.Coleguiatura=Double.parseDouble(this.tfColeguiatura.getText());
            new Ventana3(this.Nombre,this.RFC,this.SMensual,this.Aguinaldo, this.PVacacional,this.Hospital,this.funerarios,this.Seguro,this.Hipoteca,this.Donativos,this.Aportaciones,this.Transporte,this.Coleguiatura,this.NivelE).setVisible(true);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Llene todos los datos,los que no cumplan ponga 0.00 y ponga numeros no letras");
			}
		}
		
	}

}