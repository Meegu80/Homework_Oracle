package com.javalab.school.execution;

import java.sql.*;
import java.util.Scanner;

public class ProfessorInsert {
    // 오라클 DB에 접속해서 하기 위한 정보
    public static void main(String[] args) {
        Connection conn = null;
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "school", "1234");
            System.out.println("DB 접속 성공");

            registerProfessor(conn, scanner);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } // end of main

    private static void registerProfessor(Connection conn, Scanner scanner) {
        System.out.println("[새 교수 입력]");
        System.out.print("교수 ID: ");
        String id = scanner.nextLine();
        System.out.print("주민번호: ");
        String jumin = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("학과 코드 : ");
        int department = scanner.nextInt();
        scanner.nextLine();
        System.out.print("분류 : ");
        String grade = scanner.nextLine();
        System.out.print("입사일 : ");
        scanner.nextLine();
        String hiredate = scanner.nextLine();

        PreparedStatement pstmt = null;
        try  {
            String sql = "INSERT INTO Professor (Professor_id, jumin, department_id, grade, hiredate) " +
                    " VALUES (?, ?, ?, ?, ?, ?)";

            // Connection 구현 객체의 prepareStatement 메소드에 쿼리문을 전달해서
            // 쿼리문을 실행할 수 있도록 준비를 하는 PreparedStatement 객체를 생성한다.
            // PreparedStatement 객체에 동적으로 전달받는 파라미터(?)가 있다면 이를 세팅하는
            // 과정을 거쳐야 한다.
            // PreparedStatement.prepareStatement(실행할 쿼리문) : 쿼리 실행
            pstmt = conn.prepareStatement(sql);

            // 쿼리문 실행 시에 전달할 파라미터(?)를 세팅한다.
            // setString(파라미터 인덱스, 파라미터 값) : 파라미터 인덱스는 1부터 시작
            pstmt.setString(1, id); // pstmt.setString(1, "값") : 첫번째 ?에 값 세팅
            pstmt.setString(2, jumin);
            pstmt.setString(3, name);
            pstmt.setInt(4, department);  // pstmt.setInt(2, 100) : 두번째 ?에 100 세팅
            pstmt.setString(5, grade);
            pstmt.setString(6, hiredate);

            // 쿼리문의 파라미터인 ? 를 채운 후 쿼리 실행
            pstmt.executeUpdate(); // 쿼리 실행 저장/수정/삭제는 executeUpdate() 메소드 사용
            System.out.println("교수 입력이 성공적으로 등록되었습니다.");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("무결성 제약 조건 위반으로 데이터를 삽입할 수 없습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}