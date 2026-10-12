package ni.edu.uam.practicahilos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp {

    public static void main(String[] args) {
        Application.launch(Ventana.class, args);
    }

    public static class Ventana extends Application {

        @Override
        public void start(Stage stage) throws Exception {

            FXMLLoader loader = new FXMLLoader(
                    MainApp.class.getResource("procesador-view.fxml")
            );

            Scene scene = new Scene(loader.load());

            stage.setTitle("Práctica - Hilos en JavaFX");
            stage.setScene(scene);
            stage.show();

            ProcesadorController controller =
                    loader.getController();

            stage.setOnCloseRequest(event ->
                    controller.detenerAlCerrar()
            );
        }
    }
}
