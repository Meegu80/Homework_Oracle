package chap06_domain_class.src.com.javalab.sec19;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 주문 도메인 클래스
 * - 속성(멤버변수) : 주문id, 주문일자, 상품id, 주문처리사원id, 주문수량
 */
public class Order {
    // 1. 필드, 속성, 멤버변수
    private int orderId; // 주문id
    private LocalDateTime orderDate; // 주문일자
    private int productId; // 상품id
    private int employeeId; // 주문처리사원id
    private int quantity; // 주문수량

    // 2. 기본생성, 파라미터가 없는 생성자
    public Order(){
    }
    // 3. 생성자, 파라미터가 있는 생성자
    public Order(int orderId, String orderDate, int productId,
                 int employeeId, int quantity){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.orderId = orderId;
        this.orderDate = LocalDateTime.parse(orderDate, formatter);
        this.productId = productId;
        this.employeeId = employeeId;
        this.quantity = quantity;
    }

    // 4. getter, setter 메서드
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}