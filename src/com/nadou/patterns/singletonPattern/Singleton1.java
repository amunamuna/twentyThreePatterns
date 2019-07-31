package com.nadou.patterns.singletonPattern;

/**
 * Created by nannan.zhang
 * 通用方式
 * 是线程安全的
 *2019/7/17 10:29
 **/
public class Singleton1 {

  private static final Singleton1 singleton = new Singleton1();

  //限制产生多个对象
  private Singleton1(){
  }

  //通过该方法获得实例对象
  public static Singleton1 getSingleton(){
    return singleton;
  }

  //类中其他方法，尽量是static
  public static void doSomething(){
  }
}
