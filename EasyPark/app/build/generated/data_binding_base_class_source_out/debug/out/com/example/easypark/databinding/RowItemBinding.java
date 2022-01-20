// Generated by view binder compiler. Do not edit!
package com.example.easypark.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.easypark.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowItemBinding implements ViewBinding {
  @NonNull
  private final GridLayout rootView;

  @NonNull
  public final ImageView vendorImage;

  @NonNull
  public final TextView vendorNameCost;

  @NonNull
  public final TextView vendorOffer;

  private RowItemBinding(@NonNull GridLayout rootView, @NonNull ImageView vendorImage,
      @NonNull TextView vendorNameCost, @NonNull TextView vendorOffer) {
    this.rootView = rootView;
    this.vendorImage = vendorImage;
    this.vendorNameCost = vendorNameCost;
    this.vendorOffer = vendorOffer;
  }

  @Override
  @NonNull
  public GridLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.vendor_image;
      ImageView vendorImage = ViewBindings.findChildViewById(rootView, id);
      if (vendorImage == null) {
        break missingId;
      }

      id = R.id.vendor_name_cost;
      TextView vendorNameCost = ViewBindings.findChildViewById(rootView, id);
      if (vendorNameCost == null) {
        break missingId;
      }

      id = R.id.vendor_offer;
      TextView vendorOffer = ViewBindings.findChildViewById(rootView, id);
      if (vendorOffer == null) {
        break missingId;
      }

      return new RowItemBinding((GridLayout) rootView, vendorImage, vendorNameCost, vendorOffer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}