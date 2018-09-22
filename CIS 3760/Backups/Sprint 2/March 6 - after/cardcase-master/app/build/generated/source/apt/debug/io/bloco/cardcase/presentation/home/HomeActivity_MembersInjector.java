package io.bloco.cardcase.presentation.home;

import dagger.MembersInjector;
import io.bloco.cardcase.presentation.BaseActivity;
import io.bloco.cardcase.presentation.common.CardAdapter;
import io.bloco.cardcase.presentation.home.HomeContract.Presenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class HomeActivity_MembersInjector implements MembersInjector<HomeActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<Presenter> presenterProvider;
  private final Provider<CardAdapter> cardAdapterProvider;

  public HomeActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<CardAdapter> cardAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert cardAdapterProvider != null;
    this.cardAdapterProvider = cardAdapterProvider;
  }

  @Override
  public void injectMembers(HomeActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
    instance.cardAdapter = cardAdapterProvider.get();
  }

  public static MembersInjector<HomeActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<CardAdapter> cardAdapterProvider) {  
      return new HomeActivity_MembersInjector(supertypeInjector, presenterProvider, cardAdapterProvider);
  }
}

