package view;


import javax.swing.JOptionPane;

import banco.Banco;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import excecoes.DadosException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import model.Paciente;
import model.Socio;
import app.Main;


public class CaSocioGUI extends BorderPane {
	
	private ChoiceBox<String> choiceSocio, choiceEstado;
	private TextField nomeField,enderecoField,cidadeField,rgField,cpfField,
	nasciField,telefoneCelularField,dataFiliacaoField,emailField,valorContribuicaoField;
	
	public CaSocioGUI(){
		
		//Set Título
		Label titulo = new Label("Cadastrar Sócio");
		titulo.setFont(new Font(30));
		
		
		MeuMenu menuBar = new MeuMenu(); 
		
		Label nomeTexto = new Label("Nome: ");
		Label enderecoTexto = new Label("Endereço: ");
		Label cidadeTexto = new Label("Cidade: ");	
		Label estadoTexto = new Label("Estado: ");
		Label rgTexto = new Label("RG: ");
		Label cpfTexto = new Label("CPF: ");
		Label nasciTexto = new Label("Nascimento: ");
		Label telefoneCelularTexto = new Label("Telefone: ");
		Label emailTexto = new Label("Email: ");
		Label tipoSocioTexto = new Label("Tipo de Sócio: ");
		Label dataFiliacaoTexto = new Label("Data de Filiação: ");
		Label valorContribuicaoTexto = new Label("Valor arrecadação: ");
			
		ObservableList<String>TpSocio = FXCollections.observableArrayList();
		TpSocio.addAll("Contribuinte","Voluntário");
		
		ObservableList<String>TpEstado = FXCollections.observableArrayList();
		TpEstado.addAll("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
		
		choiceSocio = new ChoiceBox<String>();
		choiceSocio.setItems(TpSocio);
		choiceSocio.setPrefSize(200.0, 27.0);
		
		choiceEstado = new ChoiceBox<String>();
		choiceEstado.setItems(TpEstado);
		choiceEstado.setPrefSize(200.0, 27.0);
		
		nomeField = new TextField();
		nomeField.setPrefSize(700.0, 27.0);
		
		enderecoField = new TextField();
		enderecoField.setPrefSize(540.0, 27.0);
		
		cidadeField = new TextField();
		cidadeField.setPrefSize(170.0, 27.0);
		
		rgField = new TextField();
		rgField.setPrefSize(200.0, 27.0);
		
		cpfField = new TextField();
		cpfField.setPrefSize(170.0, 27.0);
		
		nasciField = new TextField();
		nasciField.setPrefSize(170.0, 27.0);

		telefoneCelularField = new TextField();
		telefoneCelularField.setPrefSize(200.0, 27.0);
		
		dataFiliacaoField = new TextField();
		dataFiliacaoField.setPrefSize(200.0, 27.0);
		
		emailField = new TextField();
		emailField.setPrefSize(170.0, 27.0);
		
		valorContribuicaoField = new TextField();
		valorContribuicaoField.setPrefSize(170.0, 27.0);
		
		Button cadastrar = new Button("Cadastrar");
		Button cancelar = new Button("Cancelar");
	
		//Conjunto linha 1.
		HBox hbox1 = new HBox(62);
		hbox1.getChildren().addAll(nomeTexto,nomeField);
		
		//Conjunto linha 2.
		HBox hbox2E1 = new HBox(40);
		hbox2E1.getChildren().addAll(enderecoTexto,enderecoField);
		
		HBox hbox2 = new HBox(55);
		hbox2.getChildren().addAll(hbox2E1);
		
		//Conjunto Linha 3.		
		
		HBox hbox3E2 = new HBox(45);
		hbox3E2.getChildren().addAll(cidadeTexto,cidadeField);
		
		HBox hbox3E3 = new HBox(61);
		hbox3E3.getChildren().addAll(estadoTexto,choiceEstado);
		
		HBox hbox3E4 = new HBox(61);
		hbox3E3.getChildren().addAll(telefoneCelularTexto,telefoneCelularField);

		HBox hbox3 = new HBox(70);
		hbox3.getChildren().addAll(hbox3E2,hbox3E3, hbox3E4);
		
		//Conjunto Linha 4.
		HBox hbox4E1 = new HBox(81);
		hbox4E1.getChildren().addAll(rgTexto,rgField);
		
		HBox hbox4E2 = new HBox(38);
		hbox4E2.getChildren().addAll(cpfTexto,cpfField);
		
		HBox hbox4E3 = new HBox(5);
		hbox4E3.getChildren().addAll(nasciTexto,nasciField);
		
		HBox hbox4 = new HBox(97);
		hbox4.getChildren().addAll(hbox4E1,hbox4E2,hbox4E3);
		
		
		//Conjunto linha 5.
		
		HBox hbox5E2 = new HBox(60);
		hbox5E2.getChildren().addAll(dataFiliacaoTexto,dataFiliacaoField);
		
		HBox hbox5E3 = new HBox(60);
		hbox5E3.getChildren().addAll(emailTexto,emailField);
		
		HBox hbox5 = new HBox(82);
		hbox5.getChildren().addAll(hbox5E2,hbox5E3);
		
		//Conjunto linha 6.
		HBox hbox6E1 = new HBox(15);
		hbox6E1.getChildren().addAll(tipoSocioTexto,choiceSocio);
		
		HBox hbox6E2 = new HBox(15);
		hbox6E1.getChildren().addAll(valorContribuicaoTexto,valorContribuicaoField);
		
		HBox hbox6 = new HBox(30);
		hbox6.getChildren().addAll(hbox6E1,hbox6E2);

		
		//Conjunto linha 7.
		HBox hbox7 = new HBox(10);
		hbox7.getChildren().addAll(cadastrar,cancelar);
		
		VBox vboxTitulo = new VBox(30);
		vboxTitulo.getChildren().addAll(titulo);
		
		VBox vbox = new VBox(15);
		vbox.getChildren().addAll(vboxTitulo,hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7);
		
		//Sets Alinhamento
		vboxTitulo.setAlignment(Pos.CENTER);
		hbox7.setAlignment(Pos.BOTTOM_RIGHT);
		
		//Distância da borda.
		vbox.setPadding(new Insets(50,100,10,100));
		
		//Setando elementos do formulário no Centro.
		setCenter(vbox);

		
		// Fundo
		Image fundo = new Image("/image/telaprinc.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		setCenter(stack);
		setTop(menuBar);     //Setando menuBar sempre no topo.
		
		//Função Botão cancelar
		cancelar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Main.mudarTela(new TelaPrincipal());
				
			}
		});
		
		cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(nomeField.getText().equals("") || cpfField.getText().equals("") || enderecoField.getText().equals("") || rgField.getText().equals("") || telefoneCelularField.getText().equals("") || nasciField.getText().equals("") || cidadeField.getText().equals("") || dataFiliacaoField.getText().equals("") || valorContribuicaoField.getText().equals("")){
					new TelaAux("Por Favor informe todos os dados!");
				}else{
					Socio socio;
					try {
						socio = new Socio(nomeField.getText(), enderecoField.getText(), cidadeField.getText(), choiceEstado.getSelectionModel().getSelectedItem(), rgField.getText(), cpfField.getText(), nasciField.getText(), telefoneCelularField.getText(), choiceSocio.getSelectionModel().getSelectedItem()+"", dataFiliacaoField.getText(), emailField.getText(),Double.parseDouble(valorContribuicaoField.getText()));
						Banco banco = Main.getBanco();
						banco.addObjeto(socio);
						new TelaAux("S�cio Cadastrado Com Sucesso!");
						limpaCampos();
						
					} catch (NumberFormatException nfex) {
						new TelaAux("Valor Arrecada��o Inv�lido!");//new TelaErro(ex.getMessage().toString());
						nfex.printStackTrace();
						
					} catch (Exception ex) {
						new TelaAux("Dados Informados inv�lidos");//new TelaErro(ex.getMessage().toString());
						ex.printStackTrace();
					}
				}
			}

			private void limpaCampos() {
				nomeField.setText("");enderecoField.setText("");cidadeField.setText("");rgField.setText("");
				cpfField.setText("");nasciField.setText("");emailField.setText("");valorContribuicaoField.setText("");
				telefoneCelularField.setText("");dataFiliacaoField.setText("");//choiceEstado.setItems(null);
			}
			
		});
	}
}
