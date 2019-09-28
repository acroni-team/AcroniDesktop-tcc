package acronianalytics.controllers;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class AplicativoController implements Initializable {

    @FXML
    private GridPane gplabels;
  
    @FXML
    private Pane active;
    
    @FXML
    private PieChart pie;
    
    @FXML
    private AreaChart<?, ?> line;
    
    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    
    @FXML
    private AnchorPane anchorApp;
    
    private static ScrollPane sp;
    
    boolean[] aux = new boolean[3];
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        aux[0] = true;
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        list.add(new PieChart.Data("Comum", 80));
        list.add(new PieChart.Data("Premium", 20));
        pie.setData(list);
        pie.setLegendVisible(false);
        pie.setLabelsVisible(false);
        
        line.setLegendVisible(false);
        yAxis.setLabel("N.º Teclados");
        yAxis.setTickUnit(100);
                
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("Janeiro",100));
        series.getData().add(new XYChart.Data<>("Fevereiro",200));
        series.getData().add(new XYChart.Data<>("Março",300));
        series.getData().add(new XYChart.Data<>("Abril",200));
        series.getData().add(new XYChart.Data<>("Maio",250));
        series.getData().add(new XYChart.Data<>("Junho",150));
        series.getData().add(new XYChart.Data<>("Julho",50));
        line.getData().add(series);
    }    
    
    
    
    
    
        
}
