package io.bloco.cardcase.presentation.common;

import android.support.v7.widget.RecyclerView.ViewHolder;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class CardViewHolder_MembersInjector implements MembersInjector<CardViewHolder> {
  private final MembersInjector<ViewHolder> supertypeInjector;
  private final Provider<DateTimeFormat> dateTimeFormatProvider;
  private final Provider<ImageLoader> imageLoaderProvider;

  public CardViewHolder_MembersInjector(MembersInjector<ViewHolder> supertypeInjector, Provider<DateTimeFormat> dateTimeFormatProvider, Provider<ImageLoader> imageLoaderProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert dateTimeFormatProvider != null;
    this.dateTimeFormatProvider = dateTimeFormatProvider;
    assert imageLoaderProvider != null;
    this.imageLoaderProvider = imageLoaderProvider;
  }

  @Override
  public void injectMembers(CardViewHolder instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.dateTimeFormat = dateTimeFormatProvider.get();
    instance.imageLoader = imageLoaderProvider.get();
  }

  public static MembersInjector<CardViewHolder> create(MembersInjector<ViewHolder> supertypeInjector, Provider<DateTimeFormat> dateTimeFormatProvider, Provider<ImageLoader> imageLoaderProvider) {  
      return new CardViewHolder_MembersInjector(supertypeInjector, dateTimeFormatProvider, imageLoaderProvider);
  }
}

