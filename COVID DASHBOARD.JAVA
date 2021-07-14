//COVID DASHBORD PROJECT IN JAVA
import java.util.Scanner;
class Covid{
    int positive=-1,negative=0,discharges=0,active_cases=0,deaths=0,covid_testing_kits=8000,tests=0,total_tested=0,prev_active=0;
    int active[]=new int[1000];
   
   Scanner m = new SCanner(System.in);
   void testing(){
      enum{positive=0,negative};
     this.tests++;
     this.covid_testing_kits--;
     System.out.println("enter positive or negative");
      int n=m.nextInt();
     if(n==positive){
        this.active[++this.positive]=1;  
     }  
     else{
    this. negative++}
   
   }
  
   void add(){
       System.out.println("enter no of positive cases added");
       int n=m.nextInt();
       for(i=0;i<=n;i++){
        this.tests++;
     this.covid_testing_kits--;
       this.active[++this.positive]=1;
        }
        
       void discharge(){
          System.out.println("enter no of patients discharged");
          int n=m.nextInt();
       for(i=0;i<=n;i++){
        this.discharges++;
        this.active_cases--;   
       }
       }
   }
    void active_cases(){
         active_cases = this.prev_active+this.positive+1;
        
    }
    void death(){
        this.death++;
        int h=this.active[this.positive--];
    }
    void covid_dashbord(){
        System.out.println("_______________________________________________________________________");
        System.out.println("no of tests performed today           :  "+this.tests);
        System.out.println("_______________________________________________________________________");
        System.out.println("positive cases                        :  "+this.positive);
        System.out.println("_______________________________________________________________________");
        System.out.println("discharged                            :  "+this.discharges);
        System.out.println("_______________________________________________________________________");
        System.out.println("deaths                                :  "+this.deaths);
        System.out.println("_______________________________________________________________________");
        System.out.println("no of covid testing kits in stock     :  "this.covid testing kits);
        System.out.println("_______________________________________________________________________");
        System.out.println("total active cases                    :  "+this.active_cases);
        System.out.println("_______________________________________________________________________");
        
    }
    void hospital_particular(){
         int option=5;
         enum{add=1,discharge,active_cases,death,dashboard};
        while(option!=0){
            switch(option){
                case add:this.add();
                break;
                case discharge:this. dischrge();
                 break;
                case active_cases: this.active_cases();
                 break;
                case death : this.death();
                 break;
                 case dashboard: this.dashboard();
            }
            System.out.println("enter your option:");
            System.out.println("1:add a positive case/t/t2:discharge a covid patient/t/t3:print active cases/t/t4:add deaths/t/t5:dashboard");
            
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		covid hospital1=new covid();
		hospital1.hospital_particular();
	}
}
