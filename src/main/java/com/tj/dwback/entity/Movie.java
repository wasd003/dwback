package com.tj.dwback.entity;

import lombok.Data;

/**
 * @author wangyi
 * @version 1.0
 */

@Data
public class Movie {
    private int movie_id;
    private String movie_name;
    private double rating;
    private int has_positive;
    private int director_group_id;
    private int actor_group_id;
    private int type_group_id;
    private int year;
    private int month;
    private int day;
    private int weekday;
    private String year_month_day;
    private String year_month;
    private String month_day;

    public Movie(int movie_id, String movie_name, double rating, int has_positive, int director_group_id, int actor_group_id, int type_group_id, int year, int month, int day, int weekday, String year_month_day, String year_month, String month_day) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.rating = rating;
        this.has_positive = has_positive;
        this.director_group_id = director_group_id;
        this.actor_group_id = actor_group_id;
        this.type_group_id = type_group_id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.weekday = weekday;
        this.year_month_day = year_month_day;
        this.year_month = year_month;
        this.month_day = month_day;
    }
}
