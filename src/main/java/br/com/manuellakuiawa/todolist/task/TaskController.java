package br.com.manuellakuiawa.todolist.task;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest; 
@RestController
@RequestMapping("/tasks")

public class TaskController {

    @Autowired //spring gerenciar a spring do repositório
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel, HttpServletRequest request)  {
        var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID)idUser);

        //Para não conseguir criar uma tarefa com a data que já passou
        var currentDate = localDateTime.now();

        var task = this.taskRepository.save(taskModel);
        return task; 
    }   
}
