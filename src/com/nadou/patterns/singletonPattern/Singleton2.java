package com.nadou.patterns.singletonPattern;

/**
 * Created by nannan.zhang
 *2019/7/17 10:31
 **/
public class Singleton2 {

  private static Singleton2 singleton = null;

  //限制产生多个对象
  private Singleton2(){
  }

  //通过该方法获得实例对象
  //非线程安全
//  public static Singleton2 getSingleton(){
//    if(singleton == null){
//      singleton = new Singleton2();
//    }
//    return singleton;
//  }
  //线程安全的
  public synchronized static Singleton2 getSingleton(){
    if(singleton == null){
      singleton = new Singleton2();
    }
    return singleton;
  }

}
