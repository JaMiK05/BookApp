// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.presentation.bookReadScreen;

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
public final class ReadDirectionImpl_Factory implements Factory<ReadDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public ReadDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public ReadDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static ReadDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new ReadDirectionImpl_Factory(navigatorProvider);
  }

  public static ReadDirectionImpl newInstance(AppNavigator navigator) {
    return new ReadDirectionImpl(navigator);
  }
}