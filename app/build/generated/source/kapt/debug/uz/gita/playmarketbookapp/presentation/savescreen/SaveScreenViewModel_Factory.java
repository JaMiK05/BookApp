// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.presentation.savescreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.playmarketbookapp.domain.repository.AppRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SaveScreenViewModel_Factory implements Factory<SaveScreenViewModel> {
  private final Provider<AppRepository> repositoryProvider;

  private final Provider<SaveScreenDirection> directionProvider;

  public SaveScreenViewModel_Factory(Provider<AppRepository> repositoryProvider,
      Provider<SaveScreenDirection> directionProvider) {
    this.repositoryProvider = repositoryProvider;
    this.directionProvider = directionProvider;
  }

  @Override
  public SaveScreenViewModel get() {
    return newInstance(repositoryProvider.get(), directionProvider.get());
  }

  public static SaveScreenViewModel_Factory create(Provider<AppRepository> repositoryProvider,
      Provider<SaveScreenDirection> directionProvider) {
    return new SaveScreenViewModel_Factory(repositoryProvider, directionProvider);
  }

  public static SaveScreenViewModel newInstance(AppRepository repository,
      SaveScreenDirection direction) {
    return new SaveScreenViewModel(repository, direction);
  }
}
