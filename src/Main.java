public class Main {
    public static void main(String[] args) {
        int [] apple = new int []{1, 2, 3};
        float [] banana = {1.57f, 7.654f, 9.986f };
        int [] cirle = {32, 34, 36};
        System.out.print(apple[0]+","+apple[1]+","+apple[2]);
        System.out.println("");
        System.out.print(banana[0]+","+banana[1]+","+banana[2]);
        System.out.println("");
        System.out.print(cirle[0]+","+cirle[1]+","+cirle[2]);
        System.out.println("");
        System.out.print(apple[2]+","+apple[1]+","+apple[0]);
        System.out.println("");
        System.out.print(banana[2]+","+banana[1]+","+banana[1]);
        System.out.println("");
        System.out.print(cirle[2]+","+cirle[1]+","+cirle[0]);
        System.out.println("");
        apple[0]=1+1;
        apple[2]=3+1;
        for (int i = 0; i < apple.length; i++) {
            if(apple[i] % 2 ==0){
                    System.out.println(apple[i]);
                }

            }


        }
    }
