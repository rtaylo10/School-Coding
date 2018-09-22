package io.bloco.cardcase.presentation.common;

import android.widget.FrameLayout;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CardInfoView_MembersInjector implements MembersInjector<CardInfoView> {
  private final MembersInjector<FrameLayout> supertypeInjector;
  private final Provider<ImageLoader> imageLoaderProvider;

  public CardInfoView_MembersInjector(MembersInjector<FrameLayout> supertypeInjector, Provider<ImageLoader> imageLoaderProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert imageLoaderProvider != null;
    this.imageLoaderProvider = imageLoaderProvider;
  }

  @Override
  public void injectMembers(CardInfoView instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.imageLoader = imageLoaderProvider.get();
  }

  public static MembersInjector<CardInfoView> create(MembersInjector<FrameLayout> supertypeInjector, Provider<ImageLoader> imageLoaderProvider) {  
      return new CardInfoView_MembersInjector(supertypeInjector, imageLoaderProvider);
  }
}

