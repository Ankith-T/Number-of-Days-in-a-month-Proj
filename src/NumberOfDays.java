import java.util.Scanner;;

public class NumberOfDays {
    public static void main(String[] args) throws Exception {
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int yearNumber = userInputScanner.nextInt();
        System.out.println("Enter the Month: ");
        int monthNumber = userInputScanner.nextInt();
        if ((monthNumber == 2) && ((yearNumber%4 == 0) || ((yearNumber%100 != 0) && yearNumber%400 ==0))) {
            monthNumber -= 1;
            System.out.println(monthList[monthNumber] +" "+ yearNumber + " had 29 days");

        }
        else if (monthNumber == 2){
            monthNumber -= 1;
            System.out.println(monthList[monthNumber] +" "+ yearNumber + " had 28 days");

        }
        else if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12 ){
            monthNumber -= 1;
            System.out.println(monthList[monthNumber] +" "+ yearNumber + " had 31 days");
        }
        else if ((monthNumber <= 0) || (monthNumber > 12)) {
            System.out.println("Enter a Valid Month.");
        }
        
        else{
            monthNumber -= 1;
            System.out.println(monthList[monthNumber] +" "+ yearNumber + " had 30 days");
        }
       


        }
    }

