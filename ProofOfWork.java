import utils.MDutil;

public class ProofOfWork {
	
	public static void main(String[] args) {
		proofOfWork();
	}

	// Define proofOfWork function

	public static void proofOfWork() {
		String data = "pseudoyu";
		int x = 0;
		while(true) {

			// Generate SHA256 and compare the first 0s

			if (!MDutil.SHA256(data + x).substring(0, 6).equals("000000")) {
				x += 1;
			} else {
				System.out.println(MDutil.SHA256(data + x));
				System.out.println("Using " + x + " times");
				break;
			}
		}
	}
}