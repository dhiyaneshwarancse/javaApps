package com.dhiyan;

import java.util.ArrayList;
import java.util.List;

public class GameWinner {
	
	public void findWinner() {
		String input ="bbwww";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  List<Character> li = new ArrayList<Character>(); for(char ch:
		  input.toCharArray()) { li.add(ch); } int countW=0; int countb=0; int
		  countBr=0; int ite=0; ArrayList<Character> l2=new ArrayList<Character>(); for
		  (Character character : li) { l2.add(character); } char turn='w'; for (char ch
		  : li) { if(ch=='w' && countW<2 && turn=='w') { countW++; countb=0; countBr=0;
		  
		  } else if(ch=='b' && countb<2 && turn=='b') { countb++; countW=0; countBr=0;
		  }else { if(countBr>0) break; if (countW>0) { turn='b'; countBr++; }else {
		  turn ='w'; countBr++; }
		  
		  l2.remove(ite); ite--;
		  
		  
		  } ite++;
		  
		  
		  }
		  
		  l2.forEach(n->System.out.print(n)); System.out.println(""); String
		  winner=countW==0?"Black":"white"; System.out.println("winner is::"+winner);
		 

		
		
		
	}

}
