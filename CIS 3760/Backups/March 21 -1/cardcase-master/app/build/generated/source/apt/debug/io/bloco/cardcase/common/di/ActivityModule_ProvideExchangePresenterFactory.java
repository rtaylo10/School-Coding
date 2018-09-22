package io.bloco.cardcase.common.di;

import dagger.internal.Factory;
import io.bloco.cardcase.presentation.exchange.ExchangeContract.Presenter;
import io.bloco.cardcase.presentation.exchange.ExchangePresenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ActivityModule_ProvideExchangePresenterFactory implements Factory<Presenter> {
  private final ActivityModule module;
  private final Provider<ExchangePresenter> presenterProvider;

  public ActivityModule_ProvideExchangePresenterFactory(ActivityModule module, Provider<ExchangePresenter> presenterProvider) {  
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public Presenter get() {  
    Presenter provided = module.provideExchangePresenter(presenterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Presenter> create(ActivityModule module, Provider<ExchangePresenter> presenterProvider) {  
    return new ActivityModule_ProvideExchangePresenterFactory(module, presenterProvider);
  }
}

