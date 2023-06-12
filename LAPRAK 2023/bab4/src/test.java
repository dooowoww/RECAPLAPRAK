public class test {
    public static void main(String[] args) {
        Student s1 = new Student("Aldo", 19);

        String studentName = s1.getName(); // menggunakan getter untuk mengambil nilai dari variabel name
        int studentMark = s1.getMark(); // menggunakan getter untuk mengambil nilai dari variabel mark

        System.out.println("Name: " + studentName);
        System.out.println("Mark: " + studentMark);
    }
}
