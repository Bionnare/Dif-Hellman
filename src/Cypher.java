import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cypher {
    public static void main (String[] args){
        long A;
        long Y1;
        long Y2;
        long P;
        long x1;
        long x2;
        long Z1;
        long Z2;
        long t;
        boolean esc = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������� ����� P : ");
        P = scanner.nextInt();

        /*System.out.println("���������� �������� A:");
        for(long i = 2; i < P - 1; i++) {
            esc = true;
            //System.out.println("1 " + i);
            for (long j = 1; j < P; j++) {
                t = Math.pow(i, j) % P;
                if (1 > t || t > P - 1) {
                    //System.out.println("2 " + i);
                    esc = false;
                    break;
                }
            }
            long q = ((P - 1) / 2);
            for (long a = 2; a < q; a++) {
                if (q % a == 0) {
                    //System.out.println("4 " + q + " - " + q % a);
                    esc = false;
                    break;
                }
            }
            if(1 >= i || i >= P-1 || Math.pow(i, q) % P == 1){
                //System.out.println("3 " + i + " - " + q + " - " + Math.pow(i, q) % P);
                esc = false;
            }
            if (esc) {
                System.out.print(i + "; ");
            }
        }
        System.out.print("\n");*/

        System.out.print("������� ����������� ����� A ������ �-1 : ");
        A = scanner.nextInt();
        System.out.print("������� ��������� ����� �1 ������ P : ");
        x1 = scanner.nextInt();
        System.out.print("������� ��������� ����� �2 ������ P : ");
        x2 = scanner.nextInt();

        /*for(long i = 1; i < P; i++){
            t = Math.pow(A, i) % P;
            System.out.println(i + " = " + t);
            if(!(1 <= t && t <= P-1)){
                System.out.println("������\n");
                System.exit(1);
            }
        }*/

        /*long q = (P - 1) / 2;
        System.out.println(q + " = " + Math.pow(A, q) % P);
        if(!(1 < A && A < P-1 && Math.pow(A, q) % P != 1)){
            System.out.println("������\n");
            System.exit(1);
        }*/

        Y1 = (long) Math.pow(A, x1) % P;
        Y2 = (long) Math.pow(A, x2) % P;

        Z1 = (long) Math.pow(Y2, x1) % P;
        Z2 = (long) Math.pow(Y1, x2) % P;

        /*try (FileWriter writer = new FileWriter("������������� ���������� �����.txt", false)) {
            String lene = System.getProperty("line.separator");
            writer.write("����� ����������� Y1 = " + Y1 + lene);
            writer.write("��� ���������� Y2 = " + Y2 + lene);
            writer.write("����� ��������� ����� ���� Z = " + Z1 + lene);
            writer.write("��� �������� ����� ���� Z = " + Z2 + lene);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

        System.out.println("����� Y1 = " + Y1);
        System.out.println("����� Y2 = " + Y2);
        System.out.println("����� Z1 = " + Z1);
        System.out.println("����� Z2 = " + Z2);
    }
}