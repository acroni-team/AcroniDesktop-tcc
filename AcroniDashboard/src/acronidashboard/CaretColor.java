/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acronidashboard;

import com.sun.javafx.scene.control.skin.TextFieldSkin;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


/**
 *
 * @author Gustavo Palma
 */
public class CaretColor extends TextFieldSkin {
   public CaretColor(TextField tf)
   {
      super(tf);
      caretPath.setFill(Color.rgb(0, 147, 155));
   }
}
