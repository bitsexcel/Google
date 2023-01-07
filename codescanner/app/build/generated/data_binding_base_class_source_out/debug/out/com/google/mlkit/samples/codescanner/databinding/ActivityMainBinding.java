// Generated by view binder compiler. Do not edit!
package com.google.mlkit.samples.codescanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.mlkit.samples.codescanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox allowManualInput;

  @NonNull
  public final TextView barcodeResultView;

  @NonNull
  public final Button scanBarcodeButton;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull CheckBox allowManualInput,
      @NonNull TextView barcodeResultView, @NonNull Button scanBarcodeButton) {
    this.rootView = rootView;
    this.allowManualInput = allowManualInput;
    this.barcodeResultView = barcodeResultView;
    this.scanBarcodeButton = scanBarcodeButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allow_manual_input;
      CheckBox allowManualInput = ViewBindings.findChildViewById(rootView, id);
      if (allowManualInput == null) {
        break missingId;
      }

      id = R.id.barcode_result_view;
      TextView barcodeResultView = ViewBindings.findChildViewById(rootView, id);
      if (barcodeResultView == null) {
        break missingId;
      }

      id = R.id.scan_barcode_button;
      Button scanBarcodeButton = ViewBindings.findChildViewById(rootView, id);
      if (scanBarcodeButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, allowManualInput, barcodeResultView,
          scanBarcodeButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}