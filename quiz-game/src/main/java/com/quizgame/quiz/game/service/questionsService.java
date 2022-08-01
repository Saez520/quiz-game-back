
package com.quizgame.quiz.game.service;

import java.util.Scanner;

import com.quizgame.quiz.game.questions;
import com.quizgame.quiz.game.dao.questionsDAO;

/**
 *
 * @author juan.saez
 */
public class questionsService {
    public static void createQuestionsBD() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la pregunta");
        String pregunta = sc.nextLine();
        
        System.out.println("Escribe la url de la imagen");
        String url = sc.nextLine();
        
        System.out.println("Escribe la categoria");
        String category = sc.nextLine();
        
        questions newQuestions = new questions();
        newQuestions.setName_Q(pregunta);
        newQuestions.setUrl_img(url);
        newQuestions.setCategory(category);
        questionsDAO.createQuestionsBD(newQuestions);
        
        
    }

    public static void readQuestionsBD() {
    }

    public static void updateQuestionsBD() {
    }

    public static void deleteQuestionsBD() {
    }

}
