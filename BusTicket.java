import java.util.*;
class BusTicket{
  public static  boolean [] seats= new boolean[10];
    public static void main(String[] args) {
    System.out.println("CHOOSE AN OPTION");
    System.out.println("1.VIEW SEAT MAP");
    System.out.println("2.RESERVE A SEAT");
    System.out.println("3.CANCEL YOUR RESERVATION");

    ///option bar 
    
    Scanner  sc1 = new Scanner(System.in);
    int n= sc1.nextInt();
    if(n<1||n>3){
System.out.println("CHOOSE AN VALID OPTION FROM ABOVE");
    }

    switch (n) {
        case 1:
            viewSeatMap();
            break;
            case 2:
ReserveSeat();
    break;
    case 3:
    Cancellation();
    break;
        default:
            break;
    }

    }
// seat mapiing 
    static void viewSeatMap(){
        for(int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
    }
    /// BACK FUNCTION.
    static void exit(){
        main(null);
    }
///seat reservation
static void ReserveSeat(){
Scanner sc2= new Scanner(System.in);
System.out.print("please enter a seat number for reservation.");
int X= sc2.nextInt();
if(X<1||X>10){
    System.out.print("please enter a valid seat number");
}else if(seats[X-1]){
System.out.println("Seat already booked || choose any other seat ");
}else {
    seats[X-1]=true;
System.out.println("seat reserved ");
}

System.out.println(" press 0 to back to Main Menu. ");
System.out.println(" OR");
System.out.println("if you want to cancel seat reservation press 9 ");
int z=sc2.nextInt();
if(z==9){
Cancellation(); 
    }else if(z==0){
exit();
    }
}

// seat cancellation.
    static void Cancellation(){
        System.out.println("please enter your seat number");
        Scanner scanner3 = new Scanner(System.in);
        int X= scanner3.nextInt();
        if(X<0||X>10){
            System.out.println("please enter a valid seat Number ");
        }else if(!seats[X-1]){
            System.out.print("seat not reserved");
        }else{
                seats[X-1]=false;
System.out.println("seat reservation cancelled. ");

}

System.out.println(" press 0 to back to Main Menu. ");
Scanner sc4= new Scanner(System.in);
int k= sc4.nextInt();
if(k==0){
exit();
    }

  
        }
    }

