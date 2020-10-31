public class Main {
	public static void main(String[] args) {
        Chain yuBlockChain = new Chain();

        Block block1 = new Block("Transfer 10 dollar", "");
        yuBlockChain.addBlockToChain(block1);
        Block block2 = new Block("Transfer 10 * 10 dollar", "");
        yuBlockChain.addBlockToChain(block2);
        System.out.println(yuBlockChain.validateChain());
		
		// Tamper yuBlockChain with hash

		// yuBlockChain.chain.get(1).data="Transfer 10 * 10 dollar";
		// yuBlockChain.chain.get(1).mine(4);
        // System.out.println(yuBlockChain);
		// System.out.println(yuBlockChain.validateChain());
	}
}