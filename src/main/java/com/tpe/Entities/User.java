package com.tpe.Entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public abstract class User {

    private String name;
    private String lastName;
    private String userName;
    private String passWord;

    public abstract void showUser();
}
