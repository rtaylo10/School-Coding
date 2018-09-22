package io.bloco.cardcase.presentation.common;

import dagger.MembersInjector;
import dagger.internal.Factory;
import io.bloco.cardcase.presentation.home.CardDetailDialog;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CardAdapter_Factory implements Factory<CardAdapter> {
  private final MembersInjector<CardAdapter> membersInjector;
  private final Provider<CardDetailDialog> cardDetailDialogProvider;

  public CardAdapter_Factory(MembersInjector<CardAdapter> membersInjector, Provider<CardDetailDialog> cardDetailDialogProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert cardDetailDialogProvider != null;
    this.cardDetailDialogProvider = cardDetailDialogProvider;
  }

  @Override
  public CardAdapter get() {  
    CardAdapter instance = new CardAdapter(cardDetailDialogProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<CardAdapter> create(MembersInjector<CardAdapter> membersInjector, Provider<CardDetailDialog> cardDetailDialogProvider) {  
    return new CardAdapter_Factory(membersInjector, cardDetailDialogProvider);
  }
}

