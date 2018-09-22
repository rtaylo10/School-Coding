package io.bloco.cardcase.presentation.exchange;

import dagger.internal.Factory;
import io.bloco.cardcase.domain.GetUserCard;
import io.bloco.cardcase.domain.SaveReceivedCards;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BeamPresenter_Factory implements Factory<BeamPresenter> {
  private final Provider<CardSerializer> cardSerializerProvider;
  private final Provider<GetUserCard> getUserCardProvider;
  private final Provider<SaveReceivedCards> saveReceivedCardsProvider;

  public BeamPresenter_Factory(Provider<CardSerializer> cardSerializerProvider, Provider<GetUserCard> getUserCardProvider, Provider<SaveReceivedCards> saveReceivedCardsProvider) {  
    assert cardSerializerProvider != null;
    this.cardSerializerProvider = cardSerializerProvider;
    assert getUserCardProvider != null;
    this.getUserCardProvider = getUserCardProvider;
    assert saveReceivedCardsProvider != null;
    this.saveReceivedCardsProvider = saveReceivedCardsProvider;
  }

  @Override
  public BeamPresenter get() {  
    return new BeamPresenter(cardSerializerProvider.get(), getUserCardProvider.get(), saveReceivedCardsProvider.get());
  }

  public static Factory<BeamPresenter> create(Provider<CardSerializer> cardSerializerProvider, Provider<GetUserCard> getUserCardProvider, Provider<SaveReceivedCards> saveReceivedCardsProvider) {  
    return new BeamPresenter_Factory(cardSerializerProvider, getUserCardProvider, saveReceivedCardsProvider);
  }
}

