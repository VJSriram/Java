package SetConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {
	
	/*
	 * EnumSet is not synchronized
	 * Its a highly performance Java collection member
	 * Faster than Hashset
	 * All the methods are implemented using bitwise arithmetic operations
	 * 
	 */
	
	enum Lang{
		JAVA,
		CSharp,
		JavaScript,
		Python,
		Ruby,
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Created a new enumset using enum
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		// empty enum set:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);
		
		//range(e1, e2):
		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.JavaScript);
		System.out.println(enumRange);

		// of : 
		EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSharp);
		System.out.println(CSharpEnum);
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.Python);
		System.out.println(multipleEnum);
		
		// add adn addAll();
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JavaScript);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		// How to iterate EnumSet : iterator:
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		
		Iterator<Lang> it = fullLang.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.println(" , ");
		}
		
		// remove() and removeAll();
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);
		
		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1);
		System.out.println(newLang);
	}

}
