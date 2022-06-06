package com.abnamro.helper;

import org.junit.Assert;



public class TestData {
  public static String email;
  public static String password;
  public static final String CONTENT_DATA = "Lorem ipsum egestas posuere vivamus neque facilisis augue cursus litora rhoncus aenean aptent eu quis, odio scelerisque curabitur rhoncus sociosqu velit curae ipsum duis porttitor rhoncus amet. consectetur nostra massa molestie sed imperdiet nulla mauris in cras mauris lobortis feugiat, quis sem sagittis tortor diam vehicula habitant primis ultricies platea et. amet aliquet nisi proin volutpat sapien eget, tincidunt nisl neque habitant tellus, mi commodo congue habitasse est. etiam imperdiet quisque sociosqu vivamus ut libero nibh fames, nullam eleifend adipiscing iaculis faucibus nulla dolor varius, curae sollicitudin habitant aliquet nam quis neque.";

  public static void getCredentials(String role) {
    switch (role) {
      case "admin":
        email = "admin@admin.com";
        password = "2020";
        break;
      case "normalUser-Biancunha":
        email = "biancunha@gmail.com";
        password = "123456";
        break;
      case "normalUser-growdev":
        email = "growdev@growdev.com.br";
        password = "growdev123";
        break;
      default:
        Assert.fail("no matching case");
    }
  }

}
