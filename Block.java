import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Block {

	String hash;
	String data;
	String previousHash;
	int nonce;

	public Block(String data, String previousHash) {
		this.data = data;
		this.previousHash = previousHash;
		this.hash = this.computeHash();
	}

	public String computeHash() {
		return utils.MDutil.SHA256(Arrays.toString(this.data) + this.previousHash + this.nonce);
	}

	public String getAnswer(int difficulty) {
		String answer = "";
		for (int i = 0; i < difficulty; i++) {
			answer = answer + "0";
		}
		return answer;
	}

	public void mine(int difficulty) {
		while (true) {
			hash = computeHash();
			if (!hash.substring(0, difficulty).equals(getAnswer(difficulty))) {
				nonce ++;
				this.hash = this.computeHash();
			} else {
				break;
			}
		}
		System.out.println("Mining Done! " + this.hash);
	}
}