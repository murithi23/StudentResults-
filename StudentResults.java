import java.util.Scanner;


public class StudentResults{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.print("Enter student name: ");
      String name = input.nextLine();
      System.out.print("Enter Roll No: ");
      int rollNo = input.nextInt();
      System.out.print("Enter Semester: ");
      String semester = input.nextLine();
      System.out.print("Enter marks for database: ");
      int databaseMarks = input.nextInt();
      System.out.print("Enter marks for systems: ");
      int systemMarks = input.nextInt();
      System.out.print("Enter marks for algorithm: ");
      int algorithmMarks = input.nextInt();
      System.out.print("Enter marks for statistics: ");
      int statisticsMarks = input.nextInt();

     int  total =databaseMarks + systemMarks + algorithmMarks + statisticsMarks;
      double average= total/4.0;
      String grade;

      if(average>=70){
      grade="A";
      }else if(average>=60){
          grade="B";
      }else if(average>=50){
          grade="C";
      }else if(average>=40){
          grade="D";
      }else {
          grade="F";
      }
      System.out.println("\n----------------------------------------------------------");
      System.out.println("Department of Computer Science");
      System.out.println("End of semester results");
      System.out.println("------------------------------------------------------------");
      System.out.println("Name: "+name + "\t Roll No: "+rollNo+"\t Semester: "+semester);
      System.out.println("------------------------------------------------------------");
      System.out.println("Unit Code\tUnit Name\tScore");
      System.out.println("------------------------------------------------------------");
      System.out.printf("CCS2101\t\tDatabase\t\t%d\n",databaseMarks);
      System.out.printf("CCS2102\t\tSystems\t\t\t%d\n",systemMarks);
      System.out.printf("CCS2103\t\tAlgorithm\t\t%d\n",algorithmMarks);
      System.out.printf("CCS2104\t\tStatistics\t\t%d\n",statisticsMarks);
      System.out.println("-------------------------------------------------------------");
      System.out.printf("Total\t\t\t\t%d\n",total);
      System.out.printf("Average\t\t\t\t%.2f\n",average);
      System.out.printf("Grade\t\t\t\t%s\n",grade);
      System.out.println("--------------------------------------------------------------");
      System.out.println("Grading criteria: ");
      System.out.println("A: 70-100\tB: 60-69\tC: 50-59\tD: 40-49\tF: Below 40");
      System.out.println("-------------------------------------------------------------");

   input.close();

  }

}
