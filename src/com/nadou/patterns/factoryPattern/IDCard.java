package com.nadou.patterns.factoryPattern;

import com.nadou.patterns.factoryPattern.framework.Product;

/**
 * Created by nannan.zhang
 *2019/7/31 14:51
 **/
public class IDCard extends Product{

  private String owner;

  IDCard(String owner){
    System.out.println("制作"+owner+"的ID卡");
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println("使用"+owner+"的ID卡");
  }

  public String getOwner() {
    return owner;
  }
}
