// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.welcome;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WelcomeActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.welcome.WelcomeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689605, "method 'onClickStart'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickStart();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
