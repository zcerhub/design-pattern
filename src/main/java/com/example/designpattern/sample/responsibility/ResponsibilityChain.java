package com.example.designpattern.sample.responsibility;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityChain {

    private List<Responsibility> responsibilities;

    private int index=0;

    public ResponsibilityChain() {
        responsibilities = new ArrayList<>();
    }

    public void process(Request request) {
        if (this.index < this.responsibilities.size()) {
            this.responsibilities.get(index++).process(request,this);
        }
    }

    public void register(Responsibility responsibility) {
        responsibilities.add(responsibility);
    }

}
