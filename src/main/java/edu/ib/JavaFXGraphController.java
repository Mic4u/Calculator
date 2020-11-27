package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;

public class JavaFXGraphController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private LineChart<?, ?> graph;

    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private Button btnLinearPlot;

    @FXML
    private Button btnQuadraticPlot;

    @FXML
    void onLinearClick(ActionEvent event) {

    }

    @FXML
    void onQuadraticClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert graph != null : "fx:id=\"graph\" was not injected: check your FXML file 'graph.fxml'.";
        assert xAxis != null : "fx:id=\"xAxis\" was not injected: check your FXML file 'graph.fxml'.";
        assert yAxis != null : "fx:id=\"yAxis\" was not injected: check your FXML file 'graph.fxml'.";
        assert btnLinearPlot != null : "fx:id=\"btnLinearPlot\" was not injected: check your FXML file 'graph.fxml'.";
        assert btnQuadraticPlot != null : "fx:id=\"btnQuadraticPlot\" was not injected: check your FXML file 'graph.fxml'.";

    }
}
