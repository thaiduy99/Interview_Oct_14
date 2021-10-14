package com.example.demo.domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MyMessage {
    private Map<String, List<String>> message;
    private String status;

    public MyMessage(String status, Map<String, List<String>> message) {
        this.status = status;
        this.message = message;
    }

    public MyMessage() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, List<String>> getMessage() {
        return message;
    }

    public void setMessage(Map<String, List<String>> message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyMessage myMessage = (MyMessage) o;
        return Objects.equals(message, myMessage.message) && Objects.equals(status, myMessage.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, status);
    }
}
