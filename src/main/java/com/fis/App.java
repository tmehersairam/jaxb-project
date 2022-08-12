package com.fis;

import java.io.File;

import com.fis.entity.Student;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		try {
			Student student = new Student("tolly", 23433234, "spain");

			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = jaxbContext.createMarshaller();

			File file = new File(".\\src\\main\\java\\student.xml");

			marshaller.marshal(student, file);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try {
//
//			JAXBContext jaxbContext = JAXBContext.newInstance(Student1.class);
//			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
//
//			File file = new File(".\\src\\main\\java\\student1.xml");
//
//			Student1 student = (Student1) unMarshaller.unmarshal(file);
//			System.out.println(student);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
