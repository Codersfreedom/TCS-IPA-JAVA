import java.util.Scanner;

class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    Projector(int projectorId,String projectorName,int price,int rating,String availableIn){
        this.projectorId=projectorId;
        this.projectorName=projectorName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;

    }

    public String getAvailableIn() {
        return availableIn;
    }
    public int getPrice() {
        return price;
    }
    public int getProjectorId() {
        return projectorId;
    }
    public String getProjectorName() {
        return projectorName;
    }
    public int getRating() {
        return rating;
    }
}

public class Solution {

    static Projector findMaximumPriceByRating(Projector projector[],int rating){
        int max_price = Integer.MIN_VALUE;
        Projector temp = null;

        for(Projector p:projector){
            if(p.getRating() >rating && p.getPrice() >max_price && p.getAvailableIn().equalsIgnoreCase("TataCliq")){
                max_price = p.getPrice();
                temp = p;
            }

        }

      

        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Projector projector[] = new Projector[4];

        for(int i=0;i<projector.length;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();

            projector[i] = new Projector(a,b,c,d,e);
        }

        int inputRating = sc.nextInt();

        Projector result = findMaximumPriceByRating(projector, inputRating);

        if(result==null){
            System.out.println("No such Projector.");
        }else{
            System.out.println(result.getProjectorId());
        }

    }
}
