// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomeActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.home.HomeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689644, "field 'searchToolbar'");
    target.searchToolbar = finder.castView(view, 2131689644, "field 'searchToolbar'");
    view = finder.findRequiredView(source, 2131689596, "field 'homeEmpty'");
    target.homeEmpty = finder.castView(view, 2131689596, "field 'homeEmpty'");
    view = finder.findRequiredView(source, 2131689597, "field 'homeSearchEmpty'");
    target.homeSearchEmpty = finder.castView(view, 2131689597, "field 'homeSearchEmpty'");
    view = finder.findRequiredView(source, 2131689598, "field 'cardsView'");
    target.cardsView = finder.castView(view, 2131689598, "field 'cardsView'");
    view = finder.findRequiredView(source, 2131689599, "field 'exchangeButton' and method 'onClickedExchange'");
    target.exchangeButton = finder.castView(view, 2131689599, "field 'exchangeButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedExchange();
        }
      });
    view = finder.findRequiredView(source, 2131689600, "field 'transitionOverlay'");
    target.transitionOverlay = view;
  }

  @Override public void unbind(T target) {
    target.searchToolbar = null;
    target.homeEmpty = null;
    target.homeSearchEmpty = null;
    target.cardsView = null;
    target.exchangeButton = null;
    target.transitionOverlay = null;
  }
}
