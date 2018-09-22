package io.bloco.cardcase.domain;

import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DeleteCard_Factory implements Factory<DeleteCard> {
  private final Provider<Database> databaseProvider;

  public DeleteCard_Factory(Provider<Database> databaseProvider) {  
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DeleteCard get() {  
    return new DeleteCard(databaseProvider.get());
  }

  public static Factory<DeleteCard> create(Provider<Database> databaseProvider) {  
    return new DeleteCard_Factory(databaseProvider);
  }
}

