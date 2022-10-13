public class IterativeSorter {

	public void doBubbleSort(IntegerArray arrayToSort) {
		boolean hasChanged = true;

		if (hasChanged == true) {
			for(int i = 0; i < arrayToSort.length()-1; i++) {

				int currentValue = arrayToSort.read(i);
				int nextValue = arrayToSort.read(i+1);

				if(currentValue > nextValue) {
					arrayToSort.write(i+1, currentValue);

				}
				else {
					hasChanged = false;
				}
			}
		}

	}

	public void doSelectionSort(IntegerArray arrayToSort) {	
		for(int i = 0; i <= arrayToSort.length()-1; i++) {
			int minIndex = i;
			int minIndexValue = arrayToSort.read(minIndex);
			
			for (int j = i+1; j < arrayToSort.length(); j++) {			
                if (arrayToSort.read(j) < minIndexValue) {
                	minIndex = j;
                }
                	
				arrayToSort.write(minIndex, arrayToSort.read(j));
				arrayToSort.write(j, minIndexValue);
				
			}
		}
		
	}

	public void doInsertionSort(IntegerArray arrayToSort) {

		for(int i = 0; i <=  arrayToSort.length()-1; i++) {
			int j = i - 1;
			int currentValue = arrayToSort.read(j+1);

			if (j >=0)				
				
				while(j>=0 && arrayToSort.read(j) > currentValue) {
					int lastValue = arrayToSort.read(j);
					
					arrayToSort.write(j, arrayToSort.read(j + 1));
					arrayToSort.write(j+1, lastValue);					
					j = j -1;
				}
				
			}
		}
	}


