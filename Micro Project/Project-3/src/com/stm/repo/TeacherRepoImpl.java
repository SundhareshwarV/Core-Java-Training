package com.stm.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import com.stm.model.Teacher;
import com.stm.util.DBUtil;

/**
 * Teacher repo used to doing CRUD for Teacher Objects
 */
public class TeacherRepoImpl implements TeacherRepo {

	public boolean doInsertTeacher(Teacher teacher) {

		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "insert into sundhar_teacher values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, teacher.getTid());
			ps.setString(2, teacher.getName());
			ps.setString(3, teacher.getSubject());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Inserty Query Not Execute");
		}

		return flag;
	}

	public boolean doDeleteTeacher(int id) {

		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "delete sundhar_teacher where Teacher_Id = ?";

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

	public boolean doUpdateTeacher(Teacher teacher) {

		boolean flag = false;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "update sundhar_teacher set teacher_name=?, subject=? where teacher_id=?";

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, teacher.getName());
			ps.setString(2, teacher.getSubject());
			ps.setInt(3, teacher.getTid());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Update Query Not Execute");
		}

		return flag;
	}

	public Teacher doFindTeacher(int id) {

		Teacher teacher = null;
		int tid;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from sundhar_teacher where teacher_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				teacher = new Teacher();
				teacher.setTid(rs.getInt("Teacher_id"));
				teacher.setName(rs.getString("Teacher_name"));
				teacher.setSubject(rs.getString("subject"));

			}

		} catch (SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return teacher;

	}

	public List<Teacher> doFindAllTeacher() {

		Teacher teacher = null;
		List<Teacher> list = new LinkedList<>();

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from sundhar_teacher";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				teacher = new Teacher();
				teacher.setTid(rs.getInt("Teacher_id"));
				teacher.setName(rs.getString("teacher_name"));
				teacher.setSubject(rs.getString("subject"));

				list.add(teacher);

			}

		} catch (SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return list;

	}
}
