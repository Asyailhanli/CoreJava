package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accounNumber;//hesap numarasi
    private int pinNumber;//sifre

    private double checkingBalance;//vadesiz hesap bakiyesi
    private double savingBalance;//vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccounNumber() {
        return accounNumber;
    }

    public void setAccounNumber(int accounNumber) {
        this.accounNumber = accounNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme = checking hesabi paraCekmeIslemindenSonraKalanMiktar amount;miktar

    private double calculateCheckingBalanceAfterWithdraw(double amount) {

        checkingBalance = checkingBalance - amount;

        return checkingBalance;

    }

    //para yatirma : checking hesabi isleminden sonra kalan bakiyeyi hesaplama

    private double calculateCheckingBalanceAfterDeposit(double amount) {

        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //para cekme: saving hesabindan para cekildiginde sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount) {

        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    //para yatirma: saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayaniz

    private double calculateSavingBalanceAfterDeposit(double amount) {

        savingBalance = savingBalance + amount;
        return savingBalance;

    }

    //Musteri ile para cekmek icin etkilesime gecelim: checking hesap
    public void getCheckingWithdraw() {

        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamalar gecersizdir!!!");
            getCheckingWithdraw();// recursive method :method'u tekrardan cagirma

        } else if (amount <= checkingBalance) {

            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        } else {
            System.out.println("Yetersiz bakiye !!!");
        }

    }

    //para yatirma(checking account):Musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDeposit() {

        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamalar gecersizdir!!!");
            getCheckingDeposit();//recursive method :bu methodu tekrar girebilirsiniz ikinci imkan taniniyor recursive ile
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);

        }

    }

    // //Musteri ile para cekmek icin etkilesime gecelim: saving  hesap

    public void getSavingWithdraw() {

        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Sifir veya eksi rakamalar gecersizdir!!!");
           getSavingWithdraw();
        }else if (amount<=savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye!!");
        }

    }

    //para yatirma (saving balance) : Musteri ile para yatirmak icin etkilesime gecelim

    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz meblayi giriniz");
        double amount=input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamalar gecersizdir!!!");
            getSavingDeposit();
        }else {
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }

        }


    //son bakiyeyi goster
    public void displayCurrentAmount( double balance){
        System.out.println("Hesabinizda bulunan bakiye :" + moneyFormat.format(balance));
    }
}