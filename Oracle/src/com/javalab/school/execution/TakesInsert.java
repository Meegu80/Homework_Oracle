package com.javalab.school.execution;

import java.sql.*;
import java.util.Scanner;

public class TakesInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "school", "1234");
            System.out.println("DB 접속 성공");

            registertakes(conn, scanner);

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

    private static void registertakes(Connection conn, Scanner scanner) {
        System.out.println("[성적 입력]");
        System.out.print("학생 ID: ");
        String id = scanner.nextLine();
        System.out.print("과목코드: ");
        String subject = scanner.nextLine();
        System.out.print("학점: ");
        String score = scanner.nextLine();

        PreparedStatement pstmt = null;
        try  {
            String sql = "INSERT INTO takes (student_id, subject, score) " +
                    " VALUES ( ?, ?, ?)";

            // Connection 구현 객체의 prepareStatement 메소드에 쿼리문을 전달해서
            // 쿼리문을 실행할 수 있도록 준비를 하는 PreparedStatement 객체를 생성한다.
            // PreparedStatement 객체에 동적으로 전달받는 파라미터(?)가 있다면 이를 세팅하는
            // 과정을 거쳐야 한다.
            // PreparedStatement.prepareStatement(실행할 쿼리문) : 쿼리 실행
            pstmt = conn.prepareStatement(sql);

            // 쿼리문 실행 시에 전달할 파라미터(?)를 세팅한다.
            // setString(파라미터 인덱스, 파라미터 값) : 파라미터 인덱스는 1부터 시작
            pstmt.setString(1, id); // pstmt.setString(1, "값") : 첫번째 ?에 값 세팅
            pstmt.setString(2, subject);
            pstmt.setString(3, score);

            // 쿼리문의 파라미터인 ? 를 채운 후 쿼리 실행
            pstmt.executeUpdate(); // 쿼리 실행 저장/수정/삭제는 executeUpdate() 메소드 사용
            System.out.println("성적이 성공적으로 등록되었습니다.");
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
