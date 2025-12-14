package br.com.manuellakuiawa.todolist.user;

import lombok.Data;

@Data //para getters e setters
public class UserModel {
    private String username; 
    private String name; 
    private String password;
}