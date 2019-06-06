public class Banking {
    //private int m_numberOfBanks;
    private int m_bankNumber;
    private float m_bankBalance;
    private int m_numberOfBanksLoaned;
    private int[] m_bankId;
    private double[] m_amountLoaned;

   /* Banking() {
        m_numberOfBanks = 0;
        m_minimumAssetLimit = 0;
        m_bankNumber = 0;
        m_bankBalance = 0;
        m_numberOfBanksLoaned = 0;
        m_bankId = null;
        m_amountLoaned = null;
    }*/
    Banking(int bankNumber, float bankBalance, int numberOfBanksLoaned, int[] bankId, double[] amountLoaned){
      //  m_numberOfBanks = numberOfBanks;
       // m_minimumAssetLimit = minimumAssetLimit;
        m_bankNumber = bankNumber;
        m_bankBalance = bankBalance;
        m_numberOfBanksLoaned = numberOfBanksLoaned;
        m_bankId = bankId;
        m_amountLoaned = amountLoaned;
    }
    void getUnsafeBanks(Banking[] banks, int numberOfBanks, int minimumAssetLimit){
        System.out.printf("Unsafe Banks are banks:");
        
        for(int i = 0; i < numberOfBanks; i++){
            float totalAssets = banks[i].m_bankBalance;

            for(int j = 0; j < banks[i].m_numberOfBanksLoaned; j++){
                totalAssets += banks[i].m_amountLoaned[j];
            }
            if(totalAssets < minimumAssetLimit) {
            System.out.printf(" " + banks[i].m_bankNumber);
            }
        }
        System.out.println();
    }
}