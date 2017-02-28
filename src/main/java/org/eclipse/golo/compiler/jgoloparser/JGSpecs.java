package org.eclipse.golo.compiler.jgoloparser;

import java.util.List;
import java.util.LinkedList;

public class JGSpecs {

  private static final String NEW_LINE = System.getProperty("line.separator");

  private List<JGSpec> specList = new LinkedList<>();

  public void add(JGSpec spec) {
    specList.add(spec);
  }

  public List<JGSpec> getSpecList() {
    return specList;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    for(JGSpec spec : specList) {
      res.append(NEW_LINE).append(spec);
    }
    return res.toString();
  }
}
