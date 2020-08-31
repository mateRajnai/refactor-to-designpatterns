package com.csmastery.observer;

import lombok.Builder;

@Builder
public class NewsPaperReader implements Subscriber<NewsPaper> {

  private String name;

  @Override
  public void update(NewsPaper newsPaper) {
    System.out.println(newsPaper.getContent());
  }
}