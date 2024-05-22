package Project_3;

import java.util.*;

public class Epic extends Task{
    HashMap<Integer, Subtask> subtasks;
    HashMap<String, Integer> CovertSubtaskNameToId;

    public Epic(String name, String description) {
        super(name, description);
        this.subtasks = new HashMap<>();
        this.CovertSubtaskNameToId = new HashMap<>();
        this.type = Type.EPIC;
        this.status = Status.NEW;
    }
    public void addSubtask(Subtask subtask) {
        subtasks.put(subtask.id, subtask);
        CovertSubtaskNameToId.put(subtask.name, subtask.id);
    }

    public void removeSubtaskByStatus() {
        ArrayList<Integer> subtasksToRemove = new ArrayList<>();
        for (Map.Entry<Integer, Subtask> entry : subtasks.entrySet()) {
            Subtask subtask = entry.getValue();
            if (subtask.getStatus().equals(Status.DONE)) {
                subtasksToRemove.add(subtask.getId());
            }
        }
        for (int subtask : subtasksToRemove) {
            subtasks.remove(subtask);
        }
    }

    public Collection<Subtask> getAllSubtasks() {
        return subtasks.values();
    }

    public void updateEpicStatus(){

        boolean subtaskDone = true;

        for(Subtask subtask: subtasks.values()){
            if (subtask.getStatus() != Status.DONE){
                subtaskDone = false;
                break;
            }
        }
        if (subtaskDone){
            this.status = Status.DONE;
        }
    }
}
