// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.presentation.homescreen.saved;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.playmarketbookapp.domain.repository.AppRepository;
import uz.gita.playmarketbookapp.presentation.homescreen.HomeDirection;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavedViewModel_Factory implements Factory<SavedViewModel> {
  private final Provider<AppRepository> repositoryProvider;

  private final Provider<HomeDirection> directionProvider;

  public SavedViewModel_Factory(Provider<AppRepository> repositoryProvider,
      Provider<HomeDirection> directionProvider) {
    this.repositoryProvider = repositoryProvider;
    this.directionProvider = directionProvider;
  }

  @Override
  public SavedViewModel get() {
    return newInstance(repositoryProvider.get(), directionProvider.get());
  }

  public static SavedViewModel_Factory create(Provider<AppRepository> repositoryProvider,
      Provider<HomeDirection> directionProvider) {
    return new SavedViewModel_Factory(repositoryProvider, directionProvider);
  }

  public static SavedViewModel newInstance(AppRepository repository, HomeDirection direction) {
    return new SavedViewModel(repository, direction);
  }
}