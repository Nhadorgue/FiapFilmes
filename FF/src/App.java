import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.List;

public class App extends JFrame{
	
	public void init() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastrar", painelPrincipal);
		abas.add("Lista", new Labels("Lista de Filmes"));
		add(abas);
		
		
		JPanel painelImagem = new JPanel();
		painelImagem.setBorder(new EmptyBorder(20, 10, 0, 0));
		JLabel img = new JLabel(new ImageIcon("src/img.jpg"));
		painelImagem.add(img);
		
		
		JPanel painelCentro = new JPanel();
		painelCentro.setLayout(new GridLayout(8,1));
		painelCentro.setBorder(new EmptyBorder(20, 10, 20, 20));
		JLabel lblTitulo = new Labels("Título");
		JTextField tfTitulo = new JTextField();
		JLabel lblSinopse = new Labels("Sinopse");
		JTextArea taSinopse = new JTextArea();
		JLabel lblGenero = new Labels("Gênero");
		String[] generos = {"Selecione...", "Ação", "Aventura", "Corrida"};
		JComboBox cbGeneros = new JComboBox<String>(generos);
		painelCentro.add(lblTitulo);
		painelCentro.add(tfTitulo);
		painelCentro.add(lblSinopse);
		painelCentro.add(taSinopse);
		painelCentro.add(lblGenero);
		painelCentro.add(cbGeneros);
		
		
		JPanel painelDireita = new JPanel();
		painelDireita.setLayout(new BoxLayout(painelDireita, BoxLayout.Y_AXIS));
		painelDireita.setBorder(new EmptyBorder(20, 10, 0, 0));
		JLabel lblAssistir = new Labels("Onde Assistir");
		ButtonGroup grupoRB = new ButtonGroup();
		JRadioButton rbNetflix = new JRadioButton("Netflix");
		rbNetflix.setActionCommand("NETFLIX");
		JRadioButton rbPrime = new JRadioButton("Prime Video");
		rbPrime.setActionCommand("PRIME VIDEO");
		JRadioButton rbPirate = new JRadioButton("Pirate Bay");
		rbPirate.setActionCommand("PIRATE BAY");
		grupoRB.add(rbNetflix);
		grupoRB.add(rbPrime);
		grupoRB.add(rbPirate);
		JCheckBox ckbAssistido = new JCheckBox("Assistido");
		JLabel lblAvaliacao = new Labels("Avaliação");
		StarRater srAvaliacao = new StarRater(5);
		painelDireita.add(lblAssistir);
		painelDireita.add(rbNetflix);
		painelDireita.add(rbPrime);
		painelDireita.add(rbPirate);
		painelDireita.add(ckbAssistido);
		painelDireita.add(lblAvaliacao);
		painelDireita.add(srAvaliacao);
		
		JPanel painelBaixo = new JPanel();
		JButton btnSalvar = new JButton("  Salvar  ");
		JButton btnCancelar = new JButton("Cancelar");
		painelBaixo.add(btnSalvar);
		painelBaixo.add(btnCancelar);
		
		painelPrincipal.add(painelImagem, BorderLayout.WEST);
		painelPrincipal.add(painelCentro, BorderLayout.CENTER);
		painelPrincipal.add(painelDireita, BorderLayout.EAST);
		painelPrincipal.add(painelBaixo, BorderLayout.SOUTH);
		
		Filme cadastrar = new Filme(tfTitulo, taSinopse, cbGeneros, grupoRB, ckbAssistido, srAvaliacao);
		btnSalvar.addActionListener(cadastrar);
		
		setSize(600, 350);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new App().init();
	}

}
