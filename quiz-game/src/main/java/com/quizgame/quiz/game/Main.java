/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quizgame.quiz.game;

import java.util.Scanner;

import com.quizgame.quiz.game.service.questionsService;

/**
 *
 * @author juan.saez
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       int opcion=0;
       
       do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear pregunta");
            System.out.println(" 2. leer pregunta");
            System.out.println(" 3. editar pregunta");
            System.out.println(" 4. eliminar pregunta");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    questionsService.createQuestionsBD();
                    break;
                case 2:
                    questionsService.readQuestionsBD();
                    break;
                case 3:
                    questionsService.updateQuestionsBD();
                    break;
                case 4:
                    questionsService.deleteQuestionsBD();
                    break;
                default:
                    break;
            }
           
       }while(opcion != 5);
    }
}
