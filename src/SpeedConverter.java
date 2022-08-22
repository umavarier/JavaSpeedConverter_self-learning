// program to convert kilometer per hour to miles per hour..


import java.util.Scanner;

public class SpeedConverter {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value in kilometers pre hour ");
        double kiloMeterPerHour=sc.nextDouble();
        sc.nextLine();
        toMilesPerHour(kiloMeterPerHour);
        printConversion(kiloMeterPerHour);



    }



        public static long toMilesPerHour(double kiloMeterPerHour)
        {    long rounded=0;
            double number=0;
            if(kiloMeterPerHour<0)
            {
                return -1;
            }
            else
            {
                number=kiloMeterPerHour/1.609;
                rounded=Math.round(number);
                return rounded;

            }
        }
        public static void printConversion(double kiloMeterPerHour)
        {    long yy=0;double xx=0;
            if(kiloMeterPerHour<0)
            {
                System.out.println("Invalid Value");
            }
            else
            {    xx=kiloMeterPerHour;
                yy= toMilesPerHour(kiloMeterPerHour);
                System.out.println(xx+" km/h = "+yy+" mi/h");
            }
        }
    }

