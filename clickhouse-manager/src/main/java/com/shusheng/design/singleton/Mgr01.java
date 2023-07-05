package com.shusheng.design.singleton;

public class Mgr01 {
    private  static final Mgr01 INSTANCE = new Mgr01();
    private Mgr01() {
    }

    public static Mgr01 getInstance(){return INSTANCE;}

    public void mm(){
        System.out.println("mm");
    }

    public static void main(String[] args) {
        Mgr01 instance1 = getInstance();
        Mgr01 instance2 = getInstance();
        System.out.println(instance1 == instance2);
    }
}
