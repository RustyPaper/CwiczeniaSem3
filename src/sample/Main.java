package sample;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Uruchamianie aplikacji JavaFX.");

        launch(args);
    }

    @Override
    public void init() {
        System.out.println("init()");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start()");
        primaryStage.setTitle("Cwiczenia Java FX 1");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 300);

        primaryStage.setScene(myScene);
        Label response = new Label("Kliknij cos.");
        Button btnAlpha = new Button("Alfa");
        Button btnBeta = new Button("Beta");

        btnAlpha.setOnAction((ae) ->
                response.setText("Kliknieto przycisk Alpha")
        );

        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("Kliknieto przycisk Beta");
            }
        });

        Label response2 = new Label("");
        RadioButton rbOne = new RadioButton("Jeden");
        RadioButton rbTwo = new RadioButton("Dwa");
        RadioButton rbThree = new RadioButton("Trzy");

        ToggleGroup tg = new ToggleGroup();
        rbOne.setToggleGroup(tg);
        rbTwo.setToggleGroup(tg);
        rbThree.setToggleGroup(tg);

        rbOne.setOnAction((ae) ->
                response.setText("Wybrano jeden")
        );
        rbTwo.setOnAction((ae) ->
                response.setText("Wybrano dwa")
        );
        rbThree.setOnAction((ae) ->
                response.setText("Wybrano trzy")
        );


        rootNode.getChildren().addAll(btnAlpha, btnBeta, response, rbOne, rbTwo, rbThree, response2);

        primaryStage.show();
    }

    @Override
    public void stop() {
        System.out.println("stop()");
    }
}