package com.mycompany.passgenerate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class Letters implements PssSet {

    public Letters(List<Character> list) {
      sym = list;
    }
    List<Character> sym = new ArrayList<>();
    boolean numbLetters = false;

    @Override
    public List<Character> listArr() {
                
        
        for (int i = 0; i < 127; i++) {
            char a = (char) i;
            if (a == 'a' || a == 'A') {
                numbLetters = true;
            }
            if (a == 'z' + 1 || a == 'Z' + 1) {
                numbLetters = false;
            }
            if (numbLetters) {
                sym.add(a);
            }

        }
        return sym;
    }

   

  
}
