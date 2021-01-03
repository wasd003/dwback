package com.tj.dwback.entity;

import lombok.Data;

/**
 * @author wangyi
 * @version 1.0
 */

@Data
public class Type {
    /**
     * Type id
     */
    private int id;
    /**
     * Type 组 id
     */
    private int type_group_id;
    /**
     * Type 的名称
     */
    private String type_name;

    public Type(int id, int type_group_id, String type_name) {
        this.id = id;
        this.type_group_id = type_group_id;
        this.type_name = type_name;
    }
}
