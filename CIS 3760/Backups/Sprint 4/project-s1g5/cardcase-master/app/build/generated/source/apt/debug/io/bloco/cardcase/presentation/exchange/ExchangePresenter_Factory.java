package io.bloco.cardcase.presentation.exchange;

import dagger.internal.Factory;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.domain.GetUserCard;
import io.bloco.cardcase.domain.SaveReceivedCards;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ExchangePresenter_Factory implements Factory<ExchangePresenter> {
  private final Provider<NearbyManager> nearbyManagerProvider;
  private final Provider<CardSerializer> cardSerializerProvider;
  private final Provider<GetUserCard> getUserCardProvider;
  private final Provider<SaveReceivedCards> saveReceivedCardsProvider;
  private final Provider<AnalyticsService> analyticsServiceProvider;

  public ExchangePresenter_Factory(Provider<NearbyManager> nearbyManagerProvider, Provider<CardSerializer> cardSerializerProvider, Provider<GetUserCard> getUserCardProvider, Provider<SaveReceivedCards> saveReceivedCardsProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    assert nearbyManagerProvider != null;
    this.nearbyManagerProvider = nearbyManagerProvider;
    assert cardSerializerProvider != null;
    this.cardSerializerProvider = cardSerializerProvider;
    assert getUserCardProvider != null;
    this.getUserCardProvider = getUserCardProvider;
    assert saveReceivedCardsProvider != null;
    this.saveReceivedCardsProvider = saveReceivedCardsProvider;
    assert analyticsServiceProvider != null;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public ExchangePresenter get() {  
    return new ExchangePresenter(nearbyManagerProvider.get(), cardSerializerProvider.get(), getUserCardProvider.get(), saveReceivedCardsProvider.get(), analyticsServiceProvider.get());
  }

  public static Factory<ExchangePresenter> create(Provider<NearbyManager> nearbyManagerProvider, Provider<CardSerializer> cardSerializerProvider, Provider<GetUserCard> getUserCardProvider, Provider<SaveReceivedCards> saveReceivedCardsProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    return new ExchangePresenter_Factory(nearbyManagerProvider, cardSerializerProvider, getUserCardProvider, saveReceivedCardsProvider, analyticsServiceProvider);
  }
}

