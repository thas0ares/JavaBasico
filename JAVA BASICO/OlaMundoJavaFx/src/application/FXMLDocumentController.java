package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController {

    @FXML
    private Button btnClick;

    @FXML
    private Label lblMensagem;

    @FXML
    void clicouBotao(ActionEvent event) {
    	lblMensagem.setText("Olá, Mundo!");

    }

}
