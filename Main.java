import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nump1;
        do{
            System.out.println("Quantas pessoas você deseja incluir na lista?");
            nump1 = scanner.nextInt();
            scanner.nextLine();

            if(nump1<1){
                System.out.println("Insira um número válido de pessoas!");
            }
        } while(nump1<1);

        float[] height = new float[nump1];
        float[] mass = new float[nump1];
        int[] age = new int[nump1];

        for(int i=0; i<nump1; i++){
            do {
                System.out.println("Insira a altura das pessoa: ");
                System.out.println("Altura:");
                height[i] = scanner.nextFloat();

                if(height[i]<=0){
                    System.out.println("Insira um valor válido!");
                }
            } while (height[i] <=0);
        }

        for(int i=0; i<nump1; i++){
            do {
               System.out.println("Insira o peso das pessoas:");
               System.out.println("Peso: ");
               mass[i] = scanner.nextFloat();

               if(mass[i] <=0){
                   System.out.println("Insira um valor válido!");
               }
            } while (mass[i] <=0);
        }

        for(int i=0; i<nump1; i++){
            do {
                System.out.println("Insira a idade das pessoas:");
                System.out.println("Idade: ");
                age[i] = scanner.nextInt();

                if(age[i] <= 0){
                    System.out.println("Insira um valor válido!");
                }
            } while (age[i] <=0);
        }

        float sHeight = 0;
        float sMass = 0;
        float sAge = 0;

        for(int i=0; i<nump1; i++) {
            sHeight += height[i];
            sMass += mass[i];
            sAge += age[i];
        }

        float[] mHeight = new float[1];
        float[] mMass = new float[1];
        float[] mAge = new float[1];

        mHeight[0] = sHeight / nump1;
        mMass[0] = sMass / nump1;
        mAge[0] = sAge / nump1;

        for(int i=1; i<2; i++){
            System.out.println("Aqui estão suas médias: ");
            System.out.println("Média altura: "+mHeight[0]);
            System.out.println("Média peso: "+mMass[0]);
            System.out.println("Média idade:"+mAge[0]);
        }

    }
}