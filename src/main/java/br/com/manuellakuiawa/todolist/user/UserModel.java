package br.com.manuellakuiawa.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //para getters e setters

//Criação tabela do banco de dados
@Entity(name="tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id; //chave primária

    private String username; 
    private String name; 
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;
}