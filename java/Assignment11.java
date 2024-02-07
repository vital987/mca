class College {
    static String collegeName = "Government College of Engineering";
    String department;

    College(String DEPARTMENT) {
        this.department = DEPARTMENT;
    }

    String getDept() {
        return this.department;
    }
}

public class Assignment11 extends College {
    Assignment11(String DEPARTMENT) {
        super(DEPARTMENT);
    }

    public static void main(String[] args) {
        System.out.println("College Name: " + collegeName);
        College mca = new College("MCA");
        System.out.println("Department: " + mca.getDept());
    }
}

/* OUTPUT
College Name: Government College of Engineering
Department: MCA
*/