package enumeracoes.entities.enums.exercicios.pedido.entities;

import enumeracoes.entities.enums.exercicios.pedido.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus orderStatus;
    private final List<OrderItem> orderItemList = new ArrayList<>();

    public Order(Date moment, OrderStatus orderStatus) {
        this.moment = moment;
        this.orderStatus = orderStatus;

    }

    public Order() {

    }

    public void addOrderItem(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : orderItemList) {
            sum += item.subTotal();
        }
        return sum;
    }
}
