package com.mindex.challenge.data;

import java.util.Objects;
import java.time.Instant;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Compensation {

    @DBRef(lazy = true)//Entity
    private Employee employee;
    private String salary;
    private Instant effectiveDate;

    public Compensation() {
    }

    public Employee getEmployee() {

        return this.employee;
    }

    public void setEmployee(Employee employee) {

        this.employee = employee;
    }

    public String getSalary() {

        return this.salary;
    }

    public void setSalary(String salary) {

        this.salary = salary;
    }

    public Instant getEffectiveDate() {

        return this.effectiveDate;
    }

    public void setEffectiveDate(Instant effectiveDate) {

        this.effectiveDate = effectiveDate;
    }

    public Compensation employee(Employee employee) {

        this.employee = employee;
        return this;
    }

    public Compensation salary(String salary) {

        this.salary = salary;
        return this;
    }

    public Compensation effectiveDate(Instant effectiveDate) {

        this.effectiveDate = effectiveDate;
        return this;
    }

    @Override
    public boolean equals(Object OO) {
        if (OO == this)
            return true;
        if (!(OO instanceof Compensation)) {
            return false;
        }
        Compensation compensation = (Compensation) OO;
        return Objects.equals(employee, compensation.employee)
                && Objects.equals(salary, compensation.salary)
                && Objects.equals(effectiveDate, compensation.effectiveDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employee, salary, effectiveDate);
    }

    @Override
    public String toString() {
        return "{" +
                " employee ='" + getEmployee() + "'" + ", salary ='" + getSalary() + "'" + ", effectiveDate ='" + getEffectiveDate() + "'" +
                "}";
    }

}