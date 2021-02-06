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
		System.out.println("��'� �����");
		String name = sc.getName();
		System.out.println("��'� ����� � ������: " + name);

		String simpleName = sc.getSimpleName();
		System.out.println("��'� �����: " + simpleName);

		// modifier of class
		System.out.println();
		System.out.println("������������ �������");
		int modifier = sc.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("����������� ������� �����: " + modifierText);

		// package info
		System.out.println();
		System.out.println("�����");
		Package classPackage = sc.getPackage();
		System.out.println("����� �����: " + classPackage);

		// constructor
		System.out.println();
		System.out.println("������������");
		Constructor<Student>[] cons = sc.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			Constructor<Student> constructor = cons[i];
			System.out.println("������������ � ����: " + constructor);

		}

		// parametr of contructor
		System.out.println();
		System.out.println("��������� ������������");
		Constructor<Student> constructor = cons[0];

		Class<?>[] parameterTypes = constructor.getParameterTypes();

		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}

		// get fields
		System.out.println();
		System.out.println("����");
		Field[] fields = sc.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}

		// get methods
		System.out.println();
		System.out.println("������");
		Method[] methods = sc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
	}
}
