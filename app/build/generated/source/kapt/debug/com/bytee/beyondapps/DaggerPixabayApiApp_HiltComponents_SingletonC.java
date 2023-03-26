// Generated by Dagger (https://dagger.dev).
package com.bytee.beyondapps;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.bytee.beyondapps.data.api.PixabayNetworkClient;
import com.bytee.beyondapps.data.di.ApiModule;
import com.bytee.beyondapps.data.di.ApiModule_ProvidesApiClientFactory;
import com.bytee.beyondapps.data.di.EditImageRepositoryModule;
import com.bytee.beyondapps.data.di.EditImageRepositoryModule_ProvideEditImageMapperFactory;
import com.bytee.beyondapps.data.di.EditImageRepositoryModule_ProvideEditImageRepositoryFactory;
import com.bytee.beyondapps.data.di.EditImageRepositoryModule_ProvideFoodViewModelFactory;
import com.bytee.beyondapps.data.di.FileHelperModule;
import com.bytee.beyondapps.data.di.FileHelperModule_ProvideFileHelperFactory;
import com.bytee.beyondapps.data.di.RepoModule;
import com.bytee.beyondapps.data.di.RepoModule_ProvideFoodRecipeUseCaseFactory;
import com.bytee.beyondapps.data.di.RepoModule_ProvidePaginationFactory;
import com.bytee.beyondapps.data.di.RepoModule_ProvidesApiClientFactory;
import com.bytee.beyondapps.domain.repositories.EditImageRepository;
import com.bytee.beyondapps.domain.repositories.RandomPhotosRepository;
import com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase;
import com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination;
import com.bytee.beyondapps.presentation.ui.activity.EditImageActivity;
import com.bytee.beyondapps.presentation.ui.activity.PixabayActivity;
import com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper;
import com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel;
import com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel;
import com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bytee.beyondapps.util.FileHelper;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerPixabayApiApp_HiltComponents_SingletonC extends PixabayApiApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final EditImageRepositoryModule editImageRepositoryModule;

  private final FileHelperModule fileHelperModule;

  private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC = this;

  private Provider<EditImageMapper> provideEditImageMapperProvider;

  private Provider<EditImageRepository> provideEditImageRepositoryProvider;

  private Provider<EditImageViewModel> provideFoodViewModelProvider;

  private Provider<PixabayNetworkClient> providesApiClientProvider;

  private Provider<RandomPhotosRepository> providesApiClientProvider2;

  private Provider<GetRandomPhotosUseCase> provideFoodRecipeUseCaseProvider;

  private Provider<RandomPhotosPagination> providePaginationProvider;

  private DaggerPixabayApiApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam,
      EditImageRepositoryModule editImageRepositoryModuleParam,
      FileHelperModule fileHelperModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.editImageRepositoryModule = editImageRepositoryModuleParam;
    this.fileHelperModule = fileHelperModuleParam;
    initialize(applicationContextModuleParam, editImageRepositoryModuleParam, fileHelperModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private FileHelper fileHelper() {
    return FileHelperModule_ProvideFileHelperFactory.provideFileHelper(fileHelperModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private EditImageRepository editImageRepository() {
    return EditImageRepositoryModule_ProvideEditImageRepositoryFactory.provideEditImageRepository(editImageRepositoryModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), provideEditImageMapperProvider.get(), fileHelper());
  }

  private EditImageViewModel editImageViewModel() {
    return EditImageRepositoryModule_ProvideFoodViewModelFactory.provideFoodViewModel(editImageRepositoryModule, provideEditImageRepositoryProvider.get());
  }

  private RandomPhotosRepository randomPhotosRepository() {
    return RepoModule_ProvidesApiClientFactory.providesApiClient(providesApiClientProvider.get());
  }

  private GetRandomPhotosUseCase getRandomPhotosUseCase() {
    return RepoModule_ProvideFoodRecipeUseCaseFactory.provideFoodRecipeUseCase(providesApiClientProvider2.get());
  }

  private RandomPhotosPagination randomPhotosPagination() {
    return RepoModule_ProvidePaginationFactory.providePagination(provideFoodRecipeUseCaseProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam,
      final EditImageRepositoryModule editImageRepositoryModuleParam,
      final FileHelperModule fileHelperModuleParam) {
    this.provideEditImageMapperProvider = DoubleCheck.provider(new SwitchingProvider<EditImageMapper>(singletonC, 2));
    this.provideEditImageRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<EditImageRepository>(singletonC, 1));
    this.provideFoodViewModelProvider = DoubleCheck.provider(new SwitchingProvider<EditImageViewModel>(singletonC, 0));
    this.providesApiClientProvider = DoubleCheck.provider(new SwitchingProvider<PixabayNetworkClient>(singletonC, 6));
    this.providesApiClientProvider2 = DoubleCheck.provider(new SwitchingProvider<RandomPhotosRepository>(singletonC, 5));
    this.provideFoodRecipeUseCaseProvider = DoubleCheck.provider(new SwitchingProvider<GetRandomPhotosUseCase>(singletonC, 4));
    this.providePaginationProvider = DoubleCheck.provider(new SwitchingProvider<RandomPhotosPagination>(singletonC, 3));
  }

  @Override
  public void injectPixabayApiApp(PixabayApiApp pixabayApiApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private EditImageRepositoryModule editImageRepositoryModule;

    private FileHelperModule fileHelperModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder apiModule(ApiModule apiModule) {
      Preconditions.checkNotNull(apiModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder editImageRepositoryModule(EditImageRepositoryModule editImageRepositoryModule) {
      this.editImageRepositoryModule = Preconditions.checkNotNull(editImageRepositoryModule);
      return this;
    }

    public Builder fileHelperModule(FileHelperModule fileHelperModule) {
      this.fileHelperModule = Preconditions.checkNotNull(fileHelperModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repoModule(RepoModule repoModule) {
      Preconditions.checkNotNull(repoModule);
      return this;
    }

    public PixabayApiApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (editImageRepositoryModule == null) {
        this.editImageRepositoryModule = new EditImageRepositoryModule();
      }
      if (fileHelperModule == null) {
        this.fileHelperModule = new FileHelperModule();
      }
      return new DaggerPixabayApiApp_HiltComponents_SingletonC(applicationContextModule, editImageRepositoryModule, fileHelperModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements PixabayApiApp_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public PixabayApiApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements PixabayApiApp_HiltComponents.ActivityC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public PixabayApiApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements PixabayApiApp_HiltComponents.FragmentC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public PixabayApiApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements PixabayApiApp_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
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
    public PixabayApiApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements PixabayApiApp_HiltComponents.ViewC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public PixabayApiApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements PixabayApiApp_HiltComponents.ViewModelC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public PixabayApiApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements PixabayApiApp_HiltComponents.ServiceC.Builder {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public PixabayApiApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends PixabayApiApp_HiltComponents.ViewWithFragmentC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends PixabayApiApp_HiltComponents.FragmentC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends PixabayApiApp_HiltComponents.ViewC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends PixabayApiApp_HiltComponents.ActivityC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectEditImageActivity(EditImageActivity editImageActivity) {
    }

    @Override
    public void injectPixabayActivity(PixabayActivity pixabayActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(2).add(EditImageViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PixaBayViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends PixabayApiApp_HiltComponents.ViewModelC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<PixaBayViewModel> pixaBayViewModelProvider;

    private ViewModelCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    private PixaBayViewModel pixaBayViewModel() {
      return new PixaBayViewModel(singletonC.providePaginationProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.pixaBayViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel", (Provider) singletonC.provideFoodViewModelProvider).put("com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel", (Provider) pixaBayViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel 
          return (T) viewModelCImpl.pixaBayViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends PixabayApiApp_HiltComponents.ActivityRetainedC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends PixabayApiApp_HiltComponents.ServiceC {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerPixabayApiApp_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerPixabayApiApp_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel 
        return (T) singletonC.editImageViewModel();

        case 1: // com.bytee.beyondapps.domain.repositories.EditImageRepository 
        return (T) singletonC.editImageRepository();

        case 2: // com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper 
        return (T) EditImageRepositoryModule_ProvideEditImageMapperFactory.provideEditImageMapper(singletonC.editImageRepositoryModule);

        case 3: // com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination 
        return (T) singletonC.randomPhotosPagination();

        case 4: // com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase 
        return (T) singletonC.getRandomPhotosUseCase();

        case 5: // com.bytee.beyondapps.domain.repositories.RandomPhotosRepository 
        return (T) singletonC.randomPhotosRepository();

        case 6: // com.bytee.beyondapps.data.api.PixabayNetworkClient 
        return (T) ApiModule_ProvidesApiClientFactory.providesApiClient();

        default: throw new AssertionError(id);
      }
    }
  }
}
