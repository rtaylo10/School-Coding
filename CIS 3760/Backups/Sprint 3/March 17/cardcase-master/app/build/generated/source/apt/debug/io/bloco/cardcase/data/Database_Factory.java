package io.bloco.cardcase.data;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import dagger.internal.Factory;
import io.bloco.cardcase.data.models.Card;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Database_Factory implements Factory<Database> {
  private final Provider<RuntimeExceptionDao<Card, String>> cardDaoProvider;

  public Database_Factory(Provider<RuntimeExceptionDao<Card, String>> cardDaoProvider) {  
    assert cardDaoProvider != null;
    this.cardDaoProvider = cardDaoProvider;
  }

  @Override
  public Database get() {  
    return new Database(cardDaoProvider.get());
  }

  public static Factory<Database> create(Provider<RuntimeExceptionDao<Card, String>> cardDaoProvider) {  
    return new Database_Factory(cardDaoProvider);
  }
}

