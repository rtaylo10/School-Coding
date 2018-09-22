package io.bloco.cardcase.presentation.user;

import dagger.MembersInjector;
import io.bloco.cardcase.presentation.BaseActivity;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CropAvatarActivity_MembersInjector implements MembersInjector<CropAvatarActivity> {
  private final MembersInjector<BaseActivity> supertypeInjector;
  private final Provider<AvatarPicker> avatarPickerProvider;

  public CropAvatarActivity_MembersInjector(MembersInjector<BaseActivity> supertypeInjector, Provider<AvatarPicker> avatarPickerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert avatarPickerProvider != null;
    this.avatarPickerProvider = avatarPickerProvider;
  }

  @Override
  public void injectMembers(CropAvatarActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.avatarPicker = avatarPickerProvider.get();
  }

  public static MembersInjector<CropAvatarActivity> create(MembersInjector<BaseActivity> supertypeInjector, Provider<AvatarPicker> avatarPickerProvider) {  
      return new CropAvatarActivity_MembersInjector(supertypeInjector, avatarPickerProvider);
  }
}

