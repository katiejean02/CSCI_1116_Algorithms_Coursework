import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class LoanCalculator extends Application{
    private TextField tfinvestAmount = new TextField();
    private TextField tfNumofYears = new TextField();
    private TextField tfAnnualInterest = new TextField();
    private TextField tfFutureValue = new TextField();

    @Override
    public void start(Stage primaryStage){
            Pane pane = new Pane();
            MenuBar menubar = new MenuBar();
            Menu menuOperation = new Menu("Operation");
            Menu menuCalculate = new Menu("Calculate");
            Menu menuExit = new Menu("Exit");
            menuOperation.getItems().addAll(menuExit,menuCalculate);
            menubar.getMenus().add(menuOperation);
            
            HBox hbox =  new HBox();
            HBox hbox1 =  new HBox();
            HBox hbox2 = new HBox();
            HBox hbox3 = new HBox();
            VBox vbox = new VBox(4);
            VBox vbox1 =  new VBox(4);
            Button btCalculate = new Button("Calculate"); 
            tfinvestAmount.setMaxWidth(Double.MAX_VALUE);
            tfNumofYears.setMaxWidth(Double.MAX_VALUE);
            tfAnnualInterest.setMaxWidth(Double.MAX_VALUE);
            tfFutureValue.setMaxWidth(Double.MAX_VALUE);
            hbox.getChildren().addAll(new Label("Investment Amount:"),tfinvestAmount);
            hbox1.getChildren().addAll(new Label("Number of Years:"),tfNumofYears);
            hbox2.getChildren().addAll(new Label("Annual Interest Rate:"),tfAnnualInterest);
            hbox3.getChildren().addAll(new Label("Future Value:"),tfFutureValue);
            pane.getChildren().addAll(menubar);
            btCalculate.setAlignment(Pos.BOTTOM_RIGHT);
            vbox.getChildren().addAll(pane,hbox,hbox1,hbox2,hbox3,btCalculate);
           
            Scene scene = new Scene(vbox,300,200);
            primaryStage.setTitle("Loan Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            btCalculate.setOnAction(e ->
                calculate());
            menuCalculate.setOnAction(e ->
                calculate());
            menuExit.setOnAction(e ->
                System.exit(0));

    }
    public double calculate(){
        double investmentAmount = Double.parseDouble(tfinvestAmount.getText());
        double monthlyInterestRate = Double.parseDouble(tfAnnualInterest.getText())/ 100 / 12;
        double years = Double.parseDouble(tfNumofYears.getText());
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        DecimalFormat df = new DecimalFormat("#.00");
        String answer = df.format(futureValue);
        tfFutureValue.setText(answer);
        return futureValue;
        
    }
    public static void main(String[] args){
        launch(args);
    }
}
