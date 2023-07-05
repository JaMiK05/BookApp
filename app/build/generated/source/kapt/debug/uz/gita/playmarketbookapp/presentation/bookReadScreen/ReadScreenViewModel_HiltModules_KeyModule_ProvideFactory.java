// Generated by Dagger (https://dagger.dev).
package uz.gita.playmarketbookapp.presentation.bookReadScreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ReadScreenViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ReadScreenViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
