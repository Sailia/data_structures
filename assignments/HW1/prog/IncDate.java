// The IncDate class
// Do not make changes to anything other than the body of increment() method
// Your name here

public class IncDate extends Date
{
    // copy constructor
    public IncDate(Date o)
    {
        super(o.m_month, o.m_day, o.m_year);
    }

    // constructor
    public IncDate(int month, int day, int year)
    {
        super(month, day, year);
    }

    public void addDays(int numDays)
    {
        // TODO: implement this method
        
        int countdownDays = numDays;
	     int currentDay = m_day; 
	     boolean leapYear = false;
	      
	     for (int i = 0; i < numDays; i++) {
   		  if (m_year % 4 == 0) {
   		     if (m_year % 100 == 0) {
   				 if (m_year % 400 == 0) {
   					 leapYear = true;
   				 } else {
   					 leapYear = false;
   				 }
   			 } else {
   				 leapYear = true;
   			 }
    		  }
		 
            switch(currentDay) {
              case 28:
                if (m_month == 2 && !leapYear) {
                  currentDay = 1;
                  m_month++;
                } else {
                  currentDay++;
                }
                break;
              case 29:
                if (m_month == 2) {
                  currentDay = 1;
                  m_month++;
                } else {
                  currentDay++;
                }
                break;
              case 30:
                if (m_month == 4 || m_month == 6 || m_month == 9 || m_month == 11) {
                  currentDay = 1;
                  m_month++;
                } else {
                  currentDay++;
                }
                break;
              case 31:
                if (m_month == 12) {
                  m_month = 1;
                  m_year++;
                } else {
                  m_month++;
                }
                currentDay = 1;
                break;
              default:
                currentDay++;
            }

         countdownDays--;
	   }
    
    m_day = currentDay; 
    
	 
    }
}
