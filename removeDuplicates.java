public static void removeDuplicates(ArrayList<String> list) {
	for (int i = 0; i < list.size() - 1; i++) {
		String word = list.get(i);
		if (word.equals(list.get(i + 1))) {
			list.remove(i);
			i--;
		}
	}
}