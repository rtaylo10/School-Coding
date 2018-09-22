package io.bloco.cardcase.common.di;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import dagger.internal.Factory;
import io.bloco.cardcase.data.models.Card;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApplicationModule_ProvideCardDaoFactory implements Factory<RuntimeExceptionDao<Card, String>> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideCardDaoFactory(ApplicationModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public RuntimeExceptionDao<Card, String> get() {  
    RuntimeExceptionDao<Card, String> provided = module.provideCardDao();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<RuntimeExceptionDao<Card, String>> create(ApplicationModule module) {  
    return new ApplicationModule_ProvideCardDaoFactory(module);
  }
}

