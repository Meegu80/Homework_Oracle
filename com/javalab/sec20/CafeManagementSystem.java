package com.javalab.sec20;

//import com.javalab.sec19.Category;
//import com.javalab.sec19.Employee;
//import com.javalab.sec19.Order;
//import com.javalab.sec19.Product;

/**
 * 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 정보를 저장하고 관리하는 역할
 */

public class CafeManagementSystem {
    public static void main(String[] args) {

        // 데이터 전용 클래스 객체 생성 - 생성자에서 데이터 만들어진다.
        // db : DabaBaseClass 타입 객체 변수(참조 변수)
        // - db에는 모든 데이터를 담고 있는 배열들이 위치한 곳의 주소를 갖고 있다.
        DatabaseClass db = new DatabaseClass();
        Category[] categories = db.getCategories(); // 카테고리 정보 가져오기
        showCategories(categories);

        // 상품 객체 배열 갖고오기
       Product[] products = db.getProducts();
        showProducts(products);

        // 직원 객체 배열 갖고오기
        Employee[] employees = db.getEmployees();
        showEmployees(employees);

        // 주문 객체 배열 갖고오기
        Order[] orders = db.getOrders();
        showOrders(orders);


        // 데이터 전용 클래스에서 데이터 가져오기

//        // 카테고리 출력
//        showCategories(categories);
//        System.out.println();
//
//        // 상품 출력
//        showProducts(products);
//        System.out.println();
//
//        // 직원 출력
//        showEmployees(employees);
//        System.out.println();
//
//        // 주문 출력
//        showOrders(orders);


    }

    /**
     * 주문 정보를 출력하는 메소드
     * @param orders : 주문 정보 배열
     */
    private static void showOrders(chap06_domain_class.src.com.javalab.sec19.Order[] orders) {
        // 주문 정보 출력
        System.out.println("주문번호\t주문일자\t상품번호\t직원번호");
        for (chap06_domain_class.src.com.javalab.sec19.Order order : orders) {
            System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" + order.getProductId() + "\t" + order.getEmployeeId());
        }
    }

    /**
     * 직원 정보를 출력하는 메소드
     * @param employees : 직원 정보 배열
     */
    private static void showEmployees(chap06_domain_class.src.com.javalab.sec19.Employee[] employees) {
        // 직원 정보 출력
        System.out.println("사원번호\t사원명\t직급\t급여");
        for (chap06_domain_class.src.com.javalab.sec19.Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + "\t" + employee.getName() + "\t" + employee.getPosition() + "\t" + employee.getSalary());
        }
    }

    /**
     * 상품 정보를 출력하는 메소드
     * @param products : 상품 정보 배열
     */
    private static void showProducts(chap06_domain_class.src.com.javalab.sec19.Product[] products) {
        // 상품 정보 출력
        System.out.println("상품번호\t상품명\t카테고리번호\t가격");
        for (chap06_domain_class.src.com.javalab.sec19.Product product : products) {
            System.out.println(product.getProductId() + "\t" + product.getName() + "\t" + product.getCategoryId() + "\t" + product.getPrice());
        }
    }

    /**
     * 카테고리 정보를 출력하는 메소드
     * @param categories : 카테고리 정보 배열
     */
    private static void showCategories(Category[] categories) {
        // 카테고리 정보 출력
        System.out.println("카테고리번호\t카테고리명\t카테고리설명");
        for (Category category : categories) {
            System.out.println(category.getCategoryId() + "\t" + category.getName() + "\t" + category.getDescription());
        }
    }
}