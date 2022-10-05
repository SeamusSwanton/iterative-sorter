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

		
	}

	public void doInsertionSort(IntegerArray arrayToSort) {
		for(int i = 0; i < arrayToSort.length()-1; i++) {
			int j = i;

			if (j >0){
				int currentValue = arrayToSort.read(j);
				int lastValue = arrayToSort.read(j-1);

				while(j>0 && lastValue > currentValue) {
					arrayToSort.write(j-1, currentValue);
					j = j -1;
				}
			}
			else {
				j++;
			}
		}
	}

}
