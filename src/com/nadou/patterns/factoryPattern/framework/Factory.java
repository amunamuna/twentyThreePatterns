package com.nadou.patterns.factoryPattern.framework;

/**
 * Created by nannan.zhang
 *2019/7/31 14:49
 **/
public abstract class Factory {

  public final Product create(String owner){
    Product p =createProduct(owner);
    registerProduct(p);
    return p;
  }

  protected abstract Product createProduct(String owner);

  protected abstract void registerProduct(Product product);
}
