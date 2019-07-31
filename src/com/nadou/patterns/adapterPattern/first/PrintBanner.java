package com.nadou.patterns.adapterPattern.first;

/**
 * Created by nannan.zhang
 *2019/7/31 9:57
 **/
public class PrintBanner extends Banner implements Print {

  public PrintBanner(String string) {
    super(string);
  }

  @Override
  public void printWeak() {
    showWithParen();
  }

  @Override
  public void printStrong() {
    showWithAster();
  }
}
