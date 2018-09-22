package io.bloco.cardcase.presentation.common;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DateTimeFormat_Factory implements Factory<DateTimeFormat> {
  private final Provider<Resources> resourcesProvider;

  public DateTimeFormat_Factory(Provider<Resources> resourcesProvider) {  
    assert resourcesProvider != null;
    this.resourcesProvider = resourcesProvider;
  }

  @Override
  public DateTimeFormat get() {  
    return new DateTimeFormat(resourcesProvider.get());
  }

  public static Factory<DateTimeFormat> create(Provider<Resources> resourcesProvider) {  
    return new DateTimeFormat_Factory(resourcesProvider);
  }
}

