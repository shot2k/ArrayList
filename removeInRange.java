public static void removeInRange(ArrayList<Integer> list, int element, int start, int end) {
	for (int i = start; i < end; i++) {
		if (list.get(i) == element) {
			list.remove(i);
			end--;
			i--;
		}
	}
}