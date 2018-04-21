package PParcial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel implements ActionListener {

	private JButton BtIndividual,
					BtGrupo;


	
	public PanelBotones(){
		super();
		this.setPreferredSize(new Dimension(25,60));
		this.setBackground(Color.BLUE);
		
		this.BtIndividual = new JButton("Calculo Individual");
		this.BtIndividual.addActionListener(this);
		this.BtIndividual.setPreferredSize(new Dimension(300,50));
		this.BtIndividual.setFont(new Font("Holi",Font.BOLD,24));
		this.BtIndividual.set
		this.add(this.BtIndividual,BorderLayout.CENTER);
		
		this.BtGrupo = new JButton("Calculo Grupal");
		this.BtGrupo.addActionListener(this);
		this.BtGrupo.setPreferredSize(new Dimension(300,50));
		this.BtGrupo.setFont(new Font("Holi",Font.BOLD,24));
		this.add(this.BtGrupo);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.BtIndividual){
		new Ventana2().setVisible(true);
		}else if(e.getSource()==this.BtGrupo){
			new Ventana4().setVisible(true);
		}
		}
	}


