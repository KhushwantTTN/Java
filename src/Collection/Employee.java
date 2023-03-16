package Collection;

class Employee implements Comparable<Employee> {
    private Double age;
    private Double salary;
    private String name;


    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }


    public Double getAge() {
        return age;
    }


    public Double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.getName());
    }
}

