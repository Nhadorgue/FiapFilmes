import javax.swing.*;
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
		abas.add("Lista", new JLabel());
		add(abas);
		
		
		JPanel painelImagem = new JPanel();
		painelImagem.setLayout(new BoxLayout(painelImagem, BoxLayout.X_AXIS));
		JLabel img = new JLabel(new ImageIcon("src/img.jpg"));
		painelImagem.add(img);
		
		
		JPanel painelCentro = new JPanel();
		painelCentro.setLayout(new BoxLayout(painelCentro, BoxLayout.Y_AXIS));
		JLabel lblTitulo = new Labels("Título");
		JTextField tfTitulo = new JTextField();
		JLabel lblSinopse = new Labels("Sinopse");
		JTextField tfSinopse = new JTextField();
		JLabel lblGenero = new Labels("Gênero");
		String[] generos = {"Selecione...", "Ação", "Aventura", "Corrida"};
		JComboBox cbGeneros = new JComboBox<String>(generos);
		JButton btnSalvar = new JButton("  Salvar  ");
		JButton btnCancelar = new JButton("Cancelar");
		painelCentro.add(lblTitulo);
		painelCentro.add(tfTitulo);
		painelCentro.add(lblSinopse);
		painelCentro.add(tfSinopse);
		painelCentro.add(lblGenero);
		painelCentro.add(cbGeneros);
		painelCentro.add(btnSalvar);
		painelCentro.add(btnCancelar);
		
		
		JPanel painelDireita = new JPanel();
		painelDireita.setLayout(new BoxLayout(painelDireita, BoxLayout.Y_AXIS));
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
		StarRater srAvaliacao = new StarRater(5);
		painelDireita.add(lblAssistir);
		painelDireita.add(rbNetflix);
		painelDireita.add(rbPrime);
		painelDireita.add(rbPirate);
		painelDireita.add(ckbAssistido);
		painelDireita.add(srAvaliacao);
		
		painelPrincipal.add(painelImagem, BorderLayout.WEST);
		painelPrincipal.add(painelCentro, BorderLayout.CENTER);
		painelPrincipal.add(painelDireita, BorderLayout.EAST);
		
		Filme cadastrar = new Filme(tfTitulo, tfSinopse, cbGeneros, grupoRB, ckbAssistido, srAvaliacao);
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
