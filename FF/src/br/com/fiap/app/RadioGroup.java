package br.com.fiap.app;
import java.awt.BorderLayout;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioGroup extends JPanel{
	
	private List<String> opcoes;
	private ButtonGroup grupo = new ButtonGroup();
	
	
	
	public RadioGroup(List<String> opcoes) {
		super();
		this.opcoes = opcoes;
		init();
		
	}
	
	
	private void init() {
		opcoes.forEach(opcao ->{
			JRadioButton rbOpcao = new JRadioButton(opcao);
			this.add(rbOpcao);
			grupo.add(rbOpcao);
		});
		
	}

	
}
