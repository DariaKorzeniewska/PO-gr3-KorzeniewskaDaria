package com.company;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.*;

//zad2
class Students{

    HashMap<String, String> Students = new HashMap<String, String>();

    public void put(String key, String value){
        Students.put(key, value);
    }

    public void remove(String key){
        Students.remove(key);
    }

    public void changeGrade(String key, String value){
        Students.replace(key, value);
    }

    public String toString(){
        TreeMap<String, String> sorted = new TreeMap<>(Students);
        Set<Entry<String, String>> mappings = sorted.entrySet();

        StringBuilder result = new StringBuilder();

        for(Entry<String, String> mapping : mappings){
            result.append(mapping.getKey()).append(" : ").append(mapping.getValue()).append("\n");
        }

        return result.toString();
    }

}

//zad1
class Task implements Comparable<Task> {

    int id;
    String name;

    public Task(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Task t) {
        if(id < t.id)
            return -1;
        else if (id > t.id)
            return 1;
        return 0;
    }

    public String toString(){
        return id + ". " + name;
    }


}


class TaskList{

    PriorityQueue<Task> task_list = new PriorityQueue<>();

    public TaskList() {
        this.task_list = new PriorityQueue<>();
    }

    public void add(Task task){
        task_list.add(task);
    }

    public int size(){
        return task_list.size();
    }

    public void what_now(){
        System.out.println(task_list.peek());
    }

    public void next(){
        task_list.poll();
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        PriorityQueue<Task> temp = new PriorityQueue<Task>(task_list);

        Iterator<Task> it = temp.iterator();
        while(it.hasNext()) {
            result.append(temp.poll()).append("\n");
        }
        return result.toString();
    }


}


public class Main {

    public static void main(String[] args) {

        TaskList my_tasks = new TaskList();

        my_tasks.add(new Task(1, "walk the dog"));
        my_tasks.add(new Task(3, "wash the dishes"));
        my_tasks.add(new Task(2, "do my homework"));
        my_tasks.add(new Task(3, "cook dinner"));
        my_tasks.add(new Task(1, "feed the dog"));

        System.out.println(my_tasks);

        my_tasks.next();
        System.out.println(my_tasks);

        my_tasks.next();
        System.out.println(my_tasks);


        Students students = new Students();

        students.put("Carl", "db+");
        students.put("Joe", "db");
        students.put("Susan", "bdb");
        System.out.println(students);

        students.put("Amy", "db");
        students.put("Jimmy", "bdb");
        System.out.println(students);

        students.remove("Joe");
        students.remove("Jimmy");
        System.out.println(students);

        students.changeGrade("Amy", "bdb");
        students.changeGrade("Carl", "bdb");
        students.changeGrade("Susan", "bdb");
        System.out.println(students);



    }
}
