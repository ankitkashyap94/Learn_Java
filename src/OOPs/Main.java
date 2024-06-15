package OOPs;

public class Main {

    public static void main(String[] args) {

     /*  var textbox1 = new TextBox();
       var textbox2 = textbox1;
       textbox2.setText("Hello World !!");
        System.out.println(textbox1.text);*/

      /*  var browser = new Browser();
        browser.navigate();*/
        new Employee(10_000);
        Employee emp = new Employee(50_000, 0);
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        int wage = emp.calculateWage();
        System.out.println(wage);






    }



}
