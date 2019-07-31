package com.nadou.patterns.adapterPattern.first;

/**
 * Created by nannan.zhang
 * 类适配器模式（使用继承的适配器）
 * 实现xx接口，继承xx类
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
