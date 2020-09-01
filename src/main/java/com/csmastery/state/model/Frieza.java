package com.csmastery.state.model;

public class Frieza {

  private boolean alive = true;

  public void makeHimDead() {
    this.alive = false;
  }

  public boolean isAlive() {
    return alive;
  }

}
