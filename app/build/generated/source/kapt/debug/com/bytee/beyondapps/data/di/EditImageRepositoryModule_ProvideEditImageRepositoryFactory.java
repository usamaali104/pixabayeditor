// Generated by Dagger (https://dagger.dev).
package com.bytee.beyondapps.data.di;

import android.content.Context;
import com.bytee.beyondapps.domain.repositories.EditImageRepository;
import com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper;
import com.bytee.beyondapps.util.FileHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EditImageRepositoryModule_ProvideEditImageRepositoryFactory implements Factory<EditImageRepository> {
  private final EditImageRepositoryModule module;

  private final Provider<Context> contextProvider;

  private final Provider<EditImageMapper> mapperProvider;

  private final Provider<FileHelper> fileHelperProvider;

  public EditImageRepositoryModule_ProvideEditImageRepositoryFactory(
      EditImageRepositoryModule module, Provider<Context> contextProvider,
      Provider<EditImageMapper> mapperProvider, Provider<FileHelper> fileHelperProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.mapperProvider = mapperProvider;
    this.fileHelperProvider = fileHelperProvider;
  }

  @Override
  public EditImageRepository get() {
    return provideEditImageRepository(module, contextProvider.get(), mapperProvider.get(), fileHelperProvider.get());
  }

  public static EditImageRepositoryModule_ProvideEditImageRepositoryFactory create(
      EditImageRepositoryModule module, Provider<Context> contextProvider,
      Provider<EditImageMapper> mapperProvider, Provider<FileHelper> fileHelperProvider) {
    return new EditImageRepositoryModule_ProvideEditImageRepositoryFactory(module, contextProvider, mapperProvider, fileHelperProvider);
  }

  public static EditImageRepository provideEditImageRepository(EditImageRepositoryModule instance,
      Context context, EditImageMapper mapper, FileHelper fileHelper) {
    return Preconditions.checkNotNullFromProvides(instance.provideEditImageRepository(context, mapper, fileHelper));
  }
}