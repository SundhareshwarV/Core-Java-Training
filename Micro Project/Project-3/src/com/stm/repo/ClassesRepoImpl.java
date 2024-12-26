package com.stm.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.stm.model.Classes;
import com.stm.model.Teacher;
import com.stm.util.DBUtil;


/**
 * Classes repo used to doing CRUD for classes Objects
 */
public class ClassesRepoImpl implements ClassesRepo {

	TeacherRepo teacherRepo = new TeacherRepoImpl();

	public boolean doInsertClasses(Classes classes) {

		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into sundhar_classes values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, classes.getCid());
			ps.setString(2, classes.getCname());
			ps.setInt(3, classes.getTeacher().getTid());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Inserty Query Not Execute");
		}

		return flag;
	}

	public boolean doDeleteClasses(int id) {

		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete sundhar_classes where class_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete Query Not Executed");
		}

		return flag;
	}

	public boolean doUpdateClasses(Classes classes) {

		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update sundhar_classes set class_name=?, teacher_id=? where class_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, classes.getCname());
			ps.setInt(2, classes.getTeacher().getTid());
			ps.setInt(3, classes.getCid());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Inserty Query Not Execute");
		}

		return flag;
	}

	public Classes doFindClasses(int id) {

		Classes classes = null;
		int tid;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from sundhar_classes where class_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				classes = new Classes();
				classes.setCid(rs.getInt("class_id"));
				classes.setCname(rs.getString("class_name"));

				tid = rs.getInt("Teacher_id");
				Teacher teacher = teacherRepo.doFindTeacher(tid);
				classes.setTeacher(teacher);

			}

		} catch (SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return classes;

	}

	public List<Classes> doFindAllClasses() {

		List<Classes> list = new LinkedList<>();
		int tid;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from sundhar_classes";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Classes classes = new Classes();

				classes.setCid(rs.getInt("class_id"));
				classes.setCname(rs.getString("class_name"));

				tid = rs.getInt("Teacher_id");
				Teacher teacher = teacherRepo.doFindTeacher(tid);
				classes.setTeacher(teacher);

				list.add(classes);

			}

		} catch (SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return list;

	}

}
