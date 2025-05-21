package com.mycompany.passgenerate;

import java.util.ArrayList;
import java.util.List;

public class Numbers implements PssSet {
	List<String> sym = new ArrayList<>();
	boolean numbLetters = false;

	public Numbers(List<String> list) {
		sym = list;
	}

	@Override
	public List<String> listArr() {

		for (int i = 0; i < 127; i++) {
			char a = (char) i;
			if (a == '1') {
				numbLetters = true;
			}
			if (a == '9' + 1) {
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
