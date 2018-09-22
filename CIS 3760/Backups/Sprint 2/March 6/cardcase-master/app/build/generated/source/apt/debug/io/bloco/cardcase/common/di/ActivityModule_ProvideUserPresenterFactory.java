package io.bloco.cardcase.common.di;

import dagger.internal.Factory;
import io.bloco.cardcase.presentation.user.UserContract.Presenter;
import io.bloco.cardcase.presentation.user.UserPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ActivityModule_ProvideUserPresenterFactory implements Factory<Presenter> {
  private final ActivityModule module;
  private final Provider<UserPresenter> presenterProvider;

  public ActivityModule_ProvideUserPresenterFactory(ActivityModule module, Provider<UserPresenter> presenterProvider) {  
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public Presenter get() {  
    Presenter provided = module.provideUserPresenter(presenterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Presenter> create(ActivityModule module, Provider<UserPresenter> presenterProvider) {  
    return new ActivityModule_ProvideUserPresenterFactory(module, presenterProvider);
  }
}

