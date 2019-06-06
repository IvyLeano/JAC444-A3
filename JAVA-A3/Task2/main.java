 import java.util.Scanner;
 public class main {
     public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        //1. request user input: number of banks
        System.out.printf("Number of banks: ");
        int numberOfBanks = input.nextInt();
         //2. request user input: minimumAssetLimit
        System.out.printf("Minimum asset limit: ");
        int minimumAssetLimit = input.nextInt();

        //3. Declare an array of banks
        Banking[] banks = new Banking[numberOfBanks];
        
        //4. For each bank in the array request user input: balance, number of banks loaned
        for(int i = 0; i < numberOfBanks; i++){
            System.out.printf("Bank # " + i);
            System.out.printf(" --> Balance: ");
            float bankBalance = input.nextFloat();
            System.out.printf("         --> Number of banks Loaned: ");
            int numberOfBanksLoaned = input.nextInt();

            //5. Declare an array of bankIds and amountLoaned for each bank being loaned
            int[] bankId = new int[numberOfBanksLoaned];
            double[] amountLoaned = new double[numberOfBanksLoaned];

            for(int j = 0; j < numberOfBanksLoaned; j++){
                System.out.printf("         --> Bank ID: ");
                bankId[j] = input.nextInt();
                System.out.printf("             --> Amount: ");
                amountLoaned[j] = input.nextDouble();
            }
            //6. Set the bank[i] equal to the user's input values, through calling the Banking constructor
            banks[i] = new Banking(i, bankBalance, numberOfBanksLoaned, bankId, amountLoaned);
        }
        banks.getUnsafeBanks(banks, numberOfBanks, minimumAssetLimit);
     }
 }