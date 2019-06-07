public class Banking {
   //private int m_numberOfBanks;
   int m_bankNumber;
   float m_bankBalance;
   int m_numberOfBanksLoaned;
   int[] m_bankId;
   double[] m_amountLoaned;

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
   
}