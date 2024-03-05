module ru.voshkanov.snake {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.voshkanov.snake to javafx.fxml;
    exports ru.voshkanov.snake;
}