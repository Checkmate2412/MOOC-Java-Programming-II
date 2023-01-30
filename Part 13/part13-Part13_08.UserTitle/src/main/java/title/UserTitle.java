package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parameters param = getParameters();
        
        Scene scene = new Scene(new Label(param.getNamed().get("title")));
        stage.setScene(scene);
        stage.show();
    }
}
