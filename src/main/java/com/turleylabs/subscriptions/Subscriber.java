package com.turleylabs.subscriptions;

import java.time.LocalDate;
import java.util.Objects;

public class Subscriber {
    private String name;
    private String email;
    private LocalDate expirationDate;

    public Subscriber() {
    }

    public Subscriber(String name, String email, LocalDate expirationDate) {
        this.name = name;
        this.email = email;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, expirationDate);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
