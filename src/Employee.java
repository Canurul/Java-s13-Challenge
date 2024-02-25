import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;
    private Plan plan;

public Employee(long id, String fullName, String password, String email, Plan plan){
    this.id = id;
    this.fullName = fullName;
    this.password = password;
    this.email = email;
    this.healthplans = new String[4];
    this.plan = plan;

}
 public long getId(){
    return this.id;
 }
 public String getFullName(){
return this.fullName;
 }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }
    public void addHealthplan(int index, Plan plan) {
        if (index >= 0 && index < healthplans.length) {
            if (healthplans[index] == null) {
                healthplans[index] = plan;
            } else {
                System.out.println("Bu index dolu, lütfen başka bir index deneyin.");
            }
        } else {
            System.out.println("Geçersiz index, lütfen doğru bir index değeri girin.");
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }

}

