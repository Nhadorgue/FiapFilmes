import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Filme implements ActionListener{
	
	private JTextField txtTitulo;
	private JTextField txtSinopse;
	private JComboBox cbGenero;
	ButtonGroup onde = null;
	private JCheckBox ckbAssistido;
	private StarRater srAvaliacao;
	
	public Filme(JTextField txtTitulo, JTextField txtSinopse, JComboBox cbGenero, ButtonGroup grupoRB, JCheckBox ckbAssistido, StarRater srAvaliacao){
		this.txtTitulo = txtTitulo;
		this.txtSinopse = txtSinopse;
		this.cbGenero = cbGenero;
		//String assistir = grupoRB.getSelection().getActionCommand();
		this.onde = grupoRB;  
		this.ckbAssistido = ckbAssistido;
		this.srAvaliacao = srAvaliacao;		
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo = txtTitulo.getText().toUpperCase();
		String sinopse = txtSinopse.getText().toUpperCase();
		String genero = (String)cbGenero.getSelectedItem();
		String ondeAssistir = onde.getSelection().getActionCommand();
		String assistido;
		if (ckbAssistido.isSelected()) {
			assistido = "Sim";
			
		}else {
			assistido = "Não";
			
		}
		
		int avaliacao = srAvaliacao.getSelection();
		
		System.out.println("Título: " + titulo + "\nSinopse: " + sinopse + "\nGênero: " + genero.toUpperCase() + "\nOnde Assistir: " + ondeAssistir);
		System.out.println("Assistido: " + assistido.toUpperCase() + "\nAvaliação: " + avaliacao);
		
		
		
	
	}

}
