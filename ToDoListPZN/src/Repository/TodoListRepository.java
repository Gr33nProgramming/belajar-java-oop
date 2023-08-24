package Repository;

import Entities.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();
    void add(TodoList todoList);
    boolean remove(Integer index);
}
