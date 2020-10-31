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

	public boolean validateChain() {
		if (chain.size() == 1) {
			if(!chain.get(0).hash.equals(chain.get(0).computeHash())){
                return false;
            }
			return true;
		}

		for (int i = 1; i <= chain.size() - 1; i++) {
			Block blockToValidate = chain.get(i);

			if(!blockToValidate.hash.equals(blockToValidate.computeHash())) {
				System.out.println("Date tampered!");
				return false;
			}

			Block previuosBlock = chain.get(i-1);
			if (!blockToValidate.previousHash.equals(previuosBlock.hash)) {
				System.out.println("Blockchain break!");
				return false;
			}
		}
		return true;
	}
	
	}