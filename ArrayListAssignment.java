package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {
	
	private static final ArrayList<Integer> ArrayList = null;
	private ArrayList<Integer> numberList;

    public ArrayListAssignment() {
        numberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }
    }
    
    
    public void displayArrayList(ArrayList<Integer> list) {
        System.out.println("ArrayList Contents:");
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Task 3: Adding Elements
    public void addElement(int element) {
        numberList.add(element);
    }

    // Task 4: Removing Elements
    public void removeElement(int element) {
        numberList.remove(Integer.valueOf(element));
    }

    // Task 5: Reversing the ArrayList
    public void reverseArrayList() {
        Collections.reverse(numberList);
    }

    // Task 6: Finding the Sum
    public int findSum() {
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        return sum;
    }
 // Task 7:
    public int findMaximum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }

        int max = list.get(0);

        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
 // Task 7:
    public int findMinmum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }

        int min = list.get(0);

        for (Integer num : list) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
    
 // Task 8:
    public void sortArrayList() {
    	Collections.sort(numberList);
    }
 // Task 10:
	public int findElement(int elm) {
		return numberList.indexOf(elm);
	}
	
	//task 11
	public void removeDuplicates() {
		ArrayList<Integer> uniqelemets = new ArrayList<>();
		for(Integer num : numberList) {
			if(!uniqelemets.contains(num)) {
				uniqelemets.add(num);
			}
		}
		numberList = uniqelemets;
	}
	
	
	
	//Task 12  
	public List<Integer> getSublist(int start, int end){
		return numberList.subList(start, end);
	}
	
	
	//task 13
	public boolean isEmptyArrayList() {
		return numberList.isEmpty();
	}
	
	//task 14 
	public void replaceElement(int olnum,int newnum) {
		Collections.replaceAll(numberList, olnum, newnum);
	}
	
	//task 15
	public int countOccurrences(int elem) {
		return Collections.frequency(numberList, elem);
	}
	
	//task16
	public void clearArrayList() {
		numberList.clear();
	}
	
	//task 17
	
	public int getArrayListSize() {
		return numberList.size();
	}
	
	//task 18
	
	public ArrayList<Integer>  copyArrayList(){
		ArrayList<Integer> copy = new ArrayList<>(numberList);
		return copy;
	}
	
	//task 19
	//findSum() 
	public double findAverage() {
		int sum  = findSum() ;
		double avg = (double)sum /numberList.size();
		return avg;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment obj = new ArrayListAssignment();
		
		obj.displayArrayList(obj.numberList);
		obj.addElement(-263);
		obj.addElement(1);
		obj.addElement(-2);
		obj.addElement(-2);
		obj.addElement(1);
		obj.addElement(-2);
		obj.addElement(-23);
		obj.addElement(-23363);
		obj.addElement(6);
		obj.addElement(6);
		obj.addElement(6);
		obj.addElement(6);
		obj.addElement(6);
		obj.sortArrayList();
		obj.displayArrayList(obj.numberList);
		
		System.out.println(obj.findElement(-2));
		
		obj.replaceElement(-23363,99);
		
		
		obj.displayArrayList(obj.numberList);
		System.out.println(obj.countOccurrences(1));
		
		System.out.println(obj.findAverage());
		
		obj.removeDuplicates();
		obj.displayArrayList(obj.numberList);
		
		System.out.println(obj.getSublist(2, 10));
		
	}

}
