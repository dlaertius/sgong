package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import app.Main;

public class TelaLoguin extends BorderPane {
	
	public  TelaLoguin(){
		
		
		Label nome = new Label("Usuário:");
		Label senha = new Label("Senha:");
		
		final TextField nomeField = new TextField();
		final PasswordField senhaField = new PasswordField();//senha
		
		Button entrar = new Button("Entrar");
		
		final Label informacao = new Label();

		HBox hbox1 = new HBox(35);
		hbox1.getChildren().addAll(nome,nomeField);
		
		HBox hbox2 = new HBox(40);
		hbox2.getChildren().addAll(senha,senhaField);
		
		VBox vbox = new VBox(30);
		vbox.getChildren().addAll(hbox1,hbox2,entrar,informacao);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		vbox.setAlignment(Pos.CENTER);
		
		// Fundo
		Image fundo = new Image("/image/telalogin.png");
		ImageView verFundo = new ImageView(fundo);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(verFundo,vbox);
		setCenter(stack);
		

		entrar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if (nomeField.getText().equals("adm") &&  (senhaField.getText().equals("adm"))){
					Main.mudarTela(new TelaPrincipal());
				}else if(nomeField.getText().equals("") || senhaField.getText().equals("")){
					informacao.setText("Digite usuário e senha!");
				}
				else {
					informacao.setText("Este usuário não tem permissão!");
				}
			}
		});
	}
}
