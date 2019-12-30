package com.example.springcloudcommon.base.constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetLastMonth {
    public static String getLastMonth(String currentDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        String lastDate = currentDate;
        try {
            date = sdf.parse(currentDate + "-" + "01");
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, -1);
            lastDate = new SimpleDateFormat("yyyy-MM").format(c.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return lastDate;
    }
}
