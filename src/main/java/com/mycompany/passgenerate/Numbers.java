package com.mycompany.passgenerate;

import java.util.ArrayList;
import java.util.List;

public class Numbers implements PssSet {
    List<Character> sym = new ArrayList<>();
    boolean numbLetters = false;

    public Numbers(List<Character> list) {
        sym = list;
    }

    @Override
    public List<Character> listArr() {
        
        for (int i = 0; i < 127; i++) {
            char a = (char) i;
            if (a == '1') {
                numbLetters = true;
            }
            if (a == '9' + 1) {
                numbLetters = false;
            }
            if (numbLetters) {
                sym.add(a);
            }

        }
        return sym;
    }
}
