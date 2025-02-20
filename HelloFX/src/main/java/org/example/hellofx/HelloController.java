package org.example.hellofx;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private WebView webView;

    @FXML
    private TextField textField;

    private WebEngine engine;
    private webHistory history;

    private String homePage;

    private double webZoom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        engine = webView.getEngine();
        homePage = "www.google.com";
        textField.setText(homePage);
        webZoom = 1.0;
        loadPage();
    }

    public void loadPage() {
        //engine.load("https://www.google.com");
        engine.load("https://" + textField.getText());
    }

    public void refreshPage() {

        engine.reload();
    }

    public void zoomIn() {

        webZoom += 0.25;
        webView.setZoom(1.25);
    }

    public void zoomOut() {

        webZoom -= 0.25;
        webView.setZoom(0.75);
    }

    public void displayHistory() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();

        for(WebHistory.Entry entry : entries) {

            System.out.println(entry);
        }
    }
}