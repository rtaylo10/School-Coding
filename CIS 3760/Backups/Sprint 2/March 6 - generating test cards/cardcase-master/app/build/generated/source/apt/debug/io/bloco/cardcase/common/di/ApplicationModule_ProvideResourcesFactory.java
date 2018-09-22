package io.bloco.cardcase.common.di;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideResourcesFactory implements Factory<Resources> {
  private final ApplicationModule module;
  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideResourcesFactory(ApplicationModule module, Provider<Context> contextProvider) {  
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Resources get() {  
    Resources provided = module.provideResources(contextProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Resources> create(ApplicationModule module, Provider<Context> contextProvider) {  
    return new ApplicationModule_ProvideResourcesFactory(module, contextProvider);
  }
}

