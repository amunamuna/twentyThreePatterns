package com.nadou.patterns.adapterPattern.second;

/**
 * Created by nannan.zhang
 *2019/7/31 10:10
 **/
public class PrintBanner extends Print {

  private Banner banner;

  public PrintBanner(String string){
    this.banner = new Banner(string);
  }
  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
