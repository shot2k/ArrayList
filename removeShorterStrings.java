public static void removeShorterStrings(ArrayList<String> list) {
	for (int i = 0; i < list.size() - 1; i += 2) {
		String one = list.get(i);
		String two = list.get(i + 1);
		if (one.length() > two.length()) {
			list.remove(i + 1);
		} else if (one.length() < two.length()) {
			list.remove(i);
		} else {
			list.remove(i);
		}
		i--;
	}
}