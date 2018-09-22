package io.bloco.cardcase.domain;

import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetUserCard_Factory implements Factory<GetUserCard> {
  private final Provider<Database> databaseProvider;

  public GetUserCard_Factory(Provider<Database> databaseProvider) {  
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GetUserCard get() {  
    return new GetUserCard(databaseProvider.get());
  }

  public static Factory<GetUserCard> create(Provider<Database> databaseProvider) {  
    return new GetUserCard_Factory(databaseProvider);
  }
}

