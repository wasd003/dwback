package com.tj.dwback.entity;

import lombok.Data;

/**
 * @author wangyi
 * @version 1.0
 */

@Data
public class Actor {
    private int id;
    private int actor_group_id;
    private String actor_name;

    public Actor(int id, int actor_group_id, String actor_name) {
        this.id = id;
        this.actor_group_id = actor_group_id;
        this.actor_name = actor_name;
    }
}
