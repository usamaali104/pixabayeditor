package com.bytee.beyondapps.data.di

import com.bytee.beyondapps.data.api.PixabayNetworkClient
import com.bytee.beyondapps.domain.repositories.RandomPhotosRepository
import com.bytee.beyondapps.domain.usecases.GetRandomPhotosUseCase
import com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Singleton
    @Provides
    fun provideFoodRecipeUseCase(randomPhotosRepository: RandomPhotosRepository) =
        GetRandomPhotosUseCase(repository = randomPhotosRepository)

    @Singleton
    @Provides
    fun providePagination(useCase: GetRandomPhotosUseCase) = RandomPhotosPagination(
        useCase = useCase,
    )
    @Singleton
    @Provides
    fun providesApiClient(pixabayNetworkClient: PixabayNetworkClient) = RandomPhotosRepository(
        pixabayNetworkClient = pixabayNetworkClient,
    )

}