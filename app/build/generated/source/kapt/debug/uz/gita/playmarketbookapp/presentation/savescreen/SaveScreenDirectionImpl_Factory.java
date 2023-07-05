// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.presentation.savescreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.playmarketbookapp.util.navigation.AppNavigator;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SaveScreenDirectionImpl_Factory implements Factory<SaveScreenDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public SaveScreenDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public SaveScreenDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static SaveScreenDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new SaveScreenDirectionImpl_Factory(navigatorProvider);
  }

  public static SaveScreenDirectionImpl newInstance(AppNavigator navigator) {
    return new SaveScreenDirectionImpl(navigator);
  }
}