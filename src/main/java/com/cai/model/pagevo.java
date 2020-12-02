package com.cai.model;

import java.util.List;

public class pagevo {
    private List pagelist;
    private  int totol;

    public pagevo() {
    }

    @Override
    public String toString() {
        return "pagevo{" +
                "pagelist=" + pagelist +
                ", totol=" + totol +
                '}';
    }

    public List getPagelist() {
        return pagelist;
    }

    public void setPagelist(List pagelist) {
        this.pagelist = pagelist;
    }

    public int getTotol() {
        return totol;
    }

    public void setTotol(int totol) {
        this.totol = totol;
    }

    public pagevo(List pagelist, int totol) {
        this.pagelist = pagelist;
        this.totol = totol;
    }
}
