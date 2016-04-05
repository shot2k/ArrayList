public static void minToFront(ArrayList<Integer> list) {
	int min = Integer.MAX_VALUE;
	int index = 0;
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i) < min) {
			min = list.get(i);
			index = i;
		}
	}
	list.remove(index);
	list.add(0, min);
}