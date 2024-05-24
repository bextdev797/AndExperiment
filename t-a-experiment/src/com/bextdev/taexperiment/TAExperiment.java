package com.bextdev.taexperiment;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class TAExperiment extends AndroidNonvisibleComponent {
  private Pyramid pyramid;

  public TAExperiment(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public boolean AndThreeEqual(boolean equal1, boolean equal2, boolean equal3) {
    return pyramid.threeAndExperiment(equal1, equal2, equal3);
  }
}
