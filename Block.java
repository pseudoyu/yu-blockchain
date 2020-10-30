import java.util.ArrayList;
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
		return utils.MDutil.SHA256(this.data + this.previousHash);
	}

	public static void main(String[] args) {
		System.out.println("It works!");
		// Block block = new Block("Transfer 10 dollar", "123");
		// System.out.println("Block: " + block.data);
		// System.out.println("previousHash: " + block.previousHash);
		// System.out.println("hash: " + block.hash);
	}
}