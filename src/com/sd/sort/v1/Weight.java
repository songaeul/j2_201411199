package com.sd.sort.v1;
import java.util.Arrays;

public class Weight implements Comparable{//compareTo�� ����Ϸ��� Comparable(Interface)�� implements �Ѵ�.
    private int kilo;
    public Weight(int k){
      this.kilo=k;
    }
    public int compareTo(Object o){ //sort�� compareTo�� �θ���.
    Weight w=(Weight)o;
    return this.kilo-w.kilo;
    }
}
    