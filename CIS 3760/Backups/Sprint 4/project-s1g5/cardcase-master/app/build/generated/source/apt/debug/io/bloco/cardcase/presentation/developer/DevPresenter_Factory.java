package io.bloco.cardcase.presentation.developer;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum DevPresenter_Factory implements Factory<DevPresenter> {
INSTANCE;

  @Override
  public DevPresenter get() {  
    return new DevPresenter();
  }

  public static Factory<DevPresenter> create() {  
    return INSTANCE;
  }
}

