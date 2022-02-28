package com;


public class VsoftCompany
{
    String President;
   /* String Managers;
    String Developers;*/

    public VsoftCompany(String President)//,String Manager,String Developers)
    {
        this.President = President;
        //this.Managers = Manager;
        //this.Developers = Developers;
    }

    void display()
    {
        System.out.println("President is :" + President);
        System.out.println(" ");
    }
}
/*
class Manager extends VsoftCompany
{
    int Managers = 7;
    public Manager(String President,int managers) {
        super(President);
    }
    void display1()
    {
        System.out.println("Number of managers in each department under President :" + Managers );
    }
}
*/


class Departments extends VsoftCompany
{
    int SevriceNow = 3;
    int Azure = 2;
    int Aws = 5;
    int Java = 1;
    int MuleSoft = 6;

    public Departments(String President, String Managers, String departments)
    {
        super(President);
    }

    void d1()
    {
        System.out.println("Service now department has" + " " + SevriceNow + " " + "managers");
        System.out.println(" ");
        System.out.println("Azure department has " + " " + Azure + " " + "managers");
        System.out.println(" ");
        System.out.println("AWS department has " + " " + Aws + " " + "managers");
        System.out.println(" ");
        System.out.println("Java department has " + " " + Java + " " + "managers");
        System.out.println(" ");
        System.out.println("Mulesoft department has " + " " + MuleSoft + " " + "managers");
        System.out.println(" ");
        System.out.println("Total Number of managers in each department under President : " + (SevriceNow + Azure + Aws + Java + MuleSoft));
        System.out.println(" ");
    }

}
class  Developers extends VsoftCompany
{
    int SevriceNowDevelopers = 22;
    int AzureDevelopers = 12;
    int AwsDevelopers = 56;
    int JavaDevelopers = 32;
    int MuleSoftDevelopers = 15;
    public Developers(String President,String departments,String Developers)
    {
        super(President);
    }
    void f1()
    {
        System.out.println("Service now department has" + " " + SevriceNowDevelopers + " " + "developers");
        System.out.println(" ");
        System.out.println("Azure department has " + " " + AzureDevelopers + " " + "developers");
        System.out.println(" ");
        System.out.println("AWS department has " + " " + AwsDevelopers + " " + "developers");
        System.out.println(" ");
        System.out.println("Java department has " + " " + JavaDevelopers + " " + "developers");
        System.out.println(" ");
        System.out.println("Mulesoft department has " + " " + MuleSoftDevelopers + " " + "developers");
        System.out.println(" ");
        System.out.println("Total Number of Developers in each department under Managers : " + (SevriceNowDevelopers + AzureDevelopers + AwsDevelopers + JavaDevelopers + MuleSoftDevelopers));
        System.out.println(" ");
    }
}


class main1
{

    public static void main(String[] args)
    {
        VsoftCompany v1 = new VsoftCompany("PoornaVeer");
        v1.display();
        /*Manager m1 = new Manager("President",7);
        m1.display1();*/
        Departments d2 = new Departments("President","Managers","Departments");
        d2.d1();
        Developers f3 = new Developers("President","Departments","Developers");
        f3.f1();
    }
}