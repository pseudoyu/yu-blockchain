import java.util.ArrayList;
import java.util.List;
import utils.MDutil;

class Chain {

	List<Block> chain = new ArrayList<>();

	public Chain() {
		chain.add(bigBang());
	}

	public Block bigBang() {
		Block genesisBlock = new Block("I'm the genesis block", "");
		return genesisBlock;
	}

	public static void main(String[] args) {
		System.out.println("It works!");
	}
	}
}