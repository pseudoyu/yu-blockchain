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
}