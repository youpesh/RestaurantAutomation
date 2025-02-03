package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class DashboardController {

    @FXML
    private StackPane contentArea; // The container where we will load new views

    @FXML
    private void showDashboard() {
        loadView("dashboard-content.fxml");
    }

    @FXML
    private void showReports() {
        loadView("reports.fxml");
    }

    @FXML
    private void showSettings() {
        loadView("settings.fxml");
    }

    private void loadView(String fxmlFile) {
        try {
            Node view = FXMLLoader.load(getClass().getResource("/com/example/demo1/" + fxmlFile));
            contentArea.getChildren().setAll(view); // Replace content
        } catch (IOException e) {
            System.err.println("Error loading " + fxmlFile + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
