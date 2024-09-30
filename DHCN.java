public class DHCN {

    class Person {
        private String fullName;
        private String dateOfBirth;


        public Person(String fullName, String dateOfBirth) {
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
        }

        public String getFullName() {
            return fullName;
        }
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String Information() {
            return "Full Name: " + fullName + ", Date of Birth: " + dateOfBirth;
        }

    }



    class Lecturer extends Person {
        public Lecturer(String fullName, String dateOfBirth) {
            super(fullName, dateOfBirth);
        }
    }

    class Student extends Person {
        private String studentID;

        public Student(String fullName, String dateOfBirth, String studentID) {
            super(fullName, dateOfBirth);
            this.studentID = studentID;
        }

        public String getStudentID() {
            return studentID;
        }

        public String Information() {
            return super.Information() + ", Student ID: " + studentID;
        }

    }

    public static void main(String[] args) {
        DHCN dhcn = new DHCN();

        Student S1 = dhcn.new Student("Nguyen Van A", "18/02/2005", "23020550");

        Lecturer L1 = dhcn.new Lecturer("Nguyen Thi B", "22/01/1950");

        System.out.println(S1.Information());
        System.out.println(L1.Information());
    }
}
