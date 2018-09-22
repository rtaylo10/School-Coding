package io.bloco.cardcase.presentation.common;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ErrorDisplayer_Factory implements Factory<ErrorDisplayer> {
  private final Provider<Context> contextProvider;
  private final Provider<Resources> resourcesProvider;

  public ErrorDisplayer_Factory(Provider<Context> contextProvider, Provider<Resources> resourcesProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert resourcesProvider != null;
    this.resourcesProvider = resourcesProvider;
  }

  @Override
  public ErrorDisplayer get() {  
    return new ErrorDisplayer(contextProvider.get(), resourcesProvider.get());
  }

  public static Factory<ErrorDisplayer> create(Provider<Context> contextProvider, Provider<Resources> resourcesProvider) {  
    return new ErrorDisplayer_Factory(contextProvider, resourcesProvider);
  }
}

