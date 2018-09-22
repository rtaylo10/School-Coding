package io.bloco.cardcase.domain;

import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SaveUserCard_Factory implements Factory<SaveUserCard> {
  private final Provider<Database> databaseProvider;

  public SaveUserCard_Factory(Provider<Database> databaseProvider) {  
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SaveUserCard get() {  
    return new SaveUserCard(databaseProvider.get());
  }

  public static Factory<SaveUserCard> create(Provider<Database> databaseProvider) {  
    return new SaveUserCard_Factory(databaseProvider);
  }
}

