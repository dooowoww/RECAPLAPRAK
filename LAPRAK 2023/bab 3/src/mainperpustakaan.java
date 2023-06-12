import java.io.IOException;

public class mainperpustakaan {
    public static void main(String[] args) throws IOException {
        Perpustakaan teknologi1 = new Perpustakaan("Teknologi","Pengantar Teknologi Informasi","Tata Sutabri","Sebuah buku yang menjelaskan tentang konsep teknologi\n"+"\t\t\t teknologi informasi.");
        Perpustakaan filsafat1  = new Perpustakaan("Filsafat","Le Petit Prince","Antonie de Saint-Exupery","Buku ini ditulis untuk menampar orang-orang dewasa yang\n"+"\t\t\t tetapi cukup dengan kepolosan layaknya anak kecil.");
        Perpustakaan sejarah1   = new Perpustakaan("Sejarah","Di Bawah Bendera Revolusi","Soekarno","Buku yang menghimpun tulisan tulisan Bung Karno dalam\n"+"\t\t\t masa revolusi menuju Indonesia merdeka");
        Perpustakaan agama1     = new Perpustakaan("Agama","No god bu God", "Reza Aslan","Buku ini berisi tentang islam merupakan agama yang\n"+"\t\t\t sungguh damai, memanusiakan manusia dan\n"+"\t\t\t melindungi orang yang miskin dan yatim piatu.");
        Perpustakaan psikologi1 = new Perpustakaan("Psikologi","Psikologi Perilaku","Richard Gross","Buku yang didalamnya memuat informasi tentang teori\n"+"\t\t\t dalam komunikasi yang dilatarbelakangi konsep\n"+"\t\t\t konsep psikologi tentang manusia.");
        Perpustakaan politik1   = new Perpustakaan("Politik","Sistem Politik Indonesia","Tere Liye","Buku ini menjelaskan dengan sangat rinci mengenai\n"+"\t\t\t hal-hal yang berkaitan dengan sistem politik\n"+"\t\t\t yang ada di Indonesia.");
        Perpustakaan fiksi1     = new Perpustakaan("Fiksi","Bumi","Tere Liye","Berkisah tentang kehidupan seorang remaja perempuan\n"+"\t\t\t bernama Raib yang memiliki kemampuan unik.");
        System.out.println("=========== W E L C O M E T O M Y L I B R A R Y ==========");
        System.out.println();
        System.out.println();  
        System.out.println("=========== T E K N O L O G I ==========");
        teknologi1.displayMessage();
        teknologi1.hitungRoyalti(50000);
        teknologi1.hitungRoyalti(50000, 15);
        System.out.println();
        System.out.println("=========== F I L S A F A T ==========");
        filsafat1.displayMessage();
        filsafat1.hitungRoyalti(90000);
        filsafat1.hitungRoyalti(90000, 10);
        System.out.println("=========== S E J A R A H ==========");
        sejarah1.displayMessage();
        System.out.println();
        System.out.println("=========== A G A M A ==========");  
        agama1.displayMessage();
        System.out.println();
        System.out.println("=========== P S I K O L O G I ==========");
        psikologi1.displayMessage();
        System.out.println();
        System.out.println("=========== P O L I T I K ==========");
        politik1.displayMessage();
        System.out.println();
        System.out.println("=========== F I K S I ==========");
        fiksi1.displayMessage();
        System.out.println();
        System.out.println("##### TINGKAT KESAMAAN BUKU #####");
        politik1.hitungTingkatKesamaan(fiksi1)
        System.out.println();
        System.out.printlnt("#### METHOD COPY #####");
        teknologi1.copy(filsafat1);
        filsafat1.copy(sejarah1);
        sejarah1.copy(agama1);
        System.out.println();
        System.out.println("=========== B A C A F I L E ==========");
        Perpustakaan coba + new Perpustakaan();
        coba.bacaFile();
        System.out.println();

        System.out.println("=========== S I M P A N F I L E ==========");
        coba.simpanFile(teknologi1, filsafat1, sejarah1, agama1, psikologi1, politik1, fiksi1);
        System.out.println();
    }

}
