package io.bloco.cardcase.presentation.common;

import android.content.Context;
import dagger.internal.Factory;
import io.bloco.cardcase.data.Database;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Bootstrap_Factory implements Factory<Bootstrap> {
  private final Provider<Context> contextProvider;
  private final Provider<Database> databaseProvider;
  private final Provider<FileHelper> fileHelperProvider;

  public Bootstrap_Factory(Provider<Context> contextProvider, Provider<Database> databaseProvider, Provider<FileHelper> fileHelperProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert databaseProvider != null;
    this.databaseProvider = databaseProvider;
    assert fileHelperProvider != null;
    this.fileHelperProvider = fileHelperProvider;
  }

  @Override
  public Bootstrap get() {  
    return new Bootstrap(contextProvider.get(), databaseProvider.get(), fileHelperProvider.get());
  }

  public static Factory<Bootstrap> create(Provider<Context> contextProvider, Provider<Database> databaseProvider, Provider<FileHelper> fileHelperProvider) {  
    return new Bootstrap_Factory(contextProvider, databaseProvider, fileHelperProvider);
  }
}

