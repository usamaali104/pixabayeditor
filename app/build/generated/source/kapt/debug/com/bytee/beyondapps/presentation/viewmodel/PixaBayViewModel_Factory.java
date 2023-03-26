// Generated by Dagger (https://dagger.dev).
package com.bytee.beyondapps.presentation.viewmodel;

import com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PixaBayViewModel_Factory implements Factory<PixaBayViewModel> {
  private final Provider<RandomPhotosPagination> paginationProvider;

  public PixaBayViewModel_Factory(Provider<RandomPhotosPagination> paginationProvider) {
    this.paginationProvider = paginationProvider;
  }

  @Override
  public PixaBayViewModel get() {
    return newInstance(paginationProvider.get());
  }

  public static PixaBayViewModel_Factory create(
      Provider<RandomPhotosPagination> paginationProvider) {
    return new PixaBayViewModel_Factory(paginationProvider);
  }

  public static PixaBayViewModel newInstance(RandomPhotosPagination pagination) {
    return new PixaBayViewModel(pagination);
  }
}