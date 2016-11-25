package vista;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import clase.MainFX;

public class ControlFX {
	/**
	 * Unico controlador de la aplicacion
	 * 
	 * @author Miguel
	 * @version 1.0
	 * 
	 */
		
		//not using yet
		@FXML
		private ImageView imageRaw;

	    // Reference to the main application
	    private MainFX mainFx;

	    /**
	     *Hacemos la llamada al main para poder usarlo
	     * 
	     * @param mainFX
	     */
	    public void setMainFX(MainFX mainFx) {
	        this.setMainFX(mainFx);
	    }

		/**
	     * abrimos la segunda ventana enviando la informacion necesaria
	     */
	    
	    public void showSendProfile() {
	        try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainFX.class.getResource("../formulario.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("formulario");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    /**
	     * Method to handle the ImageView action in the Main stage 
	     */
	    
	    @FXML
	    private void sendStage() {
	    	showSendProfile();
	    }

	    /**
	     * Closes the application when clicked on Exit in the secondary stage
	     */
	    @FXML
	    private void closeStage() {
	   	        System.exit(0);
	    }

		
	
}
