public void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    if (a1.size() >= a2.size()) {
        for (int i = 0; i < a2.size(); i++) {
               a1.add(1 + (2*i), a2.get(i));
        }
    } else {
        int used = 0;
        int size = a1.size();
        for (int i = 0; i < size; i++) {
               a1.add(1 + (2*i), a2.get(i));
                      used++;
        }
      	for (int i = used; i < a2.size(); i++) {
          a1.add(a2.get(i));
      	}
    }
}