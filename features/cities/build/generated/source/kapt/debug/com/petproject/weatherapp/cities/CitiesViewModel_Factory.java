// Generated by Dagger (https://dagger.dev).
package com.petproject.weatherapp.cities;

import com.petproject.weatherapp.cities.domain.CitiesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CitiesViewModel_Factory implements Factory<CitiesViewModel> {
  private final Provider<CitiesUseCase> citiesUseCaseProvider;

  public CitiesViewModel_Factory(Provider<CitiesUseCase> citiesUseCaseProvider) {
    this.citiesUseCaseProvider = citiesUseCaseProvider;
  }

  @Override
  public CitiesViewModel get() {
    return newInstance(citiesUseCaseProvider.get());
  }

  public static CitiesViewModel_Factory create(Provider<CitiesUseCase> citiesUseCaseProvider) {
    return new CitiesViewModel_Factory(citiesUseCaseProvider);
  }

  public static CitiesViewModel newInstance(CitiesUseCase citiesUseCase) {
    return new CitiesViewModel(citiesUseCase);
  }
}
