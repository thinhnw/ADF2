package asm1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    @FXML
    private TextField nameInput;

    @FXML
    private TextField ageInput;

    @FXML
    private TextField markInput;

    @FXML
    private Button submitBtn;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableColumn<Student, Integer> ageColumn;

    @FXML
    private TableColumn<Student, Integer> markColumn;


    public Controller() {
    }

    @FXML
    private void initialize() {
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                input();
            }
        });

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        markColumn.setCellValueFactory(new PropertyValueFactory<>("mark"));
    }

    private void input() {
        try {
            String name = nameInput.getText();
            Integer age = Integer.parseInt(ageInput.getText());
            Integer mark = Integer.parseInt(markInput.getText());
            System.out.println(name + " " + age + " " + mark);
            studentTable.getItems().add(new Student(name, age, mark));
        } catch (Exception e) {

        }
    }
}
