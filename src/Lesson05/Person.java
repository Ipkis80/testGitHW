package Lesson05;

public class Person {
	private String fio; //ФИО
	private int age; //возраст
	private String position; //должность
	private String email; //email
	private String phone; //телефон
	private int salary; //зарплата

	Person(String fio, String position, String email, String phone, int salary, int age) {
		this.fio = fio;
		this.age = age;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

	// Getter

	public void info(){
		System.out.println("ФИО: " + fio);
		System.out.println("Возраст: " + age);
		System.out.println("Должность: " + position);
		System.out.println("email: " + email);
		System.out.println("Номер телефона: " + phone);
		System.out.println("Размер заработной платы: " + salary + " рублей");
		System.out.println("**********************************************");
	}

	public void printSalary(){
		System.out.println("Размер заработной платы: " + salary + " рублей");
	}

	// Getters
	public int getAge() {
			return age;
	}

	public String getFio() {
	    return fio;
	}

	public String getPosition() {
	    return position;
	}
	public String getEmail() {
	    return email;
	}
	public String getPhone() {
	    return phone;
	}
	public int getSalary() {
	    return salary;
	}



//    //Setter
    public void setSalary(int salary) {
	    if (salary > this.salary) System.out.println("Уважаемый, " + this.fio + ". Our congratulations! Вам повысили ЗП! ");
	    else System.out.println(this.fio + ", Сегодня не ваш день. Мы будем платить вам меньше");

	    this.salary = salary;
	}
} //Конец описания class Person

