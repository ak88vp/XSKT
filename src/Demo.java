import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        ArrayList<String> Tram = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lần lượt số từ hàng trăm chục đơn vị từ 0-9");
        System.out.println("Nhập số hàng trăm");
        int number1 = input.nextInt();
        Tram.add(String.valueOf(number1));
        int bongNumber =0;
        if(number1 <5){
            bongNumber= number1+5;
        }else if(number1>5){
            bongNumber=number1-5;
        }
        Tram.add(String.valueOf(bongNumber));
        System.out.println("Hàng trăm chạm "+number1+" và "+bongNumber);
        ArrayList<String> resultTram = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultTram.add(Tram.get(0)+String.valueOf(i) +String.valueOf(j));
                resultTram.add(Tram.get(1)+String.valueOf(i) +String.valueOf(j));
            }
        }
        ArrayList<String> Chuc = new ArrayList<>();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Nhập số hàng chục");
        int number2 = input1.nextInt();
        Chuc.add(String.valueOf(number2));
        int bongNumber1 =0;
        if(number2 <5){
            bongNumber1= number2+5;
        }else if(number2>5){
            bongNumber1=number2-5;
        }
        Chuc.add(String.valueOf(bongNumber1));
        System.out.println("Hàng chục chạm "+number2+" và "+bongNumber1);
        ArrayList<String> resultChuc = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultChuc.add(String.valueOf(i) + Chuc.get(0) + String.valueOf(j));
                resultChuc.add(String.valueOf(i) + Chuc.get(1) + String.valueOf(j));
            }
        }
        ArrayList<String> Dvi = new ArrayList<>();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Nhập số hàng đơn vị");
        int number3 = input2.nextInt();
        Dvi.add(String.valueOf(number3));
        int bongNumber2 =0;
        if(number3 <5){
            bongNumber2= number3+5;
        }else if(number3>5){
            bongNumber2=number3-5;
        }
        Dvi.add(String.valueOf(bongNumber2));
        System.out.println("Hàng đơn vị chạm "+number3+" và "+bongNumber2);
        ArrayList<String> resultDvi = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultDvi.add(String.valueOf(i)+String.valueOf(j)+Dvi.get(0));
                resultDvi.add(String.valueOf(i)+String.valueOf(j)+Dvi.get(1));
            }
        }

        for (String value : resultChuc) {
            resultDvi.add(value);
        }
        for (String s : resultTram) {
            resultDvi.add(s);
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String elements:resultDvi) {

            if(!result.contains(elements)){
                result.add(elements);
            }
        }
        System.out.println("Dàn "+result.size()+" số");
        System.out.println(result);


        // 512 số
        // dãy số từ 000 đến 999.
        ArrayList<String> firstList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String number = String.format("%03d",i);
            firstList.add(number);
        }
        ArrayList<String> resulList = new ArrayList<>();
        for (String number : firstList) {
            if(!result.contains(number)){
                resulList.add(number);
            }
        }
        System.out.println("Dàn "+ resulList.size() +" số");
        System.out.println(resulList);
    }

}
