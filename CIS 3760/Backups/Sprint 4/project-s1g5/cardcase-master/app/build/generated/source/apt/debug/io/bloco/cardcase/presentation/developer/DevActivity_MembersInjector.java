package io.bloco.cardcase.presentation.developer;

import dagger.MembersInjector;
import io.bloco.cardcase.presentation.BaseActivity;
import io.bloco.cardcase.presentation.common.CardAdapter;
import io.bloco.cardcase.presentation.developer.DevContract.Presenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DevActivity_MembersInjector implements MembersInjector<DevActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<Presenter> presenterProvider;
  private final Provider<CardAdapter> cardAdapterProvider;

  public DevActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<CardAdapter> cardAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert cardAdapterProvider != null;
    this.cardAdapterProvider = cardAdapterProvider;
  }

  @Override
  public void injectMembers(DevActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
    instance.cardAdapter = cardAdapterProvider.get();
  }

  public static MembersInjector<DevActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<CardAdapter> cardAdapterProvider) {  
      return new DevActivity_MembersInjector(supertypeInjector, presenterProvider, cardAdapterProvider);
  }
}

