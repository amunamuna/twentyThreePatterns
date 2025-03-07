package com.nadou.patterns.factoryPattern;

import java.util.ArrayList;
import java.util.List;

import com.nadou.patterns.factoryPattern.framework.Factory;
import com.nadou.patterns.factoryPattern.framework.Product;

/**
 * Created by nannan.zhang
 *2019/7/31 14:53
 **/
public class IDCardFactory extends Factory {
  private List owners = new ArrayList();
  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }

  public List getOwners() {
    return owners;
  }
}
