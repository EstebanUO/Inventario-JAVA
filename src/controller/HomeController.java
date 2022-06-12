package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private MenuItem btnVentas;
    
    @FXML
    private MenuItem btnCliente;
    
    @FXML
    private MenuItem btnProductos;
    
    @FXML
    void ventasBtn (ActionEvent event) throws IOException{
		System.out.println("OEEEEEEEEEEEEEEEEEEEEEEEEEs");
		Parent root = (new FXMLLoader(getClass().getResource("/vista/cliente.fxml"))).load();
		Scene scene = new Scene(root);
        Stage teatro = new Stage();
		teatro.setTitle("Clientes");
        teatro.setScene(scene);
        
        teatro.show();
            
    }
    
   @FXML
    void clientesBtn (ActionEvent event) throws IOException{
	   	System.out.println("Funciona cliente!!");
    	Parent root = (new FXMLLoader(getClass().getResource("/vista/gestion.fxml"))).load();
    	Scene scene = new Scene(root);
        Stage teatro = new Stage();
		teatro.setTitle("Gestion Clientes");
        teatro.setScene(scene);
        
        teatro.show();
    }
   
   @FXML
   void productosBtn(ActionEvent event) throws IOException{
	  	System.out.println("Funciona producto!!");
	   	Parent root = (new FXMLLoader(getClass().getResource("/vista/productos.fxml"))).load();
	   	Scene scene = new Scene(root);
       Stage teatro = new Stage();
		teatro.setTitle("Gestion Clientes");
       teatro.setScene(scene);
       
       teatro.show();
   }
}
