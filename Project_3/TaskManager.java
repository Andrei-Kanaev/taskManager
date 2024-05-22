package Project_3;

import java.util.Collection;
import java.util.HashMap;

public class TaskManager {

    HashMap<Integer, Task> tasks;
    HashMap<String, Integer> CovertTaskNameToId;
    public TaskManager(){
        this.tasks = new HashMap<>();
        this.CovertTaskNameToId = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.id, task);
        CovertTaskNameToId.put(task.name, task.id);
    }

    public Collection<Task> getAllTasks() {
        return tasks.values();
    }

    public void removeAllTasks() {
        tasks.clear();
        CovertTaskNameToId.clear();
    }

    public Task getTaskById(String name) {
        if (CovertTaskNameToId.containsKey(name)){
            int id = CovertTaskNameToId.get(name);
            return tasks.get(id);
        } else {
            System.out.println("Задачи с таким ID не существует.");
            return null;
        }
    }

    public void removeTaskById(String name){
        if (CovertTaskNameToId.containsKey(name)){
            int id = CovertTaskNameToId.get(name);
            tasks.remove(id);
        } else {
            System.out.println("Задачи с таким ID не существует.");
        }
    }
}
