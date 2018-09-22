package io.bloco.cardcase.data;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import io.bloco.cardcase.AndroidApplication.Mode;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DatabaseHelper_Factory implements Factory<DatabaseHelper> {
  private final MembersInjector<DatabaseHelper> membersInjector;
  private final Provider<Context> contextProvider;
  private final Provider<Mode> modeProvider;

  public DatabaseHelper_Factory(MembersInjector<DatabaseHelper> membersInjector, Provider<Context> contextProvider, Provider<Mode> modeProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert modeProvider != null;
    this.modeProvider = modeProvider;
  }

  @Override
  public DatabaseHelper get() {  
    DatabaseHelper instance = new DatabaseHelper(contextProvider.get(), modeProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<DatabaseHelper> create(MembersInjector<DatabaseHelper> membersInjector, Provider<Context> contextProvider, Provider<Mode> modeProvider) {  
    return new DatabaseHelper_Factory(membersInjector, contextProvider, modeProvider);
  }
}

