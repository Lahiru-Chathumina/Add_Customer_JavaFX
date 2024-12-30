package Controler;

import Modren.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Sample implements Initializable {

    @FXML
    private TableColumn ColDate;

    @FXML
    private TableColumn ColID;

    @FXML
    private TableColumn ColName;

    @FXML
    private TableColumn ColSalary;

    @FXML
    private TableView TblFrome;

    @FXML
    private DatePicker txtDate;

    @FXML
    private TextField txtID;

    @FXML
    private ComboBox txtMrMiss;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

      List<Customer> CustomerList =new ArrayList<>();

    @FXML
    void BtnAdd(ActionEvent event) {
        String ID = txtID.getText();
        String Name = txtName.getText();
        String items = txtMrMiss.getValue().toString();
        LocalDate Date = txtDate.getValue();
        double Salary = Double.parseDouble(txtSalary.getText());

        System.out.println("Customer ID: " + ID);
        System.out.println("Customer Name: " + Name);
        System.out.println("Customer Salary: " + Salary);
        System.out.println("Customer List Size: " + CustomerList.size());

        Customer customer = new Customer(ID, Name, items, Date, Salary);//Arry list ekak hadanna Object ekak create kala; Customer eke haduwe ewata
        CustomerList.add(customer); ///
        LoardTable();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> txtMrMissList = FXCollections.observableArrayList();
        txtMrMissList.add("Mr");
        txtMrMissList.add("Miss");
        txtMrMissList.add("Mrs");
        txtMrMiss.setItems(txtMrMissList);

    }
    public void LoardTable() {
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList(CustomerList);

        ColID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        ColName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        ColDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
        ColSalary.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        TblFrome.setItems(customerObservableList);
    }


}
