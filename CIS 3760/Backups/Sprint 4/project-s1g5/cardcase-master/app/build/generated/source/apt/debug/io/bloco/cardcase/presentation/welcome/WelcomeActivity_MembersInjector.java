package io.bloco.cardcase.presentation.welcome;

import dagger.MembersInjector;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.presentation.BaseActivity;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class WelcomeActivity_MembersInjector implements MembersInjector<WelcomeActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<AnalyticsService> analyticsServiceProvider;

  public WelcomeActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<AnalyticsService> analyticsServiceProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert analyticsServiceProvider != null;
    this.analyticsServiceProvider = analyticsServiceProvider;
  }

  @Override
  public void injectMembers(WelcomeActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.analyticsService = analyticsServiceProvider.get();
  }

  public static MembersInjector<WelcomeActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<AnalyticsService> analyticsServiceProvider) {  
      return new WelcomeActivity_MembersInjector(supertypeInjector, analyticsServiceProvider);
  }
}

