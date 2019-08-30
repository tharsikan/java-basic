import java.util.LinkedList;
// import java.util.Scanner;
class TimeAlign{
    private LinkedList<Process> prosArray = new LinkedList<Process>();
    private LinkedList<Process> availProsArray = new LinkedList<Process>();
    LinkedList<Process> temp = prosArray;
    double currentTime = 0;
    void giveProcess(int Arival, int Burst, String name){
        Process p = new Process();
        p.setArivalTime(Arival);
        p.setBurstTime(Burst);
        p.setpName(name);
        prosArray.add(p);
    }

    void getAvailProcess(){
        int len = prosArray.size();
        for (int i = 0; i < len; i++) {
            Process p = prosArray.get(i);
            if(p.getArivalTime() >= currentTime){
                availProsArray.add(p);
            }
        }
        
    }
    Process minBurstTimeProcessAvail(){
        int len = availProsArray.size();
        Process p1 = availProsArray.get(0);
        double minTime = p1.getBurstTime();
        for (int i = 1; i < len; i++) {
            Process p = availProsArray.get(i);
            if(minTime >= p.getBurstTime()){
                minTime = p.getBurstTime();
            }
        }
        for (int i = 0; i < len; i++) {
            Process p = availProsArray.get(i);
            if(minTime == p.getBurstTime()){
                return p;
            }
        }
        return null;
    }
    Process minArivalProcessAvail(){
        int len = availProsArray.size();
        Process p1 = availProsArray.get(0);
        double minTime = p1.getArivalTime();
        for (int i = 1; i < len; i++) {
            Process p = availProsArray.get(i);
            if(minTime >= p.getArivalTime()){
                minTime = p.getArivalTime();
            }
        }
        for (int i = 0; i < len; i++) {
            Process p = availProsArray.get(i);
            if(minTime == p.getArivalTime()){
                return p;
            }
        }
        return null;
    }
    Process minArivalProcessTemp(){
        int len = temp.size();
        Process p1 = temp.get(0);
        double minTime = p1.getArivalTime();
        for (int i = 1; i < len; i++) {
            Process p = temp.get(i);
            if(minTime >= p.getArivalTime()){
                minTime = p.getArivalTime();
            }
        }
        for (int i = 0; i < len; i++) {
            Process p = temp.get(i);
            if(minTime == p.getArivalTime()){
                return p;
            }
        }
        return null;
    }

    void runProcess(){
        if(availProsArray.size()==1){
            temp.remove(0);
            //System.out.println (availProsArray.get(0).getArivalTime() + availProsArray.get(0).getBurstTime());
            if(availProsArray.get(0).getBurstTime() < minArivalProcessTemp().getArivalTime()){
                System.out.println(availProsArray.get(0).getpName());
                currentTime += availProsArray.get(0).getBurstTime();
                availProsArray.remove(0);
            }
            else{
                if(minArivalProcessTemp().getBurstTime() < (availProsArray.get(0).getBurstTime() - minArivalProcessTemp().getArivalTime() ) ){
                    currentTime += minArivalProcessTemp().getArivalTime();
                    System.out.println(availProsArray.get(0).getpName());
                    availProsArray.get(0).setBurstTime(availProsArray.get(0).getBurstTime()-minArivalProcessTemp().getArivalTime());
                }else{
                    currentTime += minArivalProcessTemp().getArivalTime();
                    System.out.println(availProsArray.get(0).getpName());
                    availProsArray.get(0).setBurstTime(availProsArray.get(0).getBurstTime()-minArivalProcessTemp().getArivalTime());
                }
                
            }
            
        }else{

        }
    }



}
class Process{
    private String pName;
    private double ArivalTime;
    private double BurstTime;
    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }
    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }
    /**
     * @param arivalTime the arivalTime to set
     */
    public void setArivalTime(double arivalTime) {
        ArivalTime = arivalTime;
    }
    /**
     * @param burstTime the burstTime to set
     */
    public void setBurstTime(double burstTime) {
        BurstTime = burstTime;
    }
    /**
     * @return the arivalTime
     */
    public double getArivalTime() {
        return ArivalTime;
    }
    /**
     * @return the burstTime
     */
    public double getBurstTime() {
        return BurstTime;
    }
}
class myxMain{
    public static void main(String[] args) {
        TimeAlign ta = new TimeAlign();
        ta.giveProcess(0, 7, "p1");
        ta.giveProcess(2, 5, "p2");
        ta.giveProcess(4, 1, "p3");
        ta.giveProcess(5, 4, "p4");
        ta.runProcess();
    }
}