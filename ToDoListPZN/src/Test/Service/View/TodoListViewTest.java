package Test.Service.View;

import LayerView.TodoListView;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Service.TodoListServiceImpl;

public class TodoListViewTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }
    private static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListView.showTodoList();
    }
    private static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListView.addTodoList();
        todoListView.showTodoList();
    }
    private static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Unit Test");
        todoListService.showTodoList();
        todoListView.removeTodoList();
        todoListView.showTodoList();
    }
}
