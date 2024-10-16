package IPA18;

import java.util.Arrays;
import java.util.Scanner;

class Antenna {
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private Double antennaVSWR;

    Antenna(int antennaid, String antennaName, String projectLead, Double antennaVSWR) {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaid() {
        return antennaid;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public Double getAntennaVSWR() {
        return antennaVSWR;
    }

}

public class MyClass {

    static int searchAntennaByName(Antenna a[], String name) {

        for (Antenna A : a) {
            if (A.getAntennaName().equalsIgnoreCase(name)) {
                return A.getAntennaid();
            }
        }

        return 0;
    }

    static Antenna[] sortAntennaByVSWR(Antenna a[], Double VSWR) {
        Antenna temp[] = new Antenna[0];

        for (Antenna A : a) {
            if (A.getAntennaVSWR() < VSWR) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = A;
            }
        }

        if (temp.length == 0) {
            return null;
        }

        Antenna data;

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].getAntennaVSWR() > temp[j].getAntennaVSWR()) {
                    data = temp[i];
                    temp[i] = temp[j];
                    temp[j] = data;

                }

            }

        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antenna a[] = new Antenna[4];

        for (int i = 0; i < a.length; i++) {
            int antennaid = sc.nextInt();
            sc.nextLine();
            String antennaName = sc.nextLine();
            String projectLead = sc.nextLine();
            Double antennaVSWR = sc.nextDouble();
            sc.nextLine();

            a[i] = new Antenna(antennaid, antennaName, projectLead, antennaVSWR);

        }

        String name = sc.nextLine();
        Double VSWR = sc.nextDouble();
        sc.nextLine();

        int result1 = searchAntennaByName(a, name);
        if (result1 == 0) {
            System.out.println("There is no antenna with the given parameter");
        } else {

            System.out.println(result1);
        }

        Antenna result2[] = sortAntennaByVSWR(a, VSWR);

        if (result2 == null) {
            System.out.println("No Antenna found");
        } else {
            for (Antenna A : result2) {
                // System.out.println(A.getAntennaName());
                System.out.println(A.getProjectLead());

            }
        }

    }
}
