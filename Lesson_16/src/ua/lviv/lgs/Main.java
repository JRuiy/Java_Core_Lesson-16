package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) {
		Class sc = Student.class;

		// name of class
		System.out.println();
		System.out.println("Ім'я класу");
		String name = sc.getName();
		System.out.println("Ім'я класу з силкою: " + name);

		String simpleName = sc.getSimpleName();
		System.out.println("Ім'я класу: " + simpleName);

		// modifier of class
		System.out.println();
		System.out.println("Модифікатори доступу");
		int modifier = sc.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("Модифікатор доступу класу: " + modifierText);

		// package info
		System.out.println();
		System.out.println("Пакет");
		Package classPackage = sc.getPackage();
		System.out.println("Пакет класу: " + classPackage);

		// constructor
		System.out.println();
		System.out.println("Конструктори");
		Constructor<Student>[] cons = sc.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			Constructor<Student> constructor = cons[i];
			System.out.println("Конструктори в класі: " + constructor);

		}

		// parametr of contructor
		System.out.println();
		System.out.println("Параметри конструктора");
		Constructor<Student> constructor = cons[0];

		Class<?>[] parameterTypes = constructor.getParameterTypes();

		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}

		// get fields
		System.out.println();
		System.out.println("Поля");
		Field[] fields = sc.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}

		// get methods
		System.out.println();
		System.out.println("Методи");
		Method[] methods = sc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
	}
}
