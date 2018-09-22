package io.bloco.cardcase.common.di;

import dagger.internal.Factory;
import io.bloco.cardcase.presentation.developer.DevContract.Presenter;
import io.bloco.cardcase.presentation.developer.DevPresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ActivityModule_ProvideDevPresenterFactory implements Factory<Presenter> {
  private final ActivityModule module;
  private final Provider<DevPresenter> presenterProvider;

  public ActivityModule_ProvideDevPresenterFactory(ActivityModule module, Provider<DevPresenter> presenterProvider) {  
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public Presenter get() {  
    Presenter provided = module.provideDevPresenter(presenterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Presenter> create(ActivityModule module, Provider<DevPresenter> presenterProvider) {  
    return new ActivityModule_ProvideDevPresenterFactory(module, presenterProvider);
  }
}

