package io.bloco.cardcase.presentation.common;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ImageLoader_Factory implements Factory<ImageLoader> {
  private final Provider<Context> contextProvider;

  public ImageLoader_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ImageLoader get() {  
    return new ImageLoader(contextProvider.get());
  }

  public static Factory<ImageLoader> create(Provider<Context> contextProvider) {  
    return new ImageLoader_Factory(contextProvider);
  }
}

