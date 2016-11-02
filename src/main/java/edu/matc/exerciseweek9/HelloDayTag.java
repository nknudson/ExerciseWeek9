package edu.matc.exerciseweek9;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nataliya.knudson on 11/2/2016.
 */
public class HelloDayTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();

        out.println("Today is: " + getCurrentDate());
        out.println();
        if (happyHalloween()) {
            out.print("HAPPY HALLOWEEN!");
        }
    }
    public String getCurrentDate(){
        DateFormat day = new SimpleDateFormat("MM/dd/yyyy");
        Date today  = new Date();
        String todaysDate = day.format(today);
        return todaysDate;
    }
    public boolean happyHalloween(){
        boolean happuHalloweem = false;
        if(getCurrentDate().substring(0,5).equalsIgnoreCase("10/31")){
            happuHalloweem = true;
        }
        return happuHalloweem;
    }
}
