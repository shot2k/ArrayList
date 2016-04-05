public static int maxLength(ArrayList<String> list) {
	int max = 0;
	for (String s : list) {
		if (s.length() > max) {
			max = s.length();
		}
	}
	return max;
}