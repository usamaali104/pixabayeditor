package com.bytee.beyondapps.data.di

import android.content.Context
import com.bytee.beyondapps.domain.repositories.EditImageRepository
import com.bytee.beyondapps.domain.repositories.EditImageRepositoryImpl
import com.bytee.beyondapps.presentation.pagination.RandomPhotosPagination
import com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapper
import com.bytee.beyondapps.presentation.ui.activity.mapper.EditImageMapperImpl
import com.bytee.beyondapps.presentation.viewmodel.EditImageViewModel
import com.bytee.beyondapps.presentation.viewmodel.PixaBayViewModel
import com.bytee.beyondapps.util.FileHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class EditImageRepositoryModule {

    @Provides
    @Singleton
    fun provideEditImageMapper(): EditImageMapper {
        return EditImageMapperImpl()
    }

    @Provides
    @Singleton
    fun provideEditImageRepository(
        @ApplicationContext context: Context,
        mapper: EditImageMapper,
        fileHelper: FileHelper,
    ): EditImageRepository {
        return EditImageRepositoryImpl(context, mapper, fileHelper)
    }

    @Singleton
    @Provides
    fun provideFoodViewModel(editImageRepository: EditImageRepository) =
        EditImageViewModel(editImageRepository = editImageRepository)

}