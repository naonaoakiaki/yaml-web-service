package com.example.yamlwebservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by naonaoakiaki on 2017/05/29.
 */
@AllArgsConstructor
@Getter
public enum Gender {
    MALE(1, "male"),
    FEMALE(2, "female");

    private final int code;
    private final String gender;
}