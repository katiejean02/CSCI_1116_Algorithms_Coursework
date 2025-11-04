// Exercise31_01Server.java: The server can communicate with
// multiple clients concurrently using the multiple threads
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Exercise33_01Server extends Application {
  // Text area for displaying contents
  private TextArea ta = new TextArea();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    ta.setWrapText(true);
   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 400, 200);
    primaryStage.setTitle("Exercise33_01Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
 
    new Thread(()->{
      try{
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        DataInputStream clientInput = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
       
      while(true){
        double annualInterestRate = clientInput.readDouble(); 
        int numOfYears = clientInput.readInt();
        double loanAmount = clientInput.readDouble();
        Loan loan = new Loan(annualInterestRate, numOfYears, loanAmount);
        Platform.runLater(()->
        ta.appendText("Annual Interest Rate: " + loan.getAnnualInterestRate() + '\n' + "Number of Years: " + 
        loan.getNumberOfYears() + '\n' + "Loan Amount :" + loan.getLoanAmount() + '\n' +
         "Monthly Payment :" + loan.getMonthlyPayment() + '\n' + "Total Payment :" + loan.getTotalPayment() + '\n'));
         
      }
      }catch(IOException ex){
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
