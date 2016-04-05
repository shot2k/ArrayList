public static void swapPairs(ArrayList<String> list) {
	for (int i = 0; i < list.size() - 1; i += 2) {
		String one = list.get(i);
		String two = list.get(i + 1);
		list.set(i, two);
		list.set(i + 1, one);
	}
}