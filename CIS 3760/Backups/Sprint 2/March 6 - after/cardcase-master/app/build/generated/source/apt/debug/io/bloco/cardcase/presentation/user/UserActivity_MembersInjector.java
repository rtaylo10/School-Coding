package io.bloco.cardcase.presentation.user;

import dagger.MembersInjector;
import io.bloco.cardcase.presentation.BaseActivity;
import io.bloco.cardcase.presentation.common.ErrorDisplayer;
import io.bloco.cardcase.presentation.common.ImageLoader;
import io.bloco.cardcase.presentation.user.UserContract.Presenter;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UserActivity_MembersInjector implements MembersInjector<UserActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<Presenter> presenterProvider;
  private final Provider<ImageLoader> imageLoaderProvider;
  private final Provider<AvatarPicker> avatarPickerProvider;
  private final Provider<ErrorDisplayer> errorDisplayerProvider;

  public UserActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<ImageLoader> imageLoaderProvider, Provider<AvatarPicker> avatarPickerProvider, Provider<ErrorDisplayer> errorDisplayerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
    assert imageLoaderProvider != null;
    this.imageLoaderProvider = imageLoaderProvider;
    assert avatarPickerProvider != null;
    this.avatarPickerProvider = avatarPickerProvider;
    assert errorDisplayerProvider != null;
    this.errorDisplayerProvider = errorDisplayerProvider;
  }

  @Override
  public void injectMembers(UserActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.presenter = presenterProvider.get();
    instance.imageLoader = imageLoaderProvider.get();
    instance.avatarPicker = avatarPickerProvider.get();
    instance.errorDisplayer = errorDisplayerProvider.get();
  }

  public static MembersInjector<UserActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<Presenter> presenterProvider, Provider<ImageLoader> imageLoaderProvider, Provider<AvatarPicker> avatarPickerProvider, Provider<ErrorDisplayer> errorDisplayerProvider) {  
      return new UserActivity_MembersInjector(supertypeInjector, presenterProvider, imageLoaderProvider, avatarPickerProvider, errorDisplayerProvider);
  }
}

