package com.bextdev.andexperiment;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class And extends AndroidNonvisibleComponent {
  private Pyramid pyramid;

  public And(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public boolean EqualAnd(boolean equal1, boolean equal2){
    return pyramid.twoAndExperiment(equal1, equal2);
  }
}
