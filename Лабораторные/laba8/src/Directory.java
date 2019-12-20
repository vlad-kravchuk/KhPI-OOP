package laba8;

import java.util.Scanner;

class Directory {
	private String store;
	private String address;
	private String phone;

	private String specialization;
	private String work_time;

	public void setStore(String store) {
		this.store = store;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setWork_time(String work_time) {
		this.work_time = work_time;
	}

	String getSpecialization() {
		return specialization;
	}

	String getPhone() {
		return phone;
	}

	String getAddress() {
		return address;
	}

	String getStore() {
		return store;
	}

	String getWork_time() {
		return work_time;
	}

	Directory() {
		store = null;
		address = null;
		phone = null;
		specialization = null;
		work_time = null;

	}

	Directory(final Directory obj) {
		store = obj.store;
		address = obj.address;
		phone = obj.phone;
		specialization = obj.specialization;
		work_time = obj.work_time;
	}

	void generateDirectory() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n¬ведите название магазина: ");
		store = scan.nextLine();
		System.out.print("\n¬ведите адрес магазина: ");
		address = scan.nextLine();
		System.out.print("\n¬ведите телефон магазина: ");
		phone = scan.nextLine();
		System.out.print("\n¬ведите специализацию магазина: ");
		specialization = scan.nextLine();
		System.out.print("\n¬ведите врем€ работы: ");
		work_time = scan.nextLine();
	}

	@Override
	public String toString() {
		return "Recruitment{" + "store='" + store + '\'' + ", address='" + address + '\'' + ", phone='" + phone + '\''
				+ ", specialization=" + specialization + ", work_time='" + work_time + '\'' + '}';
	}
}
