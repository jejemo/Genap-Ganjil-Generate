package com.maho.upi.ggappjava;

@SuppressWarnings("ALL")
public class Model {
    String num;
    String bil;
    String gg;

    public Model(String num, String bil, String gg) {
        this.num = num;
        this.bil = bil;
        this.gg = gg;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBil() {
        return bil;
    }

    public void setBil(String bil) {
        this.bil = bil;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }
}
