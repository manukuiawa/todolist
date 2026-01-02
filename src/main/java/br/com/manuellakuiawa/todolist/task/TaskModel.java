package br.com.manuellakuiawa.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {
    private UUID id; 
    private String description; 
    private String title; 
    private LocalDateTime startAt; //horário de início 
    private LocalDateTime endAt; //horário de fim
    private String priority; 

    private LocalDateTime createdAt;
    
    private UUID idUser; 
    
}
