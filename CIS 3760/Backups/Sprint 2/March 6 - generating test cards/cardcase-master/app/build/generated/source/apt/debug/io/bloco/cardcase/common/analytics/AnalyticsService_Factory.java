package io.bloco.cardcase.common.analytics;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum AnalyticsService_Factory implements Factory<AnalyticsService> {
INSTANCE;

  @Override
  public AnalyticsService get() {  
    return new AnalyticsService();
  }

  public static Factory<AnalyticsService> create() {  
    return INSTANCE;
  }
}

