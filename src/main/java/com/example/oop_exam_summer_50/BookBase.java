package com.example.oop_exam_summer_50;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.Setter;
import jakarta.servlet.annotation.WebServlet;

@Getter
@Setter

public class BookBase {


    private int id;
    private String Tag;
    private String studentMail;
    private String reservationDate;
    private String startHour;
    private String durationHour;



}
