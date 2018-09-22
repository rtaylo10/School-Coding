package io.bloco.cardcase.presentation.exchange;

import dagger.MembersInjector;
import io.bloco.cardcase.presentation.BaseActivity;
import io.bloco.cardcase.presentation.common.CardAdapter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BeamActivity_MembersInjector implements MembersInjector<BeamActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<CardAdapter> cardAdapterProvider;

  public BeamActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<CardAdapter> cardAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert cardAdapterProvider != null;
    this.cardAdapterProvider = cardAdapterProvider;
  }

  @Override
  public void injectMembers(BeamActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.cardAdapter = cardAdapterProvider.get();
  }

  public static MembersInjector<BeamActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<CardAdapter> cardAdapterProvider) {  
      return new BeamActivity_MembersInjector(supertypeInjector, cardAdapterProvider);
  }
}

