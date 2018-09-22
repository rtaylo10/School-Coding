package io.bloco.cardcase.presentation.home;

import dagger.internal.Factory;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.domain.GetReceivedCards;
import io.bloco.cardcase.domain.GetUserCard;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class HomePresenter_Factory implements Factory<HomePresenter> {
  private final Provider<GetUserCard> getUserCardProvider;
  private final Provider<GetReceivedCards> getReceivedCardsProvider;
  private final Provider<AnalyticsService> analyticsServiceProvider;

  public HomePresenter_Factory(Provider<GetUserCard> getUserCardProvider, Provider<GetReceivedCards> getReceivedCardsProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    assert getUserCardProvider != null;
    this.getUserCardProvider = getUserCardProvider;
    assert getReceivedCardsProvider != null;
    this.getReceivedCardsProvider = getReceivedCardsProvider;
    assert analyticsServiceProvider != null;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public HomePresenter get() {  
    return new HomePresenter(getUserCardProvider.get(), getReceivedCardsProvider.get(), analyticsServiceProvider.get());
  }

  public static Factory<HomePresenter> create(Provider<GetUserCard> getUserCardProvider, Provider<GetReceivedCards> getReceivedCardsProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    return new HomePresenter_Factory(getUserCardProvider, getReceivedCardsProvider, analyticsServiceProvider);
  }
}

