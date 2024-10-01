module org.example.csc311_hw3_groupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_hw3_groupproject to javafx.fxml;
    exports org.example.csc311_hw3_groupproject;
}