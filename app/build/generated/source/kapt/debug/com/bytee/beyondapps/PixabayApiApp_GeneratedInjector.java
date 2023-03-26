package com.bytee.beyondapps;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PixabayApiApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PixabayApiApp_GeneratedInjector {
  void injectPixabayApiApp(PixabayApiApp pixabayApiApp);
}
