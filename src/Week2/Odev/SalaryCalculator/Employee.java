package Week2.Odev.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if (this.salary>1000){
            return this.salary*0.03;
        } else {
            return 0;
        }
    }
    public double bonus(){
        int extraHours = this.workHours-40;
        double bonus = 0;
        if(this.workHours>40) {
            bonus = extraHours * 30;
        }
        return bonus;
    }
    public double raiseSalary(){
        int serviceTime = 2021 - this.hireYear;

        if (serviceTime < 10){
            return this.salary * 0.05;
        } else if (serviceTime > 9 && serviceTime < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
    @Override
    public String toString() {
        double tax,bonus,raiseSalary,salaryWithBonusses,totalSalary;
        tax = tax();
        bonus = bonus();
        raiseSalary = raiseSalary();
        salaryWithBonusses = this.salary + tax + bonus;
        totalSalary = this.salary + tax + bonus + raiseSalary;

        return ("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax + "\nBonus : "+ bonus + "\nMaaş Artışı : " +
                raiseSalary + "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithBonusses +"\nToplam Maaş : " + totalSalary);
    }
}
