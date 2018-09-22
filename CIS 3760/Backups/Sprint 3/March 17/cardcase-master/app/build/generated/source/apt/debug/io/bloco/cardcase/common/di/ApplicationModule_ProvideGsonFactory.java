package io.bloco.cardcase.common.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideGsonFactory implements Factory<Gson> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideGsonFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {  
    Gson provided = module.provideGson();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Gson> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideGsonFactory(module);
  }
}

