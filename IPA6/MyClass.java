package IPA6;

import java.util.Scanner;

class RRT {
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    RRT(int ticketNo,String raisedBy,String assignedTo,int priority,String project){
        this.ticketNo = ticketNo;
        this.raisedBy=raisedBy;
        this.assignedTo=assignedTo;
        this.priority=priority;
        this.project=project;
    }

    int getPriority(){
        return priority;
    }

    String getProject(){
        return project;
    }
    int getTicketNo(){
        return ticketNo;
    }

    String getRaisedBy(){
        return raisedBy;
    }

    String getAssignedTo(){
        return assignedTo;
    }
}

public class MyClass{


    public static RRT getHighestPriorityTicket(RRT r[],String project){
        int highestPriority = Integer.MAX_VALUE;
        for(RRT rr:r){
            if(rr.getPriority() <highestPriority){
                highestPriority = rr.getPriority();
            }
        }

        for(RRT rr:r){
            if(rr.getProject().equalsIgnoreCase(project) && rr.getPriority()==highestPriority){
                return rr;
            }
        }
        return null;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        RRT r[] = new RRT[4];

        for(int i=0;i<r.length;i++){
            int ticketNo = sc.nextInt();
            sc.nextLine();
            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();

            r[i] = new RRT(ticketNo, raisedBy, assignedTo, priority, project);
        }

        String inputProject = sc.nextLine();
        sc.close();
        RRT result = getHighestPriorityTicket(r, inputProject);

        if(result ==null){
            System.out.println("No such Ticket");
        }else{
            System.out.println(result.getTicketNo());
            System.out.println(result.getRaisedBy());
            System.out.println(result.getAssignedTo());
           
        }
    }

}