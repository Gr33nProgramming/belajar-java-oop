package LayerView;

import Entities.TodoList;
import Repository.TodoListRepository;
import Repository.TodoListRepositoryImpl;
import Service.TodoListService;
import Util.InputUtil;

public class TodoListView {
    private final TodoListService todoListService;
    public TodoListView(TodoListService todoListService){
        this.todoListService = todoListService;
    }
    public void showTodoList(){
        while(true){
            System.out.println("\nTo Do List");
            System.out.println("----------");
            todoListService.showTodoList();
            System.out.println("----------");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            var inputUser = InputUtil.input("Masukkan pilihan anda : ");
            if(inputUser.equalsIgnoreCase("1")){
                addTodoList();
            }else if(inputUser.equalsIgnoreCase("2")){
                removeTodoList();
            }else if(inputUser.equalsIgnoreCase("x")){
                System.out.println("Terima Kasih");
                break;
            }else{
                System.out.println("Masukkan pilihan dengan benar ! ");
            }
        }
    }
    public void addTodoList(){
        System.out.println("\nTambah Task");
        System.out.println("-------------");
        todoListService.showTodoList();
        System.out.println("-------------");
        var inputUser = InputUtil.input("Task Anda (x jika batal): ");
        if(inputUser.equalsIgnoreCase("x")){
            todoListService.showTodoList();
        }else{
            todoListService.addTodoList(inputUser);
            System.out.println("Berhasil menambahkan : " + inputUser);
        }
    }
    public void removeTodoList(){
        todoListService.showTodoList();
        var inputUser = InputUtil.input("Pilih yang ingin anda hapus (x jika batal) : ");
        if(inputUser.equals("x")){
            todoListService.showTodoList();
        }else{
            todoListService.removeTodoList(Integer.valueOf(inputUser));
        }
    }
}
