package com.nadou.patterns.factoryPattern;

import com.nadou.patterns.factoryPattern.framework.Product;

/**
 * Created by nannan.zhang
 *2019/7/31 14:55
 **/
public class Main {
  public static void main(String[] args) {
    IDCardFactory factory = new IDCardFactory();
    Product card1 = factory.create("小明");
    Product card2 = factory.create("小红");
    Product card3 = factory.create("小刚");
    card1.use();
    card2.use();
    card3.use();
  }
}
