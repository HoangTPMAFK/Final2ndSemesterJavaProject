module com.entity.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;
    // requires mysql.connector.java;
    requires java.desktop;
    requires javafx.graphics;
    requires org.apache.commons.codec;

    opens com.entity.demo.View to javafx.fxml;
    exports com.entity.demo.View;
    opens com.entity.demo.Controller to javafx.fxml;
    exports com.entity.demo.Controller;
}