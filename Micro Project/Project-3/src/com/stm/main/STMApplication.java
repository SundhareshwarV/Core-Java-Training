package com.stm.main;

import com.stm.model.Classes;
import com.stm.model.Teacher;
import com.stm.service.ClassesServiceImpl;
import com.stm.service.TeacherServiceImpl;
import com.stm.service.ClassesService;
import com.stm.service.TeacherService;
import com.stm.view.ClassesView;
import com.stm.view.TeacherView;

/**
 * @version 1.0 Main class
 */

public class STMApplication {

	/**
	 * 
	 * @param args Main method
	 */

	public static void main(String[] args) {

		ClassesService classesService = new ClassesServiceImpl();
		TeacherService teacherService = new TeacherServiceImpl();

		String msg;
		String result;
		Classes classes;
		Teacher teacher;
		int id;
		int tno;

		do {
			int choice = ClassesView.allMenu();

			switch (choice) {

			case 1:
				classes = ClassesView.insertClassesView();
				result = classesService.insertClassesValidation(classes);
				ClassesView.insertClassesResult(result);
				break;

			case 2:
				id = ClassesView.deleteClassesView();
				result = classesService.deleteClassesValidation(id);
				ClassesView.deleteClassesResult(result);
				break;

			case 3:
				classes = ClassesView.updateClassesView();
				result = classesService.updateClassesValidation(classes);
				ClassesView.updateClassesResult(result);
				break;

			case 4:
				id = ClassesView.findClassesView();
				result = classesService.findClassesValidation(id);
				ClassesView.findClassesResult(result);
				break;

			case 5:
				result = classesService.displayAllClassesValidation();
				ClassesView.displayAllClassesResult(result);
				break;

			case 6:
				teacher = TeacherView.insertTeacherView();
				result = teacherService.insertTeacherValidation(teacher);
				TeacherView.insertTeacherResult(result);
				break;

			case 7:
				tno = TeacherView.deleteTeacherView();
				result = teacherService.deleteTeacherValidation(tno);
				TeacherView.deleteTeacherResult(result);
				break;

			case 8:
				teacher = TeacherView.updateTeacherView();
				result = teacherService.updateTeacherValidation(teacher);
				TeacherView.updateTeacherResult(result);
				break;

			case 9:
				id = TeacherView.findTeacherView();
				result = teacherService.findTeacherValidation(id);
				System.out.println(result);
				break;

			case 10:
				result = teacherService.displayAllTeacherValidation();
				System.out.println(result);
				break;

			case 11:
				System.exit(0);
				break;
			default:
				ClassesView.invalidChoice();

			}
			msg = ClassesView.continueMessage();

		} while (msg.equalsIgnoreCase("Yes"));

	}

}
