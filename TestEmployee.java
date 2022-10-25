import java.util.Scanner;

public class TestMotorBoat {
    public static void main(String[] args) {
        // Initialize the scanner and get the params
        Scanner sc = new Scanner(System.in);
        double max_fuel = -1;
        double cur_fuel = -1;
        double max_speed = -1;
        double cur_speed = -1;
        double efficiency = -1;
        double distance = -1;

        // Check user input. Max fuel needs to be less than 250 gallons
        while (max_fuel < 0 || max_fuel > 250){
            System.out.print("Input Fuel Tank Capacity: ");
            max_fuel = sc.nextDouble();
        }
        // Check user input. Current fuel cannot be more than our tank's capacity
        while (cur_fuel < 0 || cur_fuel > max_fuel){
            System.out.print("Input Current Fuel: ");
            cur_fuel = sc.nextDouble();
        }
        // Check user input. Max Speed cannot exceed 50 knots
        while (max_speed < 0 || max_speed > 50){
            System.out.print("Input Max Speed of Boat: ");
            max_speed = sc.nextDouble();
        }
        // Check user input. Current speed cannot be faster than our max speed
        while(cur_speed < 0 || cur_speed > max_speed){
            System.out.print("Input Current Speed of Boat: ");
            cur_speed = sc.nextDouble();
        }
        // Check user input. Efficiency is a percentage that cannot exceed 100.
        while(efficiency < 0 || efficiency > 100){
            System.out.print("Input Boat Motor Efficiency: ");
            efficiency = sc.nextDouble();
        }
        // Check user input.
        while(distance < 0){
            System.out.print("Input Total Distance Travelled: ");
            distance = sc.nextDouble();
        }

        System.out.println(""); 
        System.out.println(""); 

        // Create a new motor boat and get its fuel amount
        MotorBoat testBoat = new MotorBoat(max_fuel, cur_fuel, max_speed, cur_speed, efficiency, distance);
        double boat_fuel = testBoat.curFuelTotal();
        System.out.printf("Fuel Amount: %6f\n", boat_fuel);

        // Check user input. Attempt to refuel the boat (without overfilling)
        char refuel = ' ';
        boat_fuel = 0;
        while (refuel != 'y' && refuel != 'n'){
            System.out.print("Would you like to add more fuel (y/n): ");
            refuel = sc.next().charAt(0);
            if(refuel == 'y'){
                while (boat_fuel <= 0 || boat_fuel + testBoat.curFuelTotal() > max_fuel){
                System.out.print("How much fuel would you like to add? ");
                boat_fuel = sc.nextDouble();
                }
            }
        }
        testBoat.refuel(boat_fuel);

        boat_fuel = testBoat.curFuelTotal();
        System.out.printf("Fuel Amount: %6f\n", boat_fuel);

        // Check user input. Attempt to change the boat speed within bounds.
        char speed_adj = ' ';
        cur_speed = -1;
        while (speed_adj != 'y' && speed_adj != 'n'){
            System.out.print("Would you like to change the speed? ");
            speed_adj = sc.next().charAt(0);
            if(speed_adj == 'y'){
                while (cur_speed < 0 || cur_speed >= max_speed){
                    System.out.print("Adjust the Speed: ");
                    cur_speed = sc.nextDouble();
                }
            }
        }
        testBoat.changeSpeed(cur_speed);

        // Adjust operation time.
        double op_time = -1;
        while(op_time < 0 || op_time > 8){
            System.out.print("How long would you like to operate the boat (hours): ");
            op_time = sc.nextDouble();
        }
        
        System.out.println(""); 
        System.out.println(""); 

        // Operate the motorboat. If we have an error we print out 
        // "If the amount of the fuel in the tank is not sufficient to operate the motorboat, it prints an error message and then it exits."
        testBoat.operateBoat(op_time);
        boat_fuel = testBoat.curFuelTotal();

        // Print out final details.
        System.out.println("Operating the motorboat");

        System.out.printf("Remaining Fuel: %6f\n", boat_fuel);

        distance = testBoat.distanceTraveledCheck();
        System.out.printf("Updated Distance: %6f\n", distance);

        sc.close();
    }
}