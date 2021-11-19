package com.example;

import com.example.ApiConfiguration.AuthenticatorConfiguration;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class ApiFactory {
  @Singleton
  public Api api(ApiConfiguration apiConf, AuthenticatorConfiguration authConf) {
    return new Api(apiConf.getUrl(), authConf.getUsername(), authConf.getPassword());
  }
}
