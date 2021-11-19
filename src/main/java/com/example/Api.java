package com.example;

import static java.util.Objects.requireNonNull;

public class Api {
  private final String url;
  private final String username;
  private final String password;

  public Api(String url, String username, String password) {
    requireNonNull(url, "url");
    requireNonNull(username, "username");
    requireNonNull(password, "password");
    this.username = username;
    this.password = password;
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
