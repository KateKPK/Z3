package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;



public class Controller {

    private ObservableList<User> usersData = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<User> Alltable;

    @FXML
    private TableColumn<User, String> columnC1;

    @FXML
    private TableColumn<User, String> columnC2;

    @FXML
    private TableColumn<User, String> columnC3;

    @FXML
    private TableColumn<User, String> columnC4;

    @FXML
    private TableColumn<User, String> columnC5;

    @FXML
    private Button randomButton;

    @FXML
    private Button rezultButton;

    @FXML
    private Label maxLabel;

    @FXML
    private Label minLabel;

    @FXML
    void initialize() {

        String[] arrayC1 = new String[5];
        String[] arrayC2 = new String[5];
        String[] arrayC3 = new String[5];
        String[] arrayC4 = new String[5];
        String[] arrayC5 = new String[5];

        for (int i=0; i<5; i++)
            usersData.add(new User("","","","",""));

// устанавливаем тип и значение которое должно хранится в колонке
        columnC1.setCellValueFactory(new PropertyValueFactory<User, String>("C1"));
        columnC2.setCellValueFactory(new PropertyValueFactory<User, String>("C2"));
        columnC3.setCellValueFactory(new PropertyValueFactory<User, String>("C3"));
        columnC4.setCellValueFactory(new PropertyValueFactory<User, String>("C4"));
        columnC5.setCellValueFactory(new PropertyValueFactory<User, String>("C5"));

        // заполняем таблицу данными
        Alltable.setItems(usersData);


        randomButton.setOnAction(actionEvent -> {

            usersData.clear();


            for (int i=0; i<arrayC1.length; i++)
                arrayC1[i]=Double.toString((int )(Math.random() *24 - 12));

            for (int i=0; i<arrayC1.length; i++)
                arrayC2[i]=Double.toString((int )(Math.random() *24 - 12));

            for (int i=0; i<arrayC1.length; i++)
                arrayC3[i]=Double.toString((int )(Math.random() *24 - 12));

            for (int i=0; i<arrayC1.length; i++)
                arrayC4[i]=Double.toString((int )(Math.random() *24 - 12));

            for (int i=0; i<arrayC1.length; i++)
                arrayC5[i]=Double.toString((int )(Math.random() *24 - 12));

            for (int i=0; i<5; i++)
                usersData.add(new User(arrayC1[i],arrayC2[i],arrayC3[i],arrayC4[i],arrayC5[i]));

        });

        rezultButton.setOnAction(actionEvent -> {
            double max = Double.valueOf(arrayC1[0]);
            double min = Double.valueOf(arrayC1[0]);

            for (int i=1; i<5; i++) {
                if (Double.valueOf(arrayC1[i])>max) {
                    max=Double.valueOf(arrayC1[i]);
                }
                if (Double.valueOf(arrayC1[i])<min) {
                    min=Double.valueOf(arrayC1[i]);
                }
            }


            for (int i=0; i<5; i++) {
                if (Double.valueOf(arrayC2[i])>max) {
                    max=Double.valueOf(arrayC2[i]);
                }
                if (Double.valueOf(arrayC2[i])<min) {
                    min=Double.valueOf(arrayC2[i]);
                }
            }


            for (int i=0; i<5; i++) {
                if (Double.valueOf(arrayC3[i])>max) {
                    max=Double.valueOf(arrayC3[i]);
                }
                if (Double.valueOf(arrayC3[i])<min) {
                    min=Double.valueOf(arrayC3[i]);
                }
            }

            for (int i=0; i<5; i++) {
                if (Double.valueOf(arrayC4[i])>max) {
                    max=Double.valueOf(arrayC4[i]);
                }
                if (Double.valueOf(arrayC4[i])<min) {
                    min=Double.valueOf(arrayC4[i]);
                }
            }

            for (int i=0; i<5; i++) {
                if (Double.valueOf(arrayC5[i])>max) {
                    max=Double.valueOf(arrayC5[i]);
                }
                if (Double.valueOf(arrayC5[i])<min) {
                    min=Double.valueOf(arrayC5[i]);
                }
            }


            maxLabel.setText(Double.toString(max));
            minLabel.setText(Double.toString(min));

            if (max==10*min) {
                usersData.clear();

                for (int i=0; i<arrayC1.length; i++) {
                    if (Double.valueOf(arrayC1[i])==0) {
                        arrayC1[i]=Double.toString(1.0);
                    } else {
                        if (Double.valueOf(arrayC1[i])<0) {
                            arrayC1[i]=Double.toString(Math.abs(Double.valueOf(arrayC1[i])));
                        }
                    }
                }

                for (int i=0; i<arrayC2.length; i++) {
                    if (Double.valueOf(arrayC2[i])==0) {
                        arrayC2[i]=Double.toString(1.0);
                    } else {
                        if (Double.valueOf(arrayC2[i])<0) {
                            arrayC2[i]=Double.toString(Math.abs(Double.valueOf(arrayC2[i])));
                        }
                    }
                }

                for (int i=0; i<arrayC3.length; i++) {
                    if (Double.valueOf(arrayC3[i])==0) {
                        arrayC3[i]=Double.toString(1.0);
                    } else {
                        if (Double.valueOf(arrayC3[i])<0) {
                            arrayC3[i]=Double.toString(Math.abs(Double.valueOf(arrayC3[i])));
                        }
                    }
                }

                for (int i=0; i<arrayC4.length; i++) {
                    if (Double.valueOf(arrayC4[i])==0) {
                        arrayC4[i]=Double.toString(1.0);
                    } else {
                        if (Double.valueOf(arrayC4[i])<0) {
                            arrayC4[i]=Double.toString(Math.abs(Double.valueOf(arrayC4[i])));
                        }
                    }
                }

                for (int i=0; i<arrayC5.length; i++) {
                    if (Double.valueOf(arrayC5[i])==0) {
                        arrayC5[i]=Double.toString(1.0);
                    } else {
                        if (Double.valueOf(arrayC5[i])<0) {
                            arrayC5[i]=Double.toString(Math.abs(Double.valueOf(arrayC5[i])));
                        }
                    }
                }

                for (int i=0; i<5; i++)
                    usersData.add(new User(arrayC1[i],arrayC2[i],arrayC3[i],arrayC4[i],arrayC5[i]));
            }
        });



    }
}

