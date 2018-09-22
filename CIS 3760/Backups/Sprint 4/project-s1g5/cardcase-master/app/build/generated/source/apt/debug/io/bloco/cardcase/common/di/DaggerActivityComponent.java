package io.bloco.cardcase.common.di;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import io.bloco.cardcase.common.analytics.AnalyticsService;
import io.bloco.cardcase.data.Database;
import io.bloco.cardcase.domain.DeleteCard;
import io.bloco.cardcase.domain.DeleteCard_Factory;
import io.bloco.cardcase.domain.GetReceivedCards;
import io.bloco.cardcase.domain.GetUserCard;
import io.bloco.cardcase.domain.SaveReceivedCards;
import io.bloco.cardcase.domain.SaveUserCard;
import io.bloco.cardcase.presentation.common.CardAdapter;
import io.bloco.cardcase.presentation.common.CardAdapter_Factory;
import io.bloco.cardcase.presentation.common.ErrorDisplayer;
import io.bloco.cardcase.presentation.common.ImageLoader;
import io.bloco.cardcase.presentation.developer.DevActivity;
import io.bloco.cardcase.presentation.developer.DevActivity_MembersInjector;
import io.bloco.cardcase.presentation.developer.DevContract.Presenter;
import io.bloco.cardcase.presentation.developer.DevPresenter;
import io.bloco.cardcase.presentation.developer.DevPresenter_Factory;
import io.bloco.cardcase.presentation.exchange.BeamActivity;
import io.bloco.cardcase.presentation.exchange.BeamActivity_MembersInjector;
import io.bloco.cardcase.presentation.exchange.CardSerializer;
import io.bloco.cardcase.presentation.exchange.ExchangeActivity;
import io.bloco.cardcase.presentation.exchange.ExchangeActivity_MembersInjector;
import io.bloco.cardcase.presentation.exchange.ExchangeContract;
import io.bloco.cardcase.presentation.exchange.ExchangePresenter;
import io.bloco.cardcase.presentation.exchange.ExchangePresenter_Factory;
import io.bloco.cardcase.presentation.exchange.NearbyManager;
import io.bloco.cardcase.presentation.exchange.NearbyManager_Factory;
import io.bloco.cardcase.presentation.home.CardDetailDialog;
import io.bloco.cardcase.presentation.home.CardDetailDialog_Factory;
import io.bloco.cardcase.presentation.home.HomeActivity;
import io.bloco.cardcase.presentation.home.HomeActivity_MembersInjector;
import io.bloco.cardcase.presentation.home.HomeContract;
import io.bloco.cardcase.presentation.home.HomePresenter;
import io.bloco.cardcase.presentation.home.HomePresenter_Factory;
import io.bloco.cardcase.presentation.user.AvatarPicker;
import io.bloco.cardcase.presentation.user.CropAvatarActivity;
import io.bloco.cardcase.presentation.user.CropAvatarActivity_MembersInjector;
import io.bloco.cardcase.presentation.user.UserActivity;
import io.bloco.cardcase.presentation.user.UserActivity_MembersInjector;
import io.bloco.cardcase.presentation.user.UserContract;
import io.bloco.cardcase.presentation.user.UserPresenter;
import io.bloco.cardcase.presentation.user.UserPresenter_Factory;
import io.bloco.cardcase.presentation.welcome.WelcomeActivity;
import io.bloco.cardcase.presentation.welcome.WelcomeActivity_MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<AvatarPicker> avatarPickerProvider;
  private MembersInjector<CropAvatarActivity> cropAvatarActivityMembersInjector;
  private Provider<GetUserCard> getUserCardProvider;
  private Provider<GetReceivedCards> getReceivedCardsProvider;
  private Provider<Database> databaseProvider;
  private Provider<DeleteCard> deleteCardProvider;
  private Provider<SaveReceivedCards> saveReceivedCardsProvider;
  private Provider<AnalyticsService> analyticsServiceProvider;
  private Provider<HomePresenter> homePresenterProvider;
  private Provider<HomeContract.Presenter> provideHomePresenterProvider;
  private Provider<Activity> activityProvider;
  private Provider<CardDetailDialog> cardDetailDialogProvider;
  private Provider<CardAdapter> cardAdapterProvider;
  private MembersInjector<HomeActivity> homeActivityMembersInjector;
  private Provider<SaveUserCard> saveUserCardProvider;
  private Provider<UserPresenter> userPresenterProvider;
  private Provider<UserContract.Presenter> provideUserPresenterProvider;
  private Provider<ImageLoader> imageLoaderProvider;
  private Provider<ErrorDisplayer> errorDisplayerProvider;
  private MembersInjector<UserActivity> userActivityMembersInjector;
  private Provider<NearbyManager> nearbyManagerProvider;
  private Provider<CardSerializer> cardSerializerProvider;
  private Provider<ExchangePresenter> exchangePresenterProvider;
  private Provider<ExchangeContract.Presenter> provideExchangePresenterProvider;
  private MembersInjector<ExchangeActivity> exchangeActivityMembersInjector;
  private MembersInjector<BeamActivity> beamActivityMembersInjector;
  private MembersInjector<WelcomeActivity> welcomeActivityMembersInjector;
  private Provider<DevPresenter> devPresenterProvider;
  private Provider<Presenter> provideDevPresenterProvider;
  private MembersInjector<DevActivity> devActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.avatarPickerProvider = new Factory<AvatarPicker>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public AvatarPicker get() {
        AvatarPicker provided = applicationComponent.avatarPicker();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.cropAvatarActivityMembersInjector = CropAvatarActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), avatarPickerProvider);
    this.getUserCardProvider = new Factory<GetUserCard>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public GetUserCard get() {
        GetUserCard provided = applicationComponent.getUserCard();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.getReceivedCardsProvider = new Factory<GetReceivedCards>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public GetReceivedCards get() {
        GetReceivedCards provided = applicationComponent.getReceivedCards();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.databaseProvider = new Factory<Database>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public Database get() {
        Database provided = applicationComponent.database();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.deleteCardProvider = DeleteCard_Factory.create(databaseProvider);
    this.saveReceivedCardsProvider = new Factory<SaveReceivedCards>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public SaveReceivedCards get() {
        SaveReceivedCards provided = applicationComponent.saveReceivedCards();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.analyticsServiceProvider = new Factory<AnalyticsService>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public AnalyticsService get() {
        AnalyticsService provided = applicationComponent.analyticsService();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.homePresenterProvider = ScopedProvider.create(HomePresenter_Factory.create(getUserCardProvider, getReceivedCardsProvider, deleteCardProvider, saveReceivedCardsProvider, analyticsServiceProvider));
    this.provideHomePresenterProvider = ScopedProvider.create(ActivityModule_ProvideHomePresenterFactory.create(builder.activityModule, homePresenterProvider));
    this.activityProvider = ScopedProvider.create(ActivityModule_ActivityFactory.create(builder.activityModule));
    this.cardDetailDialogProvider = ScopedProvider.create(CardDetailDialog_Factory.create(activityProvider));
    this.cardAdapterProvider = ScopedProvider.create(CardAdapter_Factory.create((MembersInjector) MembersInjectors.noOp(), cardDetailDialogProvider));
    this.homeActivityMembersInjector = HomeActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideHomePresenterProvider, cardAdapterProvider);
    this.saveUserCardProvider = new Factory<SaveUserCard>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public SaveUserCard get() {
        SaveUserCard provided = applicationComponent.saveUserCard();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.userPresenterProvider = ScopedProvider.create(UserPresenter_Factory.create(getUserCardProvider, saveUserCardProvider, analyticsServiceProvider));
    this.provideUserPresenterProvider = ScopedProvider.create(ActivityModule_ProvideUserPresenterFactory.create(builder.activityModule, userPresenterProvider));
    this.imageLoaderProvider = new Factory<ImageLoader>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ImageLoader get() {
        ImageLoader provided = applicationComponent.imageLoader();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.errorDisplayerProvider = new Factory<ErrorDisplayer>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public ErrorDisplayer get() {
        ErrorDisplayer provided = applicationComponent.errorDisplayer();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.userActivityMembersInjector = UserActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideUserPresenterProvider, imageLoaderProvider, avatarPickerProvider, errorDisplayerProvider);
    this.nearbyManagerProvider = ScopedProvider.create(NearbyManager_Factory.create((MembersInjector) MembersInjectors.noOp(), activityProvider));
    this.cardSerializerProvider = new Factory<CardSerializer>() {
      private final ApplicationComponent applicationComponent = builder.applicationComponent;
      @Override public CardSerializer get() {
        CardSerializer provided = applicationComponent.cardSerializer();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.exchangePresenterProvider = ScopedProvider.create(ExchangePresenter_Factory.create(nearbyManagerProvider, cardSerializerProvider, getUserCardProvider, saveReceivedCardsProvider, analyticsServiceProvider));
    this.provideExchangePresenterProvider = ScopedProvider.create(ActivityModule_ProvideExchangePresenterFactory.create(builder.activityModule, exchangePresenterProvider));
    this.exchangeActivityMembersInjector = ExchangeActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideExchangePresenterProvider, cardAdapterProvider);
    this.beamActivityMembersInjector = BeamActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), cardAdapterProvider);
    this.welcomeActivityMembersInjector = WelcomeActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), analyticsServiceProvider);
    this.devPresenterProvider = ScopedProvider.create(DevPresenter_Factory.create());
    this.provideDevPresenterProvider = ScopedProvider.create(ActivityModule_ProvideDevPresenterFactory.create(builder.activityModule, devPresenterProvider));
    this.devActivityMembersInjector = DevActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideDevPresenterProvider, cardAdapterProvider);
  }

  @Override
  public void inject(CropAvatarActivity cropAvatarActivity) {  
    cropAvatarActivityMembersInjector.injectMembers(cropAvatarActivity);
  }

  @Override
  public void inject(HomeActivity activity) {  
    homeActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(UserActivity activity) {  
    userActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ExchangeActivity activity) {  
    exchangeActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(BeamActivity activity) {  
    beamActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(WelcomeActivity activity) {  
    welcomeActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(DevActivity activity) {  
    devActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public Activity activity() {  
    return activityProvider.get();
  }

  @Override
  public NearbyManager nearbyManager() {  
    return nearbyManagerProvider.get();
  }

  public static final class Builder {
    private ActivityModule activityModule;
    private ApplicationComponent applicationComponent;
  
    private Builder() {  
    }
  
    public ActivityComponent build() {  
      if (activityModule == null) {
        throw new IllegalStateException("activityModule must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException("applicationComponent must be set");
      }
      return new DaggerActivityComponent(this);
    }
  
    public Builder activityModule(ActivityModule activityModule) {  
      if (activityModule == null) {
        throw new NullPointerException("activityModule");
      }
      this.activityModule = activityModule;
      return this;
    }
  
    public Builder applicationComponent(ApplicationComponent applicationComponent) {  
      if (applicationComponent == null) {
        throw new NullPointerException("applicationComponent");
      }
      this.applicationComponent = applicationComponent;
      return this;
    }
  }
}

