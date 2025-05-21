package com.mycompany.passgenerate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LettNumbSymb implements PssSet {

	boolean flag = false;
	List<String> sym = new ArrayList<>();

	public LettNumbSymb(List<String> list) {
		sym = list;
	}

	@Override
	public List<String> listArr() {
		LettersNumbers lettersNumbers = new LettersNumbers(sym);
		lettersNumbers.listArr();

		add();

		return sym;
	}

	private void add() {

        for (int i = 33; i < 127; i++) {
            char c = (char) i;
            if (c == '!' || c == '@' || c == '#'
                    || c == '$' || c == '%' || c == '&'
                    || c == '*' || c == '-' || c == '_' || c == '~') {
                flag = true;
            }else{
                flag = false;
            }
            if (flag) {
            	String b = "" + c;
               
                sym.add(b);
               
            }
        }
    }

}
