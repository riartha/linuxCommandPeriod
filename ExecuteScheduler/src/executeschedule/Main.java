package executeschedule;

import java.util.Timer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Instansiasi kelas agar bisa dijalankan perintah kelasnya
		TimeExecute time1 = new TimeExecute();
		
		// instansiasi timer
		Timer t = new Timer();
		
		// Perintah dijalankan setiap 20 sec, dimulai dari detik 1
		t.scheduleAtFixedRate(time1, 0, 20000);
		
		// Perintah dalam kondisi idle saat timer pada detik ke 60
		Thread.sleep(60000);
		
		// Timer dihentikan, otomatis perintah tidak akan berjalan lagi
		t.cancel();
	}
}

//System.out.println(TimeExecute.getCount());
//t.scheduleAtFixedRate(time2, 0, 1000);