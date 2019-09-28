package acronianalytics.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;


public class JogoController implements Initializable {

    boolean[] aux = new boolean[3];
    
    @FXML
    private GridPane gplabels;
    
    @FXML
    private Pane active;
    
    @FXML
    private BarChart<String, Number> bar;
    
    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    
    private static ScrollPane sp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        yAxis.setLabel("N.º pessoas");
        XYChart.Series<String, Number> series1 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series2 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series3 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series4 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series5 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series6 = new XYChart.Series<>(); 
        XYChart.Series<String, Number> series7 = new XYChart.Series<>(); 
        series1.setName("5"); 
        series1.getData().add(new XYChart.Data<>("", 240)); 
        series2.setName("7"); 
        series2.getData().add(new XYChart.Data<>("", 490)); 
        series3.setName("10"); 
        series3.getData().add(new XYChart.Data<>("", 330)); 
        series4.setName("15"); 
        series4.getData().add(new XYChart.Data<>("", 100)); 
        series5.setName("20"); 
        series5.getData().add(new XYChart.Data<>("", 75)); 
        series6.setName("25"); 
        series6.getData().add(new XYChart.Data<>("", 55)); 
        series7.setName("30"); 
        series7.getData().add(new XYChart.Data<>("", 20)); 
        bar.getData().addAll(series1, series2, series3, series4, series5, series6, series7);
        bar.setLegendVisible(true);
        bar.setBarGap(40);
        bar.setLegendVisible(false);
        bar.lookupAll(".default-color0.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color6.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color1.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color2.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color3.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color4.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
        bar.lookupAll(".default-color5.chart-bar").forEach((n) -> {
            n.setStyle("-fx-bar-fill: #0093ff80;");
        });
    }    
    
    
}
