package com.example.basiccrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/tasks")
public class CrudController {

    @Autowired
    private CrudRepo taskRepository;

    @GetMapping
    public List<CrudEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public CrudEntity createTask(@RequestBody CrudEntity task) {
        return taskRepository.save(task);
    }

    @GetMapping("/{id}")
    public CrudEntity getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public CrudEntity updateTask(@PathVariable Long id, @RequestBody CrudEntity updatedTask) {
        CrudEntity task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}
