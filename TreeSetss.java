package miniProject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TreeSetss<T> {
	 List<T> ar=new ArrayList<T>();
	static TreeSetss obj=new TreeSetss();
	
	
	public void add(T num) {
		ar.add(num);
		Collections.sort(ar, sorting);
		obj.SortingNum();
	}
	
	  Comparator<T> sorting = new Comparator<T>() {
          @Override
          public int compare(T o1, T o2) {
              if (o1 instanceof String && o2 instanceof String) {
                  return ((String) o1).compareTo((String) o2);
              } else if (o1 instanceof Integer && o2 instanceof Integer) {
                  return ((Integer) o1).compareTo((Integer) o2);
              } else if (o1 instanceof Double && o2 instanceof Double) {
                  return ((Double) o1).compareTo((Double) o2);
              } else if (o1 instanceof Boolean && o2 instanceof Boolean) {
                  return ((Boolean) o1).compareTo((Boolean) o2);
              } else {
                  throw new IllegalArgumentException("Unsupported types");
              }
          }
      };

	
	
	public void SortingNum() {
		 for (int i = 0; i < ar.size() - 1; i++) {
	            if (ar.get(i).equals(ar.get(i + 1))) {
	                ar.remove(i);
	                i--;
	            }
	        }
	}
	
	public int Size() {
//		int count=0;
//		for(int i=0; i<ar.size(); i++) {
//			count++;
//		}
		return ar.size();
	}
	
	
	public T Last() {
		return (T) ar.get(ar.size()-1);
	}

	
	public T First() {
		return ar.get(0);
	}
	
	
	
	public void Clear(){
		ar.clear();
	}

	
	
	public boolean remove(int num) {
		
		if(ar.contains(num)) {
			int ind=ar.indexOf(num);
			ar.remove(ind);
			return true;
		}
		else {
			return false;
		}
		
	}
	

public boolean isEmpty() {
	
	if(ar.size()==0) {
		return true;
	}
	else {
		return false;
	}
}


public boolean isContain(T n) {
	boolean res=false;
	for(T i:ar) {
		if(i.equals(n)) {
			res =true;
		}
	}
	return res;
}



public T pollFirst() {
	T re=ar.get(0);
	ar.remove(0);
	return re;
}


public T pollLast() {
	T re=ar.get(ar.size()-1);
	ar.remove(re);
	return re;
}

public T lower(T ele) {
	int in=ar.indexOf(ele);
	if(in<=0) {
		return null;
	}
	else {
		return ar.get(in-1);
	}	
}

public T higher(T ele) {
	
	int in=ar.indexOf(ele);
	if(in<0||in==ar.size()-1) {
		return null;
	}
	else {
		return ar.get(in+1);
	}
	
  }

}




	
	
