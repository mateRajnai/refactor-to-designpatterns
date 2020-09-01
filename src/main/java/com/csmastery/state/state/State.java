package com.csmastery.state.state;

import com.csmastery.state.model.Frieza;

public interface State {

    State nextState();

    String hairColor();

    int attackValue();

    boolean tryToDestroyFrieza(Frieza frieza);

    TransformationLevel getLevel();
}
