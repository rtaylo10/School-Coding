package io.bloco.cardcase.presentation.home;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CardDetailDialog_Factory implements Factory<CardDetailDialog> {
  private final Provider<Activity> activityProvider;

  public CardDetailDialog_Factory(Provider<Activity> activityProvider) {  
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public CardDetailDialog get() {  
    return new CardDetailDialog(activityProvider.get());
  }

  public static Factory<CardDetailDialog> create(Provider<Activity> activityProvider) {  
    return new CardDetailDialog_Factory(activityProvider);
  }
}

