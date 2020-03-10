package Behavioralpatterns.Iterators;

import Behavioralpatterns.Iterators.Repository.NameIterator;

public class Repository {
	public String names[] = {"Shivani" , "Shreya" ,"Latha" , "vani"};

	   public NameIterator getIterator() {
	      return new NameIterator();
	   }

	   public class NameIterator  {

	      int index;
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	     
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }

}
