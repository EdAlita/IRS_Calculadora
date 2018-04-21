package PParcial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelGrupal extends JPanel implements ActionListener {
	private Label lIntruccion,
				  lIntruccion2;
	private JTextField tfDireccion,
	                   tfDestino;
	private JButton btDireccion,
					btDestino,
					btCalcular;
	private JFileChooser fc,
						 fc2;
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
	
	
	PanelGrupal(){
	
	super();
	this.setPreferredSize(new Dimension(400,200));
	this.setBackground(Color.LIGHT_GRAY);
		
	this.lIntruccion=new Label("Seleccione el archivo");
	this.lIntruccion.setFont(new Font("Holi",Font.BOLD,24));
	this.add(lIntruccion);
		
	this.tfDireccion=new JTextField(12);
	this.btDireccion=new JButton("Selecciona Archivo");
	this.btDireccion.addActionListener(this);
	this.add(this.tfDireccion);
	this.add(this.btDireccion);
	
	this.fc=new JFileChooser();
		
	this.lIntruccion2=new Label("Seleccione destino del Archivo");
	this.lIntruccion2.setFont(new Font("Holi",Font.BOLD,24));
	this.add(lIntruccion2);
		
	this.tfDestino=new JTextField(12);
	this.btDestino=new JButton("Selecciona guardado");
	this.btDestino.addActionListener(this);
	this.add(this.tfDestino);
	this.add(this.btDestino);
	
	this.fc2=new JFileChooser();
	
	this.btCalcular=new JButton("Calcular");
	this.btCalcular.setPreferredSize(new Dimension(400,25));
	this.btCalcular.addActionListener(this);
	this.add(btCalcular);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		if(arg0.getSource()==this.btDestino){
			int resp2=this.fc2.showOpenDialog(this);
			if(resp2==JFileChooser.APPROVE_OPTION){
			//fc2.setCurrentDirectory(fc2.DIRECTORIES_ONLY);
			this.fc2.getSelectedFile().toString();
			this.tfDestino.setText(this.fc2.getSelectedFile().toString());
			}
		}else if(arg0.getSource()==this.btDireccion){
			int resp=this.fc.showOpenDialog(this);
			if(resp==JFileChooser.APPROVE_OPTION){
				this.fc.getSelectedFile().toString();
				this.tfDireccion.setText(this.fc.getSelectedFile().toString());
			}
		}else{
			try {
				BufferedReader bf=new BufferedReader(new FileReader(this.fc.getSelectedFile()));
				PrintWriter pw = new PrintWriter(new FileWriter(this.fc2.getSelectedFile()));
				String linea = bf.readLine();
				pw.println("Nombre, RFC,Ingreso Mensual,Ingreso Anual,Aguinaldo,Aguinaldo Exento,Aguinaldo Gravado,Prima Vaccional,Prima V. Excenta,Prima V. Gravada,Total de Ingresos Gravados,Medicos y Hospitales,Gastos funerarios,SGMM,Hipotecarios,Donativos,Subcuenta retiro,Transporte escolar,Nivel Educativo,Maximo a deducir Coleguiaturas,Total pagado de Coleguiaturas,total deduciones,Deducciones permitidas,Monto sobre el cual se clacula ISR,cuota fija,% excedente limite inferior,Pago excedente limite inferior,Total a Pagar");
				while(linea!=null){
					StringTokenizer st= new StringTokenizer(linea);
					linea=bf.readLine();
				
					this.Nombre=st.nextToken(",");
					this.RFC=st.nextToken(",");
					this.SMensual=Double.parseDouble(st.nextToken(","));
					this.Aguinaldo=Double.parseDouble(st.nextToken(","));
					this.PVacacional=Double.parseDouble(st.nextToken(","));
					this.Hospital=Double.parseDouble(st.nextToken(","));
					this.funerarios=Double.parseDouble(st.nextToken(","));
					this.Seguro=Double.parseDouble(st.nextToken(","));
					this.Hipoteca=Double.parseDouble(st.nextToken(","));
					this.Donativos=Double.parseDouble(st.nextToken(","));
					this.Aportaciones=Double.parseDouble(st.nextToken(","));
					this.Transporte=Double.parseDouble(st.nextToken(","));
					this.NivelE=st.nextToken(",");
					this.Coleguiatura=Double.parseDouble(st.nextToken(","));
					
					Persona per = new Persona(this.Nombre, this.RFC, this.SMensual, this.Aguinaldo, this.PVacacional);
					//double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo
					Deducciones dec = new Deducciones(this.Hospital, this.funerarios, this.Seguro, this.Hipoteca, this.Donativos,this.Aportaciones, this.Transporte, this.Coleguiatura, this.NivelE);
					//String nombre, String rfc, double sueldoMensual, double aguinaldo, double primaRecibida, double medicos, double funerarios, double seguro, double hipotecario, double donativo, double retiro, double transporte, double colegiatura, String nivelEducativo
					ISR isr = new ISR(this.Nombre, this.RFC, this.SMensual, this.Aguinaldo, this.PVacacional,this.Hospital, this.funerarios, this.Seguro, this.Hipoteca, this.Donativos, this.Aportaciones, this.Transporte, this.Coleguiatura, this.NivelE);
					
					double monto = isr.getMonto()-isr.maximoDeducible();
					isr.cuotaFija(monto);
					
					pw.println(per.getNombre()+","+per.getRfc()+","+per.getSueldoMensual()+","+per.ingresoAnual()+","+per.getAguinaldo()+","+per.aguinaldoExento()+","+per.aguinaldoGravado()+","+per.getPrimaRecibida()+","+per.getPrimaExenta()+","+per.primaVacacionalGravada()+","+per.totalGravado()+","+this.Hospital+","+this.funerarios+","+this.Seguro+","+this.Hipoteca+","+this.Donativos+","+this.Aportaciones+","+this.Transporte+","+this.NivelE+","+dec.deducibleColegiatura()+","+this.Coleguiatura+","+dec.maximoDeducir()+","+isr.maximoDeducible()+","+monto+","+isr.getCuota()+","+isr.getPorcentaje()+","+isr.getPago()+","+(isr.getPago()+isr.getCuota()));
				}
				bf.close();
				pw.close();
				
				JOptionPane.showMessageDialog(null, "El calculo se ha generado");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(NullPointerException n){
				JOptionPane.showMessageDialog(null, "Poner direcciones antes de Calcular");
			}
			
		}
		
	}
}
