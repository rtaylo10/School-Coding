package io.bloco.cardcase.presentation.user;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import io.bloco.cardcase.presentation.common.FileHelper;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AvatarPicker_Factory implements Factory<AvatarPicker> {
  private final Provider<Context> contextProvider;
  private final Provider<Resources> resourcesProvider;
  private final Provider<FileHelper> fileHelperProvider;

  public AvatarPicker_Factory(Provider<Context> contextProvider, Provider<Resources> resourcesProvider, Provider<FileHelper> fileHelperProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert resourcesProvider != null;
    this.resourcesProvider = resourcesProvider;
    assert fileHelperProvider != null;
    this.fileHelperProvider = fileHelperProvider;
  }

  @Override
  public AvatarPicker get() {  
    return new AvatarPicker(contextProvider.get(), resourcesProvider.get(), fileHelperProvider.get());
  }

  public static Factory<AvatarPicker> create(Provider<Context> contextProvider, Provider<Resources> resourcesProvider, Provider<FileHelper> fileHelperProvider) {  
    return new AvatarPicker_Factory(contextProvider, resourcesProvider, fileHelperProvider);
  }
}

