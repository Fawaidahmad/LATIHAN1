import java.util.Scanner;

public class ProgramLogin {
    public static void main(String[] args) {
        // Inisialisasi username dan password
        String username = "user";
        String password = "password";

        // Meminta input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Memeriksa kecocokan username dan password
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Username atau password salah. Silakan coba lagi.");
        }
    }
}