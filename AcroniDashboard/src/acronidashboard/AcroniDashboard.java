package acronidashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AcroniDashboard extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //Importa as fontes externas
        Font.loadFont(getClass().getResourceAsStream("/fonts/OpenSansBold.ttf"), 14);
        Font.loadFont(getClass().getResourceAsStream("/fonts/QanelasExtraBold.ttf"), 14);
        //Retira a barra default do Windows
        stage.initStyle(StageStyle.TRANSPARENT);
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
