public static void doubleList(ArrayList<String> list) {
	for (int i = 0; i < list.size(); i += 2) {
		String word = list.get(i);
		list.add(i, word);
	}
}