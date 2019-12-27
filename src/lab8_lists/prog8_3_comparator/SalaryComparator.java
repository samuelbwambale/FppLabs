package lab8_lists.prog8_3_comparator;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();
		double salary1 = e1.getSalary();
		double salary2 = e2.getSalary();

		if (salary1 < salary2) {
			return -1;
		} else if (salary1 > salary2) {
			return 1;
		} else {
			// salary is the same, compare the names
			if (name1.compareTo(name2) != 0) {
				return name1.compareTo(name2);
			}
			// salary and names are the same, compare hireDates
			if (hireDate1.compareTo(hireDate2) != 0) {
				return hireDate1.compareTo(hireDate2);
			}
		}
		return 0;

	}

}
