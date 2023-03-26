// Generated by Dagger (https://dagger.dev).
package com.bytee.beyondapps.presentation.viewmodel;

import com.bytee.beyondapps.domain.repositories.EditImageRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EditImageViewModel_Factory implements Factory<EditImageViewModel> {
  private final Provider<EditImageRepository> editImageRepositoryProvider;

  public EditImageViewModel_Factory(Provider<EditImageRepository> editImageRepositoryProvider) {
    this.editImageRepositoryProvider = editImageRepositoryProvider;
  }

  @Override
  public EditImageViewModel get() {
    return newInstance(editImageRepositoryProvider.get());
  }

  public static EditImageViewModel_Factory create(
      Provider<EditImageRepository> editImageRepositoryProvider) {
    return new EditImageViewModel_Factory(editImageRepositoryProvider);
  }

  public static EditImageViewModel newInstance(EditImageRepository editImageRepository) {
    return new EditImageViewModel(editImageRepository);
  }
}