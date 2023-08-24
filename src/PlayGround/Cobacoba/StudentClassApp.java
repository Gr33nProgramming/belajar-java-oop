package PlayGround.Cobacoba;

public class StudentClassApp {
    public static void main(String[] args) {
        StudentClass studentData = new StudentClass();
        StudentMembers membersData = new StudentMembers();

        membersData.setName("Bintang");
        membersData.setAge(18);
        membersData.setGrade(90);
        membersData.setHoby("Learning");
        membersData.showData();
    }
}
