package enumeracoes.entities;

import enumeracoes.entities.enums.exercicios.pedido.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;

    // O status do pedido é representado por um enum.
    // Isso evita uso de texto solto e deixa o código mais seguro.
    private OrderStatus orderStatus;

    public Order() {
    }


    public Order(Integer id, Date moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        // toString() facilita visualizar o objeto durante testes e exemplos.
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
