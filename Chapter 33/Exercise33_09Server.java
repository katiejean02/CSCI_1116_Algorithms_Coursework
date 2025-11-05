import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise33_09Server extends Application {
  private TextArea taServer = new TextArea();
  private TextArea taClient = new TextArea();
  DataInputStream clientInput = null;
  DataOutputStream serverOutput = null;
 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taServer.setWrapText(true);
    taClient.setWrapText(true);
    taClient.setDisable(true);

    BorderPane pane1 = new BorderPane();
    pane1.setTop(new Label("History"));
    pane1.setCenter(new ScrollPane(taClient));
    BorderPane pane2 = new BorderPane();
    pane2.setTop(new Label("New Message"));
    pane2.setCenter(new ScrollPane(taServer));
    
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(pane1, pane2);

    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 200, 200);
    primaryStage.setTitle("Exercise31_09Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    // To complete later
    taServer.setOnKeyPressed(e->{
      if (e.getCode() == KeyCode.ENTER) {
        try{
        String toClient = taServer.getText().trim();
        Platform.runLater(()->
        taClient.appendText("S: " + toClient + '\n'));
        serverOutput.writeUTF(toClient);
        taServer.clear();
        }catch(IOException ex){
          ex.printStackTrace();
        }
      }
    });
    new Thread(()->{
      try{
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        clientInput = new DataInputStream(socket.getInputStream());
        serverOutput = new DataOutputStream(socket.getOutputStream());

        while(true){
          //if(clientInput.readUTF() != null){
            String send = clientInput.readUTF().trim();
            Platform.runLater(()->
            taClient.appendText("C: " + send + '\n'));
        //}
          }
      }catch(Exception ex){
        ex.printStackTrace();
      }
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
