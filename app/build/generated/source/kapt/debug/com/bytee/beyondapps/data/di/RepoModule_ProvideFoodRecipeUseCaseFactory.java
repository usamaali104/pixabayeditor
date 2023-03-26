// Generated by Dagger (https://dagger.dev).
package com.bytee.beyondapps.data.di;

import com.bytee.beyondapps.domain.repositories.RandomPhotosRepository;
import com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepoModule_ProvideFoodRecipeUseCaseFactory implements Factory<GetRandomPhotosUseCase> {
  private final Provider<RandomPhotosRepository> randomPhotosRepositoryProvider;

  public RepoModule_ProvideFoodRecipeUseCaseFactory(
      Provider<RandomPhotosRepository> randomPhotosRepositoryProvider) {
    this.randomPhotosRepositoryProvider = randomPhotosRepositoryProvider;
  }

  @Override
  public GetRandomPhotosUseCase get() {
    return provideFoodRecipeUseCase(randomPhotosRepositoryProvider.get());
  }

  public static RepoModule_ProvideFoodRecipeUseCaseFactory create(
      Provider<RandomPhotosRepository> randomPhotosRepositoryProvider) {
    return new RepoModule_ProvideFoodRecipeUseCaseFactory(randomPhotosRepositoryProvider);
  }

  public static GetRandomPhotosUseCase provideFoodRecipeUseCase(
      RandomPhotosRepository randomPhotosRepository) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideFoodRecipeUseCase(randomPhotosRepository));
  }
}
