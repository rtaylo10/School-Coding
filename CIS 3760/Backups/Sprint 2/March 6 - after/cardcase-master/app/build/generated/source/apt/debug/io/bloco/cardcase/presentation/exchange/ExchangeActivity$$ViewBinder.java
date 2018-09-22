// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.exchange;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ExchangeActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.exchange.ExchangeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689588, "field 'overlay'");
    target.overlay = view;
    view = finder.findRequiredView(source, 2131689590, "field 'emptyView'");
    target.emptyView = finder.castView(view, 2131689590, "field 'emptyView'");
    view = finder.findRequiredView(source, 2131689593, "field 'cardsView'");
    target.cardsView = finder.castView(view, 2131689593, "field 'cardsView'");
    view = finder.findRequiredView(source, 2131689594, "field 'cardsListView'");
    target.cardsListView = finder.castView(view, 2131689594, "field 'cardsListView'");
    view = finder.findRequiredView(source, 2131689595, "field 'done' and method 'onClickedDone'");
    target.done = finder.castView(view, 2131689595, "field 'done'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedDone();
        }
      });
    view = finder.findRequiredView(source, 2131689592, "field 'invite' and method 'onClickedInvite'");
    target.invite = finder.castView(view, 2131689592, "field 'invite'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedInvite();
        }
      });
    view = finder.findRequiredView(source, 2131689591, "field 'loader'");
    target.loader = view;
  }

  @Override public void unbind(T target) {
    target.overlay = null;
    target.emptyView = null;
    target.cardsView = null;
    target.cardsListView = null;
    target.done = null;
    target.invite = null;
    target.loader = null;
  }
}
