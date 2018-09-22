package io.bloco.cardcase.presentation.exchange;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NearbyManager_Factory implements Factory<NearbyManager> {
  private final MembersInjector<NearbyManager> membersInjector;
  private final Provider<Activity> activityProvider;

  public NearbyManager_Factory(MembersInjector<NearbyManager> membersInjector, Provider<Activity> activityProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public NearbyManager get() {  
    NearbyManager instance = new NearbyManager(activityProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<NearbyManager> create(MembersInjector<NearbyManager> membersInjector, Provider<Activity> activityProvider) {  
    return new NearbyManager_Factory(membersInjector, activityProvider);
  }
}

