package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import framework_campeonato.Atacante;
import framework_campeonato.Campeonato;
import framework_campeonato.Framework_campeonatoFactory;
import framework_campeonato.Grupo;
import framework_campeonato.Jogador;
import framework_campeonato.Lateral;
import framework_campeonato.Time;
import framework_campeonato.TipoCampeonato;
import framework_campeonato.Zagueiro;
import framework_campeonato.impl.Framework_campeonatoFactoryImpl;

public class Main {

	private JFrame frame;
	private JTextField textField_nomeCampeonato;
	private JTextField textField_campeonatoDataInicio;
	private JTextField textField_campeonatoDataFinal;
	JComboBox<String> comboBox_campeonato;
	JComboBox<String> comboBox_grupos;
	JComboBox<String> comboBox_tipoCampeonato;
	JComboBox<String> comboBox_tipoJog;
	JComboBox<String> comboBox_times;
	JComboBox<String> comboBox_jogadores;
	
	private Map<String, Campeonato> campeonatos = new HashMap<>();
	private JTextField textField_timeNome;
	private JTextField textField_jogNome;
	private JTextField textField_timeCod;
	private JTextField textField_jogCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
Framework_campeonatoFactory fabrica = Framework_campeonatoFactoryImpl.init();
		
		TipoCampeonato enumLike = fabrica.createTipoCampeonato();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCampeonato = new JLabel("Campeonato");
		lblCampeonato.setBounds(10, 11, 96, 14);
		frame.getContentPane().add(lblCampeonato);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Campeonato temp = fabrica.createCampeonato();
				temp.setNome(textField_nomeCampeonato.getText());
				temp.setDataInicial(textField_campeonatoDataInicio.getText());
				temp.setDataFinal(textField_campeonatoDataFinal.getText());
				
				TipoCampeonato tempTipo = fabrica.createTipoCampeonato();
				tempTipo.setValue((String) comboBox_tipoCampeonato.getSelectedItem());
				temp.setTipoCampeonato(tempTipo);
				
				if(((DefaultComboBoxModel<String>)comboBox_campeonato.getModel()).getIndexOf(temp.getNome()) < 0){
					campeonatos.put(temp.getNome(), temp);
					comboBox_campeonato.addItem(textField_nomeCampeonato.getText());
				}
				else{
					JOptionPane.showMessageDialog(null, "Item já existe");
				}
			}
		});
		btnNovo.setBounds(10, 73, 89, 23);
		frame.getContentPane().add(btnNovo);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				temp.setNome(textField_nomeCampeonato.getText());
				temp.setDataInicial(textField_campeonatoDataInicio.getText());
				temp.setDataFinal(textField_campeonatoDataFinal.getText());
				temp.getTipoCampeonato().setValue((String) comboBox_tipoCampeonato.getSelectedItem());
				campeonatos.put(temp.getNome(), temp);
			}
		});
		btnAtualizar.setBounds(109, 73, 89, 23);
		frame.getContentPane().add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				campeonatos.remove(textField_nomeCampeonato.getText());
				comboBox_campeonato.removeItem(textField_nomeCampeonato.getText());
				textField_nomeCampeonato.setText("");
				textField_campeonatoDataFinal.setText("");
				textField_campeonatoDataInicio.setText("");
				comboBox_tipoCampeonato.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, "Item apagado");
			}
		});
		btnApagar.setBounds(208, 73, 89, 23);
		frame.getContentPane().add(btnApagar);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(comboBox_campeonato.getSelectedItem());
				textField_campeonatoDataFinal.setText(temp.getDataFinal());
				textField_campeonatoDataInicio.setText(temp.getDataInicial());
				textField_nomeCampeonato.setText(temp.getNome());
				comboBox_tipoCampeonato.setSelectedItem(temp.getTipoCampeonato().getValue());
			}
		});
		btnAbrir.setBounds(405, 73, 89, 23);
		frame.getContentPane().add(btnAbrir);
		
		textField_nomeCampeonato = new JTextField();
		textField_nomeCampeonato.setBounds(109, 8, 385, 20);
		frame.getContentPane().add(textField_nomeCampeonato);
		textField_nomeCampeonato.setColumns(10);
		
		JLabel lblIncio = new JLabel("In\u00EDcio");
		lblIncio.setBounds(119, 42, 46, 14);
		frame.getContentPane().add(lblIncio);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setBounds(306, 42, 46, 14);
		frame.getContentPane().add(lblFim);
		
		textField_campeonatoDataInicio = new JTextField();
		textField_campeonatoDataInicio.setBounds(165, 39, 132, 20);
		frame.getContentPane().add(textField_campeonatoDataInicio);
		textField_campeonatoDataInicio.setColumns(10);
		
		textField_campeonatoDataFinal = new JTextField();
		textField_campeonatoDataFinal.setBounds(362, 39, 132, 20);
		frame.getContentPane().add(textField_campeonatoDataFinal);
		textField_campeonatoDataFinal.setColumns(10);
		
		JLabel lblGrupos = new JLabel("Grupos");
		lblGrupos.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblGrupos);
		
		comboBox_grupos = new JComboBox<String>();
		comboBox_grupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				
				//Init Times
				atual.getTime().stream().forEach(time -> comboBox_times.addItem(time.getNome()));
			}
		});
		comboBox_grupos.setBounds(66, 117, 175, 20);
		frame.getContentPane().add(comboBox_grupos);
		
		JButton btnNovoGrupo = new JButton("Novo grupo");
		btnNovoGrupo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo tempGrupo = fabrica.createGrupo();
				int rndCode = new Random().nextInt(Integer.MAX_VALUE);
				tempGrupo.setCodigo(String.valueOf(rndCode));
				tempGrupo.setNome(temp.getNome() + String.valueOf(rndCode));
				if(((DefaultComboBoxModel<String>)comboBox_grupos.getModel()).getIndexOf(temp.getNome()) < 0){
					temp.getGrupo().add(tempGrupo);
					comboBox_grupos.addItem(tempGrupo.getCodigo());
				}
				else{
					JOptionPane.showMessageDialog(null, "Item já existe");
				}
			}
		});
		btnNovoGrupo.setBounds(256, 116, 114, 23);
		frame.getContentPane().add(btnNovoGrupo);
		
		JButton btnExcluirGrupo = new JButton("Excluir grupo");
		btnExcluirGrupo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				String grupoCod = (String) comboBox_grupos.getSelectedItem();
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				temp.getGrupo().stream().map(grupo -> !grupo.getCodigo().equalsIgnoreCase(grupoCod)).collect(Collectors.toList());
				comboBox_grupos.removeItem(grupoCod);
				JOptionPane.showMessageDialog(null, "Item apagado");
				comboBox_jogadores.removeAllItems();
				textField_jogCod.setText("");
				textField_jogNome.setText("");
				comboBox_times.removeAllItems();
				textField_timeCod.setText("");
				textField_timeNome.setText("");
			}
		});
		btnExcluirGrupo.setBounds(380, 116, 114, 23);
		frame.getContentPane().add(btnExcluirGrupo);
		
		comboBox_campeonato = new JComboBox<String>();
		comboBox_campeonato.setBounds(307, 74, 88, 20);
		frame.getContentPane().add(comboBox_campeonato);
		
		JPanel panel_Time = new JPanel();
		panel_Time.setBounds(10, 175, 244, 201);
		frame.getContentPane().add(panel_Time);
		panel_Time.setLayout(null);
		
		comboBox_times = new JComboBox<String>();
		comboBox_times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				Time time =  atual.getTime().stream().filter(t -> t.getNome().equals(comboBox_times.getSelectedItem())).findFirst().get();
				
				if(time != null){
					textField_timeCod.setText(String.valueOf(time.getCodigo()));
					textField_timeNome.setText(time.getNome());
					//init Jogadores
					time.getJogador().stream().forEach(jogador -> comboBox_jogadores.addItem(jogador.getNome()));
				}
			}
		});
		comboBox_times.setBounds(10, 11, 224, 20);
		panel_Time.add(comboBox_times);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 42, 46, 14);
		panel_Time.add(lblNome);
		
		textField_timeNome = new JTextField();
		textField_timeNome.setBounds(10, 67, 224, 20);
		panel_Time.add(textField_timeNome);
		textField_timeNome.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 98, 46, 14);
		panel_Time.add(lblCdigo);
		
		textField_timeCod = new JTextField();
		textField_timeCod.setBounds(66, 98, 168, 20);
		panel_Time.add(textField_timeCod);
		textField_timeCod.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				
				Time tempTime = fabrica.createTime();
				tempTime.setCodigo(Integer.parseInt(textField_timeCod.getText()));
				tempTime.setNome(textField_timeNome.getText());
				
				if(!atual.getTime().contains(tempTime)){
					atual.getTime().add(tempTime);
					comboBox_times.addItem(tempTime.getNome());
				}
			}
		});
		btnSalvar.setBounds(10, 134, 108, 23);
		panel_Time.add(btnSalvar);
		
		JButton btnAtualizar_1 = new JButton("Atualizar");
		btnAtualizar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				atual.getTime().stream().filter(t -> t.getNome().equalsIgnoreCase((String) comboBox_times.getSelectedItem())).forEach(time -> {
					time.setCodigo(Integer.parseInt(textField_timeCod.getText()));
					time.setNome(textField_timeNome.getText());
				}); 
			}
		});
		btnAtualizar_1.setBounds(128, 134, 106, 23);
		panel_Time.add(btnAtualizar_1);
		
		JButton btnApagar_1 = new JButton("Apagar");
		btnApagar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String delete = (String) comboBox_times.getSelectedItem();
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				atual.getTime().stream().filter(t -> !t.getNome().equalsIgnoreCase(delete)).collect(Collectors.toList());
				comboBox_jogadores.removeAllItems();
				textField_jogCod.setText("");
				textField_jogNome.setText("");
				comboBox_times.removeItem(delete);
				textField_timeCod.setText("");
				textField_timeNome.setText("");
				comboBox_tipoJog.setSelectedIndex(0);
			}
		});
		btnApagar_1.setBounds(10, 167, 108, 23);
		panel_Time.add(btnApagar_1);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				textField_jogCod.setText("");
				textField_jogNome.setText("");
				textField_timeCod.setText("");
				textField_timeNome.setText("");
				comboBox_tipoJog.setSelectedIndex(0);
				comboBox_jogadores.setSelectedItem("");
				comboBox_times.setSelectedItem("");
			}
		});
		btnLimpar.setBounds(128, 167, 106, 23);
		panel_Time.add(btnLimpar);
		
		JPanel panel_jogador = new JPanel();
		panel_jogador.setBounds(255, 175, 239, 201);
		frame.getContentPane().add(panel_jogador);
		panel_jogador.setLayout(null);
		
		comboBox_jogadores = new JComboBox<String>();
		comboBox_jogadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				Time time =  atual.getTime().stream().filter(t -> t.getNome().equals(comboBox_times.getSelectedItem())).findFirst().get();
				Jogador jogador = time.getJogador().stream().filter(jog -> jog.getNome().equals(comboBox_jogadores.getSelectedItem())).findFirst().get();
				
				if(jogador != null){
					if(jogador instanceof Atacante){
						comboBox_tipoJog.setSelectedItem("Atacante");
					}
					else if(jogador instanceof Lateral){
						comboBox_tipoJog.setSelectedItem("Lateral");
					}
					else if(jogador instanceof Zagueiro){
						comboBox_tipoJog.setSelectedItem("Zagueiro");
					}
					else{
						comboBox_tipoJog.setSelectedItem("Goleiro");
					}
					textField_jogCod.setText(String.valueOf(jogador.getCodigo()));
					textField_jogNome.setText(jogador.getNome());
				}
			}
		});
		comboBox_jogadores.setBounds(10, 11, 219, 20);
		panel_jogador.add(comboBox_jogadores);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(10, 42, 46, 14);
		panel_jogador.add(lblNome_1);
		
		textField_jogNome = new JTextField();
		textField_jogNome.setBounds(10, 67, 219, 20);
		panel_jogador.add(textField_jogNome);
		textField_jogNome.setColumns(10);
		
		JLabel lblCdigo_1 = new JLabel("C\u00F3digo");
		lblCdigo_1.setBounds(10, 98, 46, 14);
		panel_jogador.add(lblCdigo_1);
		
		textField_jogCod = new JTextField();
		textField_jogCod.setBounds(66, 98, 163, 20);
		panel_jogador.add(textField_jogCod);
		textField_jogCod.setColumns(10);
		
		comboBox_tipoJog = new JComboBox<String>();
		comboBox_tipoJog.setBounds(66, 42, 163, 20);
		panel_jogador.add(comboBox_tipoJog);
		comboBox_tipoJog.addItem("Atacante");
		comboBox_tipoJog.addItem("Lateral");
		comboBox_tipoJog.addItem("Zagueiro");
		comboBox_tipoJog.addItem("Goleiro");
		
		JButton btnApagar_2 = new JButton("Apagar");
		btnApagar_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String delete = (String) comboBox_jogadores.getSelectedItem();
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				Time time =  atual.getTime().stream().filter(t -> t.getNome().equals(comboBox_times.getSelectedItem())).findFirst().get();
				time.getJogador().stream().filter(j -> !j.getNome().equalsIgnoreCase(delete)).collect(Collectors.toList());
				comboBox_jogadores.removeItem(delete);
				comboBox_tipoJog.setSelectedIndex(0);
				textField_jogCod.setText("");
				textField_jogNome.setText("");
			}
		});
		btnApagar_2.setBounds(10, 167, 108, 23);
		panel_jogador.add(btnApagar_2);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				comboBox_tipoJog.setSelectedIndex(0);
				textField_jogCod.setText("");
				textField_jogNome.setText("");
			}
		});
		btnLimpar_1.setBounds(128, 167, 101, 23);
		panel_jogador.add(btnLimpar_1);
		
		JButton btnSalvar_1 = new JButton("Salvar");
		btnSalvar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Jogador tempJog;
				switch((String)comboBox_tipoJog.getSelectedItem()){
					case "Atacante":
						tempJog = fabrica.createAtacante();
						break;
					case "Lateral":
						tempJog = fabrica.createLateral();
						break;
					case "Zagueiro":
						tempJog = fabrica.createZagueiro();
						break;
					default:
						tempJog = fabrica.createGoleiro();
				}
				tempJog.setCodigo(Integer.parseInt(textField_jogCod.getText()));
				tempJog.setNome(textField_jogNome.getText());
				
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				Time time = atual.getTime().stream().filter(t -> t.getNome().equalsIgnoreCase((String) comboBox_times.getSelectedItem())).findFirst().get();
				time.getJogador().add(tempJog);
				comboBox_jogadores.addItem(tempJog.getNome());
			}
		});
		btnSalvar_1.setBounds(10, 133, 108, 23);
		panel_jogador.add(btnSalvar_1);
		
		JButton btnAtualizar_2 = new JButton("Atualizar");
		btnAtualizar_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Campeonato temp = campeonatos.get(textField_nomeCampeonato.getText());
				Grupo atual =  temp.getGrupo().stream().filter(grupo -> grupo.getCodigo().equals(comboBox_grupos.getSelectedItem())).findFirst().get();
				Time time = atual.getTime().stream().filter(t -> t.getNome().equalsIgnoreCase((String) comboBox_times.getSelectedItem())).findFirst().get();
				time.getJogador().stream().filter(j -> j.getNome().equals(comboBox_jogadores.getSelectedItem())).forEach(j ->{
					Jogador tempJog;
					switch((String)comboBox_tipoJog.getSelectedItem()){
						case "Atacante":
							tempJog = fabrica.createAtacante();
							break;
						case "Lateral":
							tempJog = fabrica.createLateral();
							break;
						case "Zagueiro":
							tempJog = fabrica.createZagueiro();
							break;
						default:
							tempJog = fabrica.createGoleiro();
					}
					tempJog.setCodigo(Integer.parseInt(textField_jogCod.getText()));
					tempJog.setNome(textField_jogNome.getText());
					j = tempJog;
				});
			}
		});
		btnAtualizar_2.setBounds(128, 133, 101, 23);
		panel_jogador.add(btnAtualizar_2);
		
		comboBox_tipoCampeonato = new JComboBox<String>();
		comboBox_tipoCampeonato.setBounds(10, 41, 89, 20);
		frame.getContentPane().add(comboBox_tipoCampeonato);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 145, 484, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 484, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(10, 150, 244, 14);
		frame.getContentPane().add(lblTime);
		
		JLabel lblJogador = new JLabel("Jogador");
		lblJogador.setBounds(256, 150, 238, 14);
		frame.getContentPane().add(lblJogador);
		comboBox_tipoCampeonato.addItem(enumLike.getPONTOS_CORRIDOS());
		comboBox_tipoCampeonato.addItem(enumLike.getMATA_MATA());
		comboBox_tipoCampeonato.addItem(enumLike.getHIBRIDO());
	}

}
