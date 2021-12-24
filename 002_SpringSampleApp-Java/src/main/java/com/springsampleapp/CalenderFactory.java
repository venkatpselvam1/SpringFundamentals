package com.springsampleapp;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalenderFactory implements FactoryBean<Calendar> {
    private Calendar calendar = Calendar.getInstance();
    @Override
    public Calendar getObject() throws Exception {
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void AddDays(int num)
    {
        calendar.add(Calendar.DAY_OF_YEAR, num);
    }
}
