package com.tj.dwback.entity;

import lombok.Data;

/**
 * @author wangyi
 * @version 1.0
 */

@Data
public class Director {
    private int id;
    private int director_group_id;
    private String director_name;

    public Director(int id, int director_group_id, String director_name) {
        this.id = id;
        this.director_group_id = director_group_id;
        this.director_name = director_name;
    }
}
