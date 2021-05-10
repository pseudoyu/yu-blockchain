# 从零开始实现一个区块链

在学习区块链过程中，通过Java实现了一个简易的区块链，主要完成了区块结构、区块链结构、工作量证明几个核心功能，加深自己对原理的学习理解。

实现功能很简单，目录结构如下：
```
.
├── Block.java
├── Chain.java
├── Main.java
├── ProofOfWork.java
├── README.md
└── utils
    └── MDutil.java
```
- `MDutil.java`为外部导入的MD函数
- `Block.java`实现了区块核心元素定义与简易哈希运算
- `Chain.java`实现了区块链式结构的定义（包括创世区块等）
- `ProofofWork.java`实现了工作量证明机制功能（挖矿）
- `Main.java`为程序主入口

