package ch08.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		
		//아래 두 가지 다 같은 방법임
		//ArrayList<Language> arrayList = new ArrayList<Language>();
		//List<Language> language = new ArrayList<Language>();
		List<String> listStrings = new ArrayList<String>();
		
		//listString.set(0, null); //set 사용하면 순번이 부여됨
		//listString.set(25, "Yerin");
		
		listStrings.add("Tony");
		listStrings.add("Jennifer"); //arrayList에서 데이터를 넣을 때 많이 사용함, 순번 없기 때문에 순번에 따라 데이터를 넣어야 하는 경우에는 부적합
		

		for (int i=0;  i<listStrings.size(); i++) {
			System.out.println(listStrings.get(i));
		}
		
		System.out.println();
		
		for (String listString : listStrings) { //String을 이용해 a라는 임의의 변수를 만듦
			System.out.println(listString);
		}
		
		List <Language> languages = new ArrayList<Language>();
		
		Language language1 = new Language();
		Language language2=new Language("Yoo", 1);
		
		languages.add(language1);
		languages.add(language2);
		languages.add(new Language("EN", 2));

		for (Language language : languages) { //향상된 for문
			System.out.println(language.getName() + " | " + language.getVersion());
		}
		
	}
	
}
