module org.example.csc311_hw3_groupproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.csc311_hw3_groupproject to javafx.fxml;
    exports org.example.csc311_hw3_groupproject;
}