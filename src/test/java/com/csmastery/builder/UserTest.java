package com.csmastery.builder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserTest {

  @Test
  public void userShouldntExistWithoutEmail() throws Exception {
    assertThatThrownBy(() -> User.builder().build()).hasMessage("Email shouldn't be empty");
  }
  
  @Test
  public void simpleUserWithEmail() throws Exception {
    User user = User.builder()
            .setEmail("peti@gmail.com")
            .build();
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("age", 0);
  }


  @Test
  public void simpleUserWithAgeAndEmail() throws Exception {
    User user = User.builder()
            .setEmail("peti@gmail.com")
            .setAge(33)
            .build();
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("age", 33);
  }

  @Test
  public void simpleUserWithNameAndEmail() throws Exception {
    User user = User.builder()
            .setEmail("peti@gmail.com")
            .setName("Peti")
            .build();
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("name", "Peti");
  }

  @Test
  public void simpleUserWithHeightAndEmail() throws Exception {
    User user = User.builder()
            .setEmail("peti@gmail.com")
            .setHeight(1.93d)
            .build();
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com")
                    .hasFieldOrPropertyWithValue("height", 1.93d);
  }

  @Test
  public void simpleUserWithNameAndAgeAndHeightAndEmail() throws Exception {
    User user = User.builder()
            .setEmail("peti@gmail.com")
            .setName("Peti")
            .setAge(30)
            .setHeight(1.85d)
            .build();
    assertThat(user).hasFieldOrPropertyWithValue("email", "peti@gmail.com").hasFieldOrPropertyWithValue("name", "Peti")
        .hasFieldOrPropertyWithValue("age", 30).hasFieldOrPropertyWithValue("height", 1.85d);
  }


  @Test
  public void resetUserDetails() throws Exception {
    User user = User.builder()
            .setName("Peti")
            .reset()
            .setEmail("peti@gmail.com")
            .build();

    assertThat(user.getName()).isEqualTo(null);
    assertThat(user.getEmail()).isEqualTo("peti@gmail.com");
  }
}