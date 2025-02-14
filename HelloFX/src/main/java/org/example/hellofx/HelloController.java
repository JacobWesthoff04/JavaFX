package org.example.hellofx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private WebView webView;

    @FXML
    private TextField textField;

    private WebEngine engine;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        engine = webView.getEngine();
        loadPage();
    }

    public void loadPage() {

    }
}