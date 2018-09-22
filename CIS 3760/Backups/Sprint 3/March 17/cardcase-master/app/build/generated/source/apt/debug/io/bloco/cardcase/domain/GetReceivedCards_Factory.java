package io.bloco.cardcase.domain;

import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetReceivedCards_Factory implements Factory<GetReceivedCards> {
  private final Provider<Database> databaseProvider;

  public GetReceivedCards_Factory(Provider<Database> databaseProvider) {  
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GetReceivedCards get() {  
    return new GetReceivedCards(databaseProvider.get());
  }

  public static Factory<GetReceivedCards> create(Provider<Database> databaseProvider) {  
    return new GetReceivedCards_Factory(databaseProvider);
  }
}

