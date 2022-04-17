// Generated by Dagger (https://dagger.dev).
package com.petproject.weatherapp.common.dispatchers.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatchersModule_ProvidesMainImmediateDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesMainImmediateDispatcher();
  }

  public static DispatchersModule_ProvidesMainImmediateDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesMainImmediateDispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.providesMainImmediateDispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvidesMainImmediateDispatcherFactory INSTANCE = new DispatchersModule_ProvidesMainImmediateDispatcherFactory();
  }
}
