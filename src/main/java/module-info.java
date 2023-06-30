module com.example.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


 //   opens pack.project.project to javafx.fxml;
  //  exports pack.project.project;
    exports pack.project;
    opens pack.project to javafx.fxml;
}