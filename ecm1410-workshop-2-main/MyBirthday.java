public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]); 
        int currentDate = Integer.parseInt(args[1]); 
        int myBirthdayDate = Integer.parseInt(args[2]); 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 
        int daysToBirthday = myBirthdayDate - currentDate;


        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        int lastFewDays = daysToBirthday % 7;
        int myBirthdayDay = currentDay;
        for (int n=0; n<lastFewDays; n++){
            if (myBirthdayDay == 7){
                myBirthdayDay = 0;
            }
            myBirthdayDay = myBirthdayDay + 1;
        }

        // 3. Display the result
        switch(myBirthdayDay){
            case 0:
                System.out.println("Your birthday will be on a Sunday");
                break;
            case 1:
                System.out.println("Your birthday will be on a Monday");
                break;
            case 2:
                System.out.println("Your birthday will be on a Tuesday");
                break;
            case 3:
                System.out.println("Your birthday will be on a Wednesday");
                break;
            case 4:
                System.out.println("Your birthday will be on a Thursday");
                break;
            case 5:
                System.out.println("Your birthday will be on a Friday");
                break;
            case 6:
                System.out.println("Your birthday will be on a Saturday");
                break;
            default:
                System.out.println("Weekday is out of range");
        }

    }
}