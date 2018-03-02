package com.thinking_in_java.staticTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new Table");
        new Table();
        System.out.println("Creating new Table");
        new Table();
        table.f2(1);
    }
    static Table table = new Table();

}
class Bowl{
    Bowl(int id){
        System.out.println("Bowl 构造 "+id);
    }
    void f1(int id){
        System.out.println("Bowl f1 "+id);
    }
}
class Table{
    static Bowl bowl1 = new Bowl(1001);
    Table(){
        System.out.println("Table 构造");
        bowl2.f1(1003);
    }
    void f2(int id){
        System.out.println("Table f2 "+id);
    }
    static Bowl bowl2 = new Bowl(1002);
}
