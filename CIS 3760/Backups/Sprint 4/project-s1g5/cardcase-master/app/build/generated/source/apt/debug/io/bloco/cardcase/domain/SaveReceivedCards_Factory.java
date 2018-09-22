package io.bloco.cardcase.domain;

import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SaveReceivedCards_Factory implements Factory<SaveReceivedCards> {
  private final Provider<Database> databaseProvider;

  public SaveReceivedCards_Factory(Provider<Database> databaseProvider) {  
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SaveReceivedCards get() {  
    return new SaveReceivedCards(databaseProvider.get());
  }

  public static Factory<SaveReceivedCards> create(Provider<Database> databaseProvider) {  
    return new SaveReceivedCards_Factory(databaseProvider);
  }
}

