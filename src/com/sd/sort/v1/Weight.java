package com.sd.sort.v1;
import java.util.Arrays;

public class Weight implements Comparable{//compareTo를 사용하려면 Comparable(Interface)을 implements 한다.
    private int kilo;
    public Weight(int k){
      this.kilo=k;
    }
    public int compareTo(Object o){ //sort는 compareTo를 부른다.
    Weight w=(Weight)o;
    return this.kilo-w.kilo;
    }
}
    