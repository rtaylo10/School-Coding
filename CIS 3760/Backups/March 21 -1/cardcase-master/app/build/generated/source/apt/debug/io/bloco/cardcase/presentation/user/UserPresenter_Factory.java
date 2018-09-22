package io.bloco.cardcase.presentation.user;

import dagger.internal.Factory;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.domain.GetUserCard;
import io.bloco.cardcase.domain.SaveUserCard;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserPresenter_Factory implements Factory<UserPresenter> {
  private final Provider<GetUserCard> getUserCardProvider;
  private final Provider<SaveUserCard> saveUserCardProvider;
  private final Provider<AnalyticsService> analyticsServiceProvider;

  public UserPresenter_Factory(Provider<GetUserCard> getUserCardProvider, Provider<SaveUserCard> saveUserCardProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    assert getUserCardProvider != null;
    this.getUserCardProvider = getUserCardProvider;
    assert saveUserCardProvider != null;
    this.saveUserCardProvider = saveUserCardProvider;
    assert analyticsServiceProvider != null;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public UserPresenter get() {  
    return new UserPresenter(getUserCardProvider.get(), saveUserCardProvider.get(), analyticsServiceProvider.get());
  }

  public static Factory<UserPresenter> create(Provider<GetUserCard> getUserCardProvider, Provider<SaveUserCard> saveUserCardProvider, Provider<AnalyticsService> analyticsServiceProvider) {  
    return new UserPresenter_Factory(getUserCardProvider, saveUserCardProvider, analyticsServiceProvider);
  }
}

