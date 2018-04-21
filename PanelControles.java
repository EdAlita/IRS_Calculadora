package PParcial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelControles extends JPanel implements ActionListener {

	private JButton btSalir;
	private JFrame frame;
	
	PanelControles(JFrame frame){
		super();
		this.frame=frame;
		this.setPreferredSize(new Dimension(1600,50));
		this.setBackground(Color.BLUE);
		
		this.btSalir = new JButton("Salir");
		this.btSalir.addActionListener(this);
		this.btSalir.setPreferredSize(new Dimension(300,50));
		this.add(this.btSalir,BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.dispose();
		
	}

}
