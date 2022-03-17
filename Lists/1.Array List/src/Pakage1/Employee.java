package Pakage1;

public class Employee {
    int EmpId;
    String name;
    String Tech;

    Employee() {
        EmpId = 0;
    }

    Employee(int EmpId, String name, String Tech) {
        this.EmpId = EmpId;
        this.name = name;
        this.Tech = Tech;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return Tech;
    }

    public void setTech(String tech) {
        Tech = tech;
    }

    @Override
    public String toString() {
        return "Pakage1.Employee{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", Tech='" + Tech + '\'' +
                '}';
    }
}
