package com.csmastery.state.model;


import com.csmastery.state.state.TransformationLevel;
import com.csmastery.state.state.FighterState;
import com.csmastery.state.state.State;

public class Goku {

  private State currentState = new FighterState();

  public TransformationLevel powerUp() {
    this.currentState = currentState.nextState();
    return currentState.getLevel();
  }

  public TransformationLevel getCurrentLevel() {
    return this.currentState.getLevel();
  }

  public String hairColor() {
    return this.currentState.hairColor();
  }

  public int attackValue() {
    return this.currentState.attackValue();
  }

  public boolean tryToDestroyFrieza(Frieza frieza) {
    return this.currentState.tryToDestroyFrieza(frieza);
  }

}
