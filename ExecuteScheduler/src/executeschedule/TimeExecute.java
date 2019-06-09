package executeschedule;

import java.io.IOException;
import java.util.TimerTask;

public class TimeExecute extends TimerTask {
//	private String command;
	public static int count = 0;

	public TimeExecute() {
		super();
	}

	@Override
	public void run() {
		// Ini yang akan di eksekusi
		try {
			Process process = Runtime.getRuntime().exec("echo q | htop | aha --black --line-fix > htop"+count+++".html");
//			System.out.println(++count);
//			StringBuilder output = new StringBuilder();
//
//			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//
//			String line;
//			while ((line = reader.readLine()) != null) {
//				System.out.println("- "+line);
//				output.append(line + "\n");
//			}
//
//			int exitVal = process.waitFor();
//			if (exitVal == 0) {
////				System.out.println("Success!");
////				System.out.println(output);
//				System.exit(0);
//			} else {
//				// abnormal...
//			}
		}catch(IOException e) {
			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}
}


//if ("do1".equalsIgnoreCase(nama)) {
//System.out.println(++count +". "+nama + " task selesai di eksekusi " + new Date());
//try {
//	Thread.sleep(5000);
//	count = count + 1;
//} catch (InterruptedException e) {
//	e.printStackTrace();
//}
//}