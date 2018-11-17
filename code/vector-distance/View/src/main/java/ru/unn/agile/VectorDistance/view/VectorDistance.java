package ru.unn.agile.VectorDistance.view;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ru.unn.agile.VectorDistance.model.VectorDistance.Distance;
import ru.unn.agile.VectorDistance.viewmodel.ViewModel;

public class VectorDistance {
    @FXML
    private ViewModel viewModel;
    @FXML
    private ComboBox<Distance> cbDistances;
    @FXML
    private TextField txtVectorX;
    @FXML
    private TextField txtVectorY;
    @FXML
    private Button btnCalc;
    @FXML
    private Label lbResult;
    @FXML
    private Label lbStatus;
    @FXML
    void initialize() {
        cbDistances.valueProperty().bindBidirectional(viewModel.distanceProperty());
    }
}