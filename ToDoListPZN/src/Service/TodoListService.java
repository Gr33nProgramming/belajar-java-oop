package Service;

import Entities.TodoList;

public interface TodoListService {
    void showTodoList();
    void addTodoList(String dataTodo);
    void removeTodoList(Integer index);
}
