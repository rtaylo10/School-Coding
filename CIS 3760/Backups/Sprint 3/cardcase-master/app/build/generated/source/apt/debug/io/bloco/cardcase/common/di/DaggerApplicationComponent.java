package io.bloco.cardcase.common.di;

import android.content.Context;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.common.analytics.AnalyticsService_Factory;
import io.bloco.cardcase.data.Database;
import io.bloco.cardcase.data.Database_Factory;
import io.bloco.cardcase.data.models.Card;
import io.bloco.cardcase.domain.GetReceivedCards;
import io.bloco.cardcase.domain.GetReceivedCards_Factory;
import io.bloco.cardcase.domain.GetUserCard;
import io.bloco.cardcase.domain.GetUserCard_Factory;
import io.bloco.cardcase.domain.SaveReceivedCards;
import io.bloco.cardcase.domain.SaveReceivedCards_Factory;
import io.bloco.cardcase.domain.SaveUserCard;
import io.bloco.cardcase.domain.SaveUserCard_Factory;
import io.bloco.cardcase.presentation.common.Bootstrap;
import io.bloco.cardcase.presentation.common.Bootstrap_Factory;
import io.bloco.cardcase.presentation.common.CardInfoView;
import io.bloco.cardcase.presentation.common.CardInfoView_MembersInjector;
import io.bloco.cardcase.presentation.common.CardViewHolder;
import io.bloco.cardcase.presentation.common.CardViewHolder_MembersInjector;
import io.bloco.cardcase.presentation.common.DateTimeFormat;
import io.bloco.cardcase.presentation.common.DateTimeFormat_Factory;
import io.bloco.cardcase.presentation.common.ErrorDisplayer;
import io.bloco.cardcase.presentation.common.ErrorDisplayer_Factory;
import io.bloco.cardcase.presentation.common.FileHelper;
import io.bloco.cardcase.presentation.common.FileHelper_Factory;
import io.bloco.cardcase.presentation.common.ImageLoader;
import io.bloco.cardcase.presentation.common.ImageLoader_Factory;
import io.bloco.cardcase.presentation.exchange.CardSerializer;
import io.bloco.cardcase.presentation.exchange.CardSerializer_Factory;
import io.bloco.cardcase.presentation.user.AvatarPicker;
import io.bloco.cardcase.presentation.user.AvatarPicker_Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideApplicationContextProvider;
  private Provider<Resources> provideResourcesProvider;
  private Provider<DateTimeFormat> dateTimeFormatProvider;
  private Provider<ImageLoader> imageLoaderProvider;
  private MembersInjector<CardViewHolder> cardViewHolderMembersInjector;
  private MembersInjector<CardInfoView> cardInfoViewMembersInjector;
  private Provider<Gson> provideGsonProvider;
  private Provider<RuntimeExceptionDao<Card, String>> provideCardDaoProvider;
  private Provider<Database> databaseProvider;
  private Provider<FileHelper> fileHelperProvider;
  private Provider<AvatarPicker> avatarPickerProvider;
  private Provider<GetUserCard> getUserCardProvider;
  private Provider<GetReceivedCards> getReceivedCardsProvider;
  private Provider<SaveUserCard> saveUserCardProvider;
  private Provider<SaveReceivedCards> saveReceivedCardsProvider;
  private Provider<CardSerializer> cardSerializerProvider;
  private Provider<AnalyticsService> analyticsServiceProvider;
  private Provider<Bootstrap> bootstrapProvider;
  private Provider<ErrorDisplayer> errorDisplayerProvider;

  private DaggerApplicationComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationContextProvider = ScopedProvider.create(ApplicationModule_ProvideApplicationContextFactory.create(builder.applicationModule));
    this.provideResourcesProvider = ScopedProvider.create(ApplicationModule_ProvideResourcesFactory.create(builder.applicationModule, provideApplicationContextProvider));
    this.dateTimeFormatProvider = ScopedProvider.create(DateTimeFormat_Factory.create(provideResourcesProvider));
    this.imageLoaderProvider = ScopedProvider.create(ImageLoader_Factory.create(provideApplicationContextProvider));
    this.cardViewHolderMembersInjector = CardViewHolder_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), dateTimeFormatProvider, imageLoaderProvider);
    this.cardInfoViewMembersInjector = CardInfoView_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), imageLoaderProvider);
    this.provideGsonProvider = ScopedProvider.create(ApplicationModule_ProvideGsonFactory.create(builder.applicationModule));
    this.provideCardDaoProvider = ScopedProvider.create(ApplicationModule_ProvideCardDaoFactory.create(builder.applicationModule));
    this.databaseProvider = ScopedProvider.create(Database_Factory.create(provideCardDaoProvider));
    this.fileHelperProvider = ScopedProvider.create(FileHelper_Factory.create(provideApplicationContextProvider));
    this.avatarPickerProvider = ScopedProvider.create(AvatarPicker_Factory.create(provideApplicationContextProvider, provideResourcesProvider, fileHelperProvider));
    this.getUserCardProvider = ScopedProvider.create(GetUserCard_Factory.create(databaseProvider));
    this.getReceivedCardsProvider = ScopedProvider.create(GetReceivedCards_Factory.create(databaseProvider));
    this.saveUserCardProvider = ScopedProvider.create(SaveUserCard_Factory.create(databaseProvider));
    this.saveReceivedCardsProvider = ScopedProvider.create(SaveReceivedCards_Factory.create(databaseProvider));
    this.cardSerializerProvider = ScopedProvider.create(CardSerializer_Factory.create(provideGsonProvider, fileHelperProvider));
    this.analyticsServiceProvider = ScopedProvider.create(AnalyticsService_Factory.create());
    this.bootstrapProvider = Bootstrap_Factory.create(provideApplicationContextProvider, databaseProvider, fileHelperProvider);
    this.errorDisplayerProvider = ScopedProvider.create(ErrorDisplayer_Factory.create(provideApplicationContextProvider, provideResourcesProvider));
  }

  @Override
  public void inject(CardViewHolder cardViewHolder) {  
    cardViewHolderMembersInjector.injectMembers(cardViewHolder);
  }

  @Override
  public void inject(CardInfoView cardInfoView) {  
    cardInfoViewMembersInjector.injectMembers(cardInfoView);
  }

  @Override
  public Context context() {  
    return provideApplicationContextProvider.get();
  }

  @Override
  public Resources resources() {  
    return provideResourcesProvider.get();
  }

  @Override
  public Gson gson() {  
    return provideGsonProvider.get();
  }

  @Override
  public Database database() {  
    return databaseProvider.get();
  }

  @Override
  public AvatarPicker avatarPicker() {  
    return avatarPickerProvider.get();
  }

  @Override
  public GetUserCard getUserCard() {  
    return getUserCardProvider.get();
  }

  @Override
  public GetReceivedCards getReceivedCards() {  
    return getReceivedCardsProvider.get();
  }

  @Override
  public SaveUserCard saveUserCard() {  
    return saveUserCardProvider.get();
  }

  @Override
  public SaveReceivedCards saveReceivedCards() {  
    return saveReceivedCardsProvider.get();
  }

  @Override
  public ImageLoader imageLoader() {  
    return imageLoaderProvider.get();
  }

  @Override
  public CardSerializer cardSerializer() {  
    return cardSerializerProvider.get();
  }

  @Override
  public AnalyticsService analyticsService() {  
    return analyticsServiceProvider.get();
  }

  @Override
  public Bootstrap bootstrap() {  
    return bootstrapProvider.get();
  }

  @Override
  public ErrorDisplayer errorDisplayer() {  
    return errorDisplayerProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;
  
    private Builder() {  
    }
  
    public ApplicationComponent build() {  
      if (applicationModule == null) {
        throw new IllegalStateException("applicationModule must be set");
      }
      return new DaggerApplicationComponent(this);
    }
  
    public Builder applicationModule(ApplicationModule applicationModule) {  
      if (applicationModule == null) {
        throw new NullPointerException("applicationModule");
      }
      this.applicationModule = applicationModule;
      return this;
    }
  }
}

