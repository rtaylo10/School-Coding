package io.bloco.cardcase.common.di;

import dagger.internal.Factory;
import io.bloco.cardcase.presentation.home.HomeContract.Presenter;
import io.bloco.cardcase.presentation.home.HomePresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ActivityModule_ProvideHomePresenterFactory implements Factory<Presenter> {
  private final ActivityModule module;
  private final Provider<HomePresenter> presenterProvider;

  public ActivityModule_ProvideHomePresenterFactory(ActivityModule module, Provider<HomePresenter> presenterProvider) {  
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public Presenter get() {  
    Presenter provided = module.provideHomePresenter(presenterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Presenter> create(ActivityModule module, Provider<HomePresenter> presenterProvider) {  
    return new ActivityModule_ProvideHomePresenterFactory(module, presenterProvider);
  }
}

