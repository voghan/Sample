package com.voghan.sample.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import junit.framework.TestCase;

public class DateTest extends TestCase
{

    private static final
    String
    FORMAT_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    
    private static final
    String
    FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
    
    private static final
    String
    FORMAT_DATE = "yyyy-MM-dd'T'HH-mm";
    
    public void testLastDayOfMonth() {
       String      l_last_day;
       Calendar    l_calendar;
       
       Logger logger = Logger.getLogger( "DateTest" );

       try {
           
       String a_date = "2012-02-01";
       
       l_calendar = Calendar.getInstance();
       l_calendar.setTime( new SimpleDateFormat( FORMAT_YYYY_MM_DD ).parse( a_date ) );
       
       l_calendar.setTime( new SimpleDateFormat( FORMAT_YYYY_MM_DD ).parse( a_date ) );
       l_calendar.add( Calendar.MONTH, 1 );
       l_calendar.set( Calendar.DAY_OF_MONTH, 0 );



       l_last_day = new SimpleDateFormat( FORMAT_YYYY_MM_DD ).format( l_calendar.getTime() );
       
       assertEquals( "2012-02-29", l_last_day );

       } catch (Exception e) {
           logger.fine( e.getMessage( ) );
           fail( e.getMessage( ) );
       }
    }
    
    /*******************************************************************************
    * Get date/time for start of day
    * 
    * @return
    */
       public
       void
       testStartDate()
       {
          Calendar         l_calendar = Calendar.getInstance();
          SimpleDateFormat l_df = new SimpleDateFormat( FORMAT_DATE );

          l_calendar.set( Calendar.HOUR_OF_DAY, 0 );
          l_calendar.set( Calendar.MINUTE, 0 );

          String result = l_df.format( l_calendar.getTime() );
          
          assertEquals("2012-06-27T00-00", result);
       }
       
    /*******************************************************************************
    * Get date/time for end of day
    * 
    * @return
    */
       public
       void
       testEndDate()
       {
          Calendar         l_calendar = Calendar.getInstance();
          SimpleDateFormat l_df = new SimpleDateFormat( FORMAT_DATE );

          l_calendar.set( Calendar.HOUR_OF_DAY, 23 );
          l_calendar.set( Calendar.MINUTE, 59 );

          String result =  l_df.format( l_calendar.getTime() );
          
          assertEquals("2012-06-27T23-59", result);
       }
       
       
       
}