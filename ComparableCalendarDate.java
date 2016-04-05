public int compareTo(CalendarDate other) {
	if (this.getYear() != other.getYear()) {
		return this.getYear() - other.getYear();
	}
	if (this.getMonth() != other.getMonth()) {
		return this.getMonth() - other.getMonth();
	}
	if (this.getDay() != other.getDay()) {
		return this.getDay() - other.getDay();
	} else {
		return 0;
	}
}