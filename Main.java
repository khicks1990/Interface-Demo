public class Main
{
   public static void main(String[] args)
   {
      // Create an instance of the Person class.
     FinalExam3 exam1 = new FinalExam3(100, 5);
     FinalExam3 exam2 = new FinalExam3(100, 10);
     FinalExam3 exam3 = new FinalExam3(100, 15);     
     FinalExam3 exam4 = new FinalExam3(100, 15);

     System.out.println("Exam 1: " + exam1.getScore() + 
                         "\n Exam 2: " + exam2.getScore() +
                         "\n Exam 3: " + exam3.getScore() +
                         "\n Exam 4: " + exam4.getScore() +"\n");
     if (exam1.equals(exam2))
     System.out.println("Exams 1 and 2 are equal.");
        else
     System.out.println("Exams 1 and 2 are not equal.");

     if (exam3.equals(exam4))
     System.out.println("Exams 3 and 4 are equal.");
        else
     System.out.println("Exams 3 and 4 are not equal.");

   if (exam2.isGreater(exam3))
    System.out.println("Exam 2 is greater than exam 3.");
       else
    System.out.println("Exam 2 is not greater than exam 3.");

   if (exam3.isLess(exam2))
    System.out.println("Exam 3 is less than exam 2.");
       else
    System.out.println("Exam 3 is not less than exam 2.");
}
}