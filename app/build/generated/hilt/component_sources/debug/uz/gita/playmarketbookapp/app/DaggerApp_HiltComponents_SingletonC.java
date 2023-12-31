// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.app;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import cafe.adriel.voyager.core.model.ScreenModel;
import cafe.adriel.voyager.hilt.ScreenModelFactory;
import cafe.adriel.voyager.hilt.VoyagerHiltViewModelFactories;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import uz.gita.playmarketbookapp.MainActivity;
import uz.gita.playmarketbookapp.MainActivity_MembersInjector;
import uz.gita.playmarketbookapp.data.local.room.dao.AppDao;
import uz.gita.playmarketbookapp.data.local.room.database.BookDatabase;
import uz.gita.playmarketbookapp.di.BookDataBaseModule;
import uz.gita.playmarketbookapp.di.BookDataBaseModule_ProvideBookDaoFactory;
import uz.gita.playmarketbookapp.di.BookDataBaseModule_ProviderBookDatabaseFactory;
import uz.gita.playmarketbookapp.di.ContextModule;
import uz.gita.playmarketbookapp.di.ContextModule_ProvideContextFactory;
import uz.gita.playmarketbookapp.domain.repository.AppRepository;
import uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl;
import uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl_Factory;
import uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl_MembersInjector;
import uz.gita.playmarketbookapp.presentation.allbooks.AllBooksViewModel;
import uz.gita.playmarketbookapp.presentation.allbooks.AllBooksViewModel_HiltModules_KeyModule_ProvideFactory;
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirection;
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirectionImpl;
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadScreenViewModel;
import uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory;
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection;
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirectionImpl;
import uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeViewModel;
import uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import uz.gita.playmarketbookapp.presentation.homescreen.saved.SavedViewModel;
import uz.gita.playmarketbookapp.presentation.homescreen.saved.SavedViewModel_HiltModules_KeyModule_ProvideFactory;
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirection;
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirectionImpl;
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenViewModel;
import uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenViewModel_HiltModules_KeyModule_ProvideFactory;
import uz.gita.playmarketbookapp.util.navigation.NavigationDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private BookDataBaseModule bookDataBaseModule;

    private ContextModule contextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder bookDataBaseModule(BookDataBaseModule bookDataBaseModule) {
      this.bookDataBaseModule = Preconditions.checkNotNull(bookDataBaseModule);
      return this;
    }

    public Builder contextModule(ContextModule contextModule) {
      this.contextModule = Preconditions.checkNotNull(contextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (bookDataBaseModule == null) {
        this.bookDataBaseModule = new BookDataBaseModule();
      }
      if (contextModule == null) {
        this.contextModule = new ContextModule();
      }
      return new SingletonCImpl(applicationContextModule, bookDataBaseModule, contextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public VoyagerHiltViewModelFactories.InternalViewModelFactory internalViewModelFactory() {
      return new VoyagerHiltViewModelFactories.InternalViewModelFactory(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<? extends ScreenModelFactory>, Provider<ScreenModelFactory>> screenModelFactories(
        ) {
      return ImmutableMap.<Class<? extends ScreenModelFactory>, Provider<ScreenModelFactory>>of();
    }

    @Override
    public Map<Class<? extends ScreenModel>, Provider<ScreenModel>> screenModels() {
      return ImmutableMap.<Class<? extends ScreenModel>, Provider<ScreenModel>>of();
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(AllBooksViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SaveScreenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SavedViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
      injectMainActivity2(mainActivity);
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectNavigationHandler(instance, singletonCImpl.navigationDispatcherProvider.get());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AllBooksViewModel> allBooksViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<ReadScreenViewModel> readScreenViewModelProvider;

    private Provider<SaveScreenViewModel> saveScreenViewModelProvider;

    private Provider<SavedViewModel> savedViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.allBooksViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.readScreenViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.saveScreenViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.savedViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>of("uz.gita.playmarketbookapp.presentation.allbooks.AllBooksViewModel", ((Provider) allBooksViewModelProvider), "uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeViewModel", ((Provider) homeViewModelProvider), "uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadScreenViewModel", ((Provider) readScreenViewModelProvider), "uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenViewModel", ((Provider) saveScreenViewModelProvider), "uz.gita.playmarketbookapp.presentation.homescreen.saved.SavedViewModel", ((Provider) savedViewModelProvider));
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // uz.gita.playmarketbookapp.presentation.allbooks.AllBooksViewModel 
          return (T) new AllBooksViewModel(singletonCImpl.homeDirectionProvider.get(), singletonCImpl.appRepositoryBindProvider.get());

          case 1: // uz.gita.playmarketbookapp.presentation.homescreen.homepage.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.appRepositoryBindProvider.get(), singletonCImpl.homeDirectionProvider.get());

          case 2: // uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadScreenViewModel 
          return (T) new ReadScreenViewModel(singletonCImpl.readBookScreenDirectionProvider.get());

          case 3: // uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenViewModel 
          return (T) new SaveScreenViewModel(singletonCImpl.appRepositoryBindProvider.get(), singletonCImpl.saveScreenDirectionProvider.get());

          case 4: // uz.gita.playmarketbookapp.presentation.homescreen.saved.SavedViewModel 
          return (T) new SavedViewModel(singletonCImpl.appRepositoryBindProvider.get(), singletonCImpl.homeDirectionProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final BookDataBaseModule bookDataBaseModule;

    private final ApplicationContextModule applicationContextModule;

    private final ContextModule contextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<NavigationDispatcher> navigationDispatcherProvider;

    private Provider<HomeDirectionImpl> homeDirectionImplProvider;

    private Provider<HomeDirection> homeDirectionProvider;

    private Provider<BookDatabase> providerBookDatabaseProvider;

    private Provider<AppDao> provideBookDaoProvider;

    private Provider<Context> provideContextProvider;

    private Provider<AppRepositoryImpl> appRepositoryImplProvider;

    private Provider<AppRepository> appRepositoryBindProvider;

    private Provider<ReadDirectionImpl> readDirectionImplProvider;

    private Provider<ReadDirection> readBookScreenDirectionProvider;

    private Provider<SaveScreenDirectionImpl> saveScreenDirectionImplProvider;

    private Provider<SaveScreenDirection> saveScreenDirectionProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        BookDataBaseModule bookDataBaseModuleParam, ContextModule contextModuleParam) {
      this.bookDataBaseModule = bookDataBaseModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      this.contextModule = contextModuleParam;
      initialize(applicationContextModuleParam, bookDataBaseModuleParam, contextModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final BookDataBaseModule bookDataBaseModuleParam, final ContextModule contextModuleParam) {
      this.navigationDispatcherProvider = DoubleCheck.provider(new SwitchingProvider<NavigationDispatcher>(singletonCImpl, 0));
      this.homeDirectionImplProvider = new SwitchingProvider<>(singletonCImpl, 1);
      this.homeDirectionProvider = DoubleCheck.provider((Provider) homeDirectionImplProvider);
      this.providerBookDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<BookDatabase>(singletonCImpl, 4));
      this.provideBookDaoProvider = DoubleCheck.provider(new SwitchingProvider<AppDao>(singletonCImpl, 3));
      this.provideContextProvider = DoubleCheck.provider(new SwitchingProvider<Context>(singletonCImpl, 5));
      this.appRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 2);
      this.appRepositoryBindProvider = DoubleCheck.provider((Provider) appRepositoryImplProvider);
      this.readDirectionImplProvider = new SwitchingProvider<>(singletonCImpl, 6);
      this.readBookScreenDirectionProvider = DoubleCheck.provider((Provider) readDirectionImplProvider);
      this.saveScreenDirectionImplProvider = new SwitchingProvider<>(singletonCImpl, 7);
      this.saveScreenDirectionProvider = DoubleCheck.provider((Provider) saveScreenDirectionImplProvider);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApp(App app) {
    }

    @CanIgnoreReturnValue
    private AppRepositoryImpl injectAppRepositoryImpl(AppRepositoryImpl instance) {
      AppRepositoryImpl_MembersInjector.injectDao(instance, provideBookDaoProvider.get());
      AppRepositoryImpl_MembersInjector.injectContext(instance, provideContextProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // uz.gita.playmarketbookapp.util.navigation.NavigationDispatcher 
          return (T) new NavigationDispatcher();

          case 1: // uz.gita.playmarketbookapp.presentation.homescreen.HomeDirectionImpl 
          return (T) new HomeDirectionImpl(singletonCImpl.navigationDispatcherProvider.get());

          case 2: // uz.gita.playmarketbookapp.domain.repository.AppRepositoryImpl 
          return (T) singletonCImpl.injectAppRepositoryImpl(AppRepositoryImpl_Factory.newInstance());

          case 3: // uz.gita.playmarketbookapp.data.local.room.dao.AppDao 
          return (T) BookDataBaseModule_ProvideBookDaoFactory.provideBookDao(singletonCImpl.bookDataBaseModule, singletonCImpl.providerBookDatabaseProvider.get());

          case 4: // uz.gita.playmarketbookapp.data.local.room.database.BookDatabase 
          return (T) BookDataBaseModule_ProviderBookDatabaseFactory.providerBookDatabase(singletonCImpl.bookDataBaseModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 5: // android.content.Context 
          return (T) ContextModule_ProvideContextFactory.provideContext(singletonCImpl.contextModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 6: // uz.gita.playmarketbookapp.presentation.bookReadScreen.ReadDirectionImpl 
          return (T) new ReadDirectionImpl(singletonCImpl.navigationDispatcherProvider.get());

          case 7: // uz.gita.playmarketbookapp.presentation.savescreen.SaveScreenDirectionImpl 
          return (T) new SaveScreenDirectionImpl(singletonCImpl.navigationDispatcherProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
