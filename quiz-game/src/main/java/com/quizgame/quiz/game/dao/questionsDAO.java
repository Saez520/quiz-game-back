/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quizgame.quiz.game.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.quizgame.quiz.game.conexion;
import com.quizgame.quiz.game.questions;
import com.quizgame.quiz.game.Util.Constantes.sqlQuestions;

/**
 *
 * @author juan.saez
 */
public class questionsDAO {

    public static void createQuestionsBD(questions questions) {
        conexion dbConnect = new conexion();
        try(Connection conexion = dbConnect.getConection()) {
            
        	PreparedStatement ps = null;
            try {
				ps = conexion.prepareStatement(sqlQuestions.SQLINSERT);
				ps.setString(1, questions.getName_Q());
				ps.setString(2, questions.getUrl_img());
				ps.setString(3, questions.getCategory());
				ps.executeUpdate();
				System.out.println("Pregunta Creada Exitosamente");
				
				
			} catch (SQLException ex) {
				System.out.println(ex);
			}
        	
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void readQuestionsBD() {
    }

    public static void updateQuestionsBD(int Id_Questions) {
    }

    public static void deleteQuestionsBD(questions questions) {
    }

}
