package com.mycompany.passgenerate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class Letters implements PssSet {

    public Letters(List<String> list) {
      sym = list;
    }
    List<String> sym = new ArrayList<>();
    boolean numbLetters = false;

    @Override
    public List<String> listArr() {
                
        
        for (int i = 0; i < 127; i++) {
            char a = (char) i;
            if (a == 'a' || a == 'A') {
                numbLetters = true;
            }
            if (a == 'z' + 1 || a == 'Z' + 1) {
                numbLetters = false;
            }
            if (numbLetters) {
            	String b = "" + a;
                sym.add(b);
            }

        }
        return sym;
    }

   

  
}
