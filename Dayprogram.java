public class Dayprogram
{
    public static void main(String args[])
   {
          int day=4;
          String dayname="";       
             switch(day)
             {
               case 1:dayname="monday";
               break;
               case 2:dayname="Tuesday";
               break;
               case 3:dayname="Wensday";
               break;
               case 4:dayname="Thursday";
               break;
               case 5:dayname="Friday";
               break;
               case 6:dayname="Saturday";
               break;
               case 7:dayname="Sunday";
               break;
               default:System.out.println("Invalid choise..");
             }
         System.out.println(dayname);
   }
}