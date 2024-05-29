public class Mm {
    public class MMBankFactory extends  BankFactory{

        @Override
        public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
            MMSavingAcc mmsaving=new MMSavingAcc(AccNo,accNm,accBal,isSalaried);
            return mmsaving;
        }

        @Override
        public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
            MMCurrentAcc mmcurrent =new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
            return mmcurrent;
        }

    }

}
