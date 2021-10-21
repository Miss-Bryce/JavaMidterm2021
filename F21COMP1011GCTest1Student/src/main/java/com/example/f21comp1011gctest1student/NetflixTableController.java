package com.example.f21comp1011gctest1student;

import Utilties.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class NetflixTableController implements Initializable {

    @FXML
    private TableView<NetflixShow> tableView;

    @FXML
    private TableColumn<NetflixShow, String> showIdCol;

    @FXML
    private TableColumn<NetflixShow, String> typeCol;

    @FXML
    private TableColumn<NetflixShow, String> titleCol;

    @FXML
    private TableColumn<NetflixShow, String> ratingCol;

    @FXML
    private TableColumn<NetflixShow, String> directorCol;

    @FXML
    private TableColumn<NetflixShow, String> castCol;

    @FXML
    private CheckBox movieCheckBox;

    @FXML
    private CheckBox tvCheckBox;

    @FXML
    private ComboBox<String> selectRatingComboBox;

    @FXML
    private Label numOfShowsLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        selectRatingComboBox.getItems().add("All ratings");
        selectRatingComboBox.getItems().add("PG-13");
        selectRatingComboBox.getItems().add("R");
        selectRatingComboBox.getItems().add("TV-14");
        selectRatingComboBox.getItems().add("TV-G");
        selectRatingComboBox.getItems().add("TV-MA");
        selectRatingComboBox.getItems().add("TV-Y");
        selectRatingComboBox.getItems().add("TV-Y7");
        movieCheckBox.isSelected();
        tvCheckBox.isSelected();

        showIdCol.setCellValueFactory(new PropertyValueFactory<>("showID"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        directorCol.setCellValueFactory(new PropertyValueFactory<>("director"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("cast"));

        tableView.getItems().addAll(DBUtility.getNetflixDetails());
    }

    @FXML
    void applyFilter(ActionEvent event)  {

    }
}
