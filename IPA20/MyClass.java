package IPA20;

import java.util.Arrays;
import java.util.Scanner;

class Engine {
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    Engine(int engineId, String engineName, String engineType, double enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    public String getEngineType() {
        return engineType;
    }

}

public class MyClass {

    static int findAvgEnginePriceByType(Engine e[], String engineType) {

        double sum = 0;
        int count = 0;

        for (Engine E : e) {
            if (E.getEngineType().equalsIgnoreCase(engineType)) {
                sum += E.getEnginePrice();
                count++;
            }
        }

        if (sum > 0) {
            return(int)(sum / count);
        } else {
            return 0;
        }

    }

    static Engine[] searchEngineByName(Engine e[], String engineName) {
        Engine temp[] = new Engine[0];

        for (Engine E : e) {
            if (E.getEngineName().equalsIgnoreCase(engineName)) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = E;
            }
        }

        if (temp.length == 0) {
            return null;
        }
        Arrays.sort(temp, (a, b) -> a.getEngineId() - b.getEngineId());

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Engine engine[] = new Engine[4];

        for (int i = 0; i < engine.length; i++) {
            int engineId = sc.nextInt();
            sc.nextLine();
            String engineName = sc.nextLine();
            String engineType = sc.nextLine();
            double enginePrice = sc.nextDouble();
            sc.nextLine();

            engine[i] = new Engine(engineId, engineName, engineType, enginePrice);

        }

        String engineType = sc.nextLine();
        String egineName = sc.nextLine();

        double price = findAvgEnginePriceByType(engine, engineType);

        if (price == 0) {
            System.out.println("There are no engine with given type");

        } else {
            System.out.println(price);
        }

        Engine result[] = searchEngineByName(engine, egineName);

        if (result == null) {
            System.out.println("There are no engine with given name");

        } else {
            for (Engine E : result) {
                System.out.println(E.getEngineId());
            }
        }
    }

}
