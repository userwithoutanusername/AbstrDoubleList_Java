module cz.upce.semestralni_prace_a_kopytin_makar {
    requires javafx.controls;
    requires javafx.fxml;

    exports cz.upce.semestralni_prace_a_kopytin_makar.gui;
    opens cz.upce.semestralni_prace_a_kopytin_makar.gui to javafx.fxml;
}