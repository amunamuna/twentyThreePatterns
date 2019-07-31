package com.nadou.patterns.adapterPattern.second;

/**
 * Created by nannan.zhang
 * 对象适配器模式（使用委托的适配器）
 * 继承xx类
 *2019/7/31 9:58
 **/
public class Main {

  public static void main(String[] args) {
    PrintBanner p = new PrintBanner("hello");
    p.printWeak();
    p.printStrong();
//    输出：
//    (hello)
//    *hello*
  }
}
