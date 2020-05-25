// package cards;
// Importing the necessary standard class for file handling, array,exception, java vfx, input/output and other required classes
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
// Starting Cards class with extending Application class
public class Cards extends Application {
    // Overridding default start function including FileNotFoundException class
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        // creating random_card array of size 6(0-5) to store card
        int random_card[] = new int[6];
        // creating cardPath array of size 6(0-5) to store path of card
        String cardPath[] = new String[6];
        // Declaring six images to be used
        Image img1,img2,img3,img4,img5,img6,img7;
        // Looping to six times to select the random card
        for(int i =0;i<6;i++){
            // getting random card from 52 cases
            random_card[i] = (int)(Math.random() * (52 - 1 + 1) + 1);
            cardPath[i]="imageCards\\"+random_card[i]+".png";            
        }
        // getting the joker card from the file
        String jokerCardPath="imageCards\\"+53+".png";        
        // Setting the card path in Image class object for six random card and a joker
        img1 = new Image(new FileInputStream(cardPath[0]));
        img2 = new Image(new FileInputStream(cardPath[1]));
        img3 = new Image(new FileInputStream(cardPath[2]));
        img4 = new Image(new FileInputStream(cardPath[3]));
        img5 = new Image(new FileInputStream(cardPath[4]));
        img6 = new Image(new FileInputStream(cardPath[5]));
        img7 = new Image(new FileInputStream(jokerCardPath));
        // Initilizing ImageView to view the cards
        ImageView card1,card2,card3,card4,card5,card6,card7,card8,card9;
        // Creating VBox class object as col object
        VBox col = new VBox();
        // positioning in CENTER
        col.setAlignment(Pos.CENTER);
        // spacing with 25
        col.setSpacing(25);
        
        // Creating HBox class object as row1 object
        HBox row1= new HBox();
        // positioning in TOP CENTER
        row1.setAlignment(Pos.TOP_CENTER);
        // spacing with 45
        row1.setSpacing(45);
        // Creating HBox class object as row1 object
        HBox row2= new HBox();
        // positioning in CENTER
        row2.setAlignment(Pos.CENTER);
        // spacing with 45
        row2.setSpacing(45);
        // Creating HBox class object as row1 object
        HBox row3= new HBox();
        // positioning in BOTTOM CENTER
        row3.setAlignment(Pos.BOTTOM_CENTER);
        // spacing with 45
        row3.setSpacing(45);
        // Setting image view for the images
        card1 = new ImageView(img1);       
        card2 = new ImageView(img2);
        card3 = new ImageView(img3);
        card4 = new ImageView(img4);
        // rotation of 135 degrees
        card4.setRotate(135);
        card5 = new ImageView(img5);
        // rotation of 90 degrees
        card5.setRotate(90);
        card6 = new ImageView(img6);
        // rotation of 45 degrees
        card6.setRotate(45);
        card7 = new ImageView(img7);
        // rotation of 45 degrees
        card7.setRotate(45);
        card8 = new ImageView(img7);
        // rotation of 90 degrees
        card8.setRotate(90);
        card9 = new ImageView(img7);
        // rotation of 135 degrees
        card9.setRotate(135);
        // Adding three cards to each row
        row1.getChildren().addAll(card1,card2,card3);
        row2.getChildren().addAll(card7,card8,card9);
        row3.getChildren().addAll(card4,card5,card6);
        // Adding column of card rows
        col.getChildren().addAll(row1,row2,row3);
        // Creating scene object of Scene Class 
        Scene scene = new Scene(col, 450, 450);
        // Setting the title of cards
        primaryStage.setTitle("Card game");
        // setting the scene
        primaryStage.setScene(scene);
        // displaying the scene
        primaryStage.show();
    }
    public static void main(String[] args) {
        // launching the program
        launch(args);
    }
    
}
