package com.in28minutes;


import java.util.ArrayList;


public class ToDoList{

    private static ArrayList<String> list;
    private boolean isEmpty;
    private int size;

//    public static void main(String[] args){
//        list = new ArrayList<>();
//        list.add("hey");
//    }

    public ToDoList(){
        list = new ArrayList<>();
        isEmpty = false;
        size = 0;
    }


    public void listAdd(String add) {
        list.add(add);
        size++;
        System.out.println(add);
    }


    public String remove(String toRemove){
        if(this.isEmpty()){
            return null;
        }
        System.out.println("I thought it was empty");
        int i = 0;
        while(i < this.getSize()){
            if(this.getValueAt(i).equalsIgnoreCase(toRemove)){
                String r = this.getValueAt(i);
                list.set(i, " ");
                return r;
            }else{
                i++;
            }

        }
        return null;

    }

    public boolean isEmpty(){
        return(size == 0);
    }

    public String print(){
        String r = "";
        int i = 0;
        while(i < list.size()){
            r += "\n" + list.get(i++);
        }
        if(this.isEmpty){
            return "";
        }
        return  r;
    }

    public String getValueAt(int slot) {
        String r;
        r = list.get(slot);
        return r;
    }

    public int getSize() {
        return size;
    }
}
