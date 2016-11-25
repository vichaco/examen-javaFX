package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import clase.MainFX;

public class MainFX extends Application{
	
	private Stage primaryStage;
	private AnchorPane profile;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		/**
		 * Open PrimaryStage and selected the margins of the window
		 * 
		 * */
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub profile");
			this.primaryStage.setX(100);
			this.primaryStage.setY(100);

			primaryStage.show();
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * con este metodo inicializamos la aplicacion
	 * */
	public void initRootLayout() {
		
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../Profile.fxml"));
			profile = (AnchorPane) loader.load();
			
			Scene scene = new Scene(profile);
			primaryStage.setScene(scene);
			primaryStage.show();
	   } catch (IOException e) {
         e.printStackTrace();
     }
}

	   /**
	    * Returns the main stage.
	    * @return PrimaryStage
	    */
	   public Stage getPrimaryStage() {
	       return primaryStage;
	   }

	   public static void main(String[] args) {
	   	launch(args);
	   }

}
