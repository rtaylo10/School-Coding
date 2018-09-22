package io.bloco.cardcase.presentation.exchange;

import com.google.gson.Gson;
import dagger.internal.Factory;
import io.bloco.cardcase.presentation.common.FileHelper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CardSerializer_Factory implements Factory<CardSerializer> {
  private final Provider<Gson> gsonProvider;
  private final Provider<FileHelper> fileHelperProvider;

  public CardSerializer_Factory(Provider<Gson> gsonProvider, Provider<FileHelper> fileHelperProvider) {  
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
    assert fileHelperProvider != null;
    this.fileHelperProvider = fileHelperProvider;
  }

  @Override
  public CardSerializer get() {  
    return new CardSerializer(gsonProvider.get(), fileHelperProvider.get());
  }

  public static Factory<CardSerializer> create(Provider<Gson> gsonProvider, Provider<FileHelper> fileHelperProvider) {  
    return new CardSerializer_Factory(gsonProvider, fileHelperProvider);
  }
}

