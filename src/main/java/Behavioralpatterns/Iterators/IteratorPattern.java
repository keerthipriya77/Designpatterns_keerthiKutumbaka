package Behavioralpatterns.Iterators;

import Behavioralpatterns.Iterators.Repository.NameIterator;

public class IteratorPattern {
	 public static void main(String[] args) {
	      Repository namesRepository = new Repository();

	      for(NameIterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }

}
