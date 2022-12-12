public class IterativeSorter {

	public void doBubbleSort(IntegerArray arrayToSort) {
		boolean hasChanged = true;

		if (hasChanged == true) {

			for(int i = 0; i < arrayToSort.length()-1; i++) {

				for(int j = 0; j < arrayToSort.length() - i - 1; j++) {

					if (arrayToSort.read(j) > arrayToSort.read(j+1)) {

						int temp = arrayToSort.read(j);
						arrayToSort.write(j, arrayToSort.read(j+1));
						arrayToSort.write(j + 1, temp);
					}
				}
			}
		}

	}

	public void doSelectionSort(IntegerArray arrayToSort) {	
		for(int i = 0; i < arrayToSort.length()-1; i++) {
			int minIndex = i;

			for (int j = i+1; j < arrayToSort.length(); j++) {			
				if (arrayToSort.read(j) < arrayToSort.read(minIndex)) {
					minIndex = j;
					continue;
				}
			}
			int temp = arrayToSort.read(minIndex);
			arrayToSort.write(minIndex, arrayToSort.read(i));
			arrayToSort.write(i, temp);


		}

	}

	public void doInsertionSort(IntegerArray arrayToSort) {

		for(int i = 0; i <=  arrayToSort.length()-1; i++) {
			int j = i - 1;
			int currentValue = arrayToSort.read(j+1);
			
			
			if (j >=0) {
				int lastValue = arrayToSort.read(j);
			
			
				while(j>=0 && arrayToSort.read(j) > currentValue) {
					

					arrayToSort.write(j, arrayToSort.read(j + 1));
					arrayToSort.write(j+1, lastValue);					
					j = j -1;
				}
			}
		}
	}
}



