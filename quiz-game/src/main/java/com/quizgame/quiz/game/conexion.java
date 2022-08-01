package com.quizgame.quiz.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    public Connection getConection() {
        Connection Connection;
        Connection = null;
        try {
            Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz-game", "root", "");
            if (Connection != null) {
                System.out.println("Conexion Exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return Connection;
    }
}
