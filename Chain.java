import java.util.ArrayList;
import java.util.List;
import utils.MDutil;

class Chain {

	List<Block> chain = new ArrayList<>();

	public Chain() {
		chain.add(bigBang());
	}

	public Block bigBang() {
		Block genesisBlock = new Block("I'm the genesis haha", "");
		return genesisBlock;
	}

	public Block getLatestBlock() {
		return chain.get(chain.size()-1);
	}
	public void addBlockToChain(Block newBlock) {
		newBlock.previousHash = getLatestBlock().hash;
		newBlock.hash = newBlock.computeHash();
		chain.add(newBlock);
	}

	public static void main(String[] args) {
		// System.out.println("It works!");
		Chain yuChain = new Chain();
		Block block1 = new Block("Transfer 10 dollar", "123");
		yuChain.addBlockToChain(block1);

		System.out.println("Block: " + block1.data);
		System.out.println("previousHash: " + block1.previousHash);
		System.out.println("hash: " + block1.hash);
	}
	}