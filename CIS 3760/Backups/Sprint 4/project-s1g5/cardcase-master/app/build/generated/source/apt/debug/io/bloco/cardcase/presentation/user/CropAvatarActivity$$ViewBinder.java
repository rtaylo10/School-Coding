// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CropAvatarActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.user.CropAvatarActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689598, "field 'cropView'");
    target.cropView = finder.castView(view, 2131689598, "field 'cropView'");
    view = finder.findRequiredView(source, 2131689599, "method 'crop'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.crop();
        }
      });
  }

  @Override public void unbind(T target) {
    target.cropView = null;
  }
}
