package io.bloco.cardcase.presentation.common;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FileHelper_Factory implements Factory<FileHelper> {
  private final Provider<Context> contextProvider;

  public FileHelper_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public FileHelper get() {  
    return new FileHelper(contextProvider.get());
  }

  public static Factory<FileHelper> create(Provider<Context> contextProvider) {  
    return new FileHelper_Factory(contextProvider);
  }
}

