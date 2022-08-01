/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quizgame.quiz.game;

/**
 *
 * @author juan.saez
 */
public class questions {

    private int Id_Questions;
    private String Name_Q;
    private String Url_img;
    private String Category;

    public questions() {
    }

    public questions(String Name_Q, String Url_img, String Category) {
        this.Name_Q = Name_Q;
        this.Url_img = Url_img;
        this.Category = Category;
    }

    public int getId_Questions() {
        return Id_Questions;
    }

    public void setId_Questions(int Id_Questions) {
        this.Id_Questions = Id_Questions;
    }

    public String getName_Q() {
        return Name_Q;
    }

    public void setName_Q(String Name_Q) {
        this.Name_Q = Name_Q;
    }

    public String getUrl_img() {
        return Url_img;
    }

    public void setUrl_img(String Url_img) {
        this.Url_img = Url_img;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

}
